package com.example.sweater.controller;

//import com.example.sweater.Server.pop3Virt.POP3ConcurServer;
import com.example.sweater.domain.POP3user;
import com.example.sweater.domain.User;
import com.example.sweater.domain.VirtualUser;
import com.example.sweater.repos.MessageRepo;
import com.example.sweater.repos.UserRepo;
import com.example.sweater.repos.VirtuaUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
public class UsersController {

    @Autowired
    private VirtuaUser virtuaUser;
    @Autowired
    private MessageRepo messageRepo;

    @Value("${upload.path}")
    private String uploadPath;
    private Iterable<VirtualUser> messages;


    @GetMapping("/user")
    public String main(
            @RequestParam(name="id",required = false, defaultValue = "-1") Long id, Model model) {
        System.out.println("id="+id);
        if(id==-1){
            System.out.println("-1");
            Iterable<VirtualUser> virtuauser = virtuaUser.findAll();
            List<POP3user> smtpList = (List<POP3user>) messageRepo.findAll();
            messages = virtuaUser.findAll();
            model.addAttribute("virtuausers", virtuauser);
            model.addAttribute("filter", id);

            model.addAttribute("smtpList", smtpList);
            System.out.println("smtpList"+ smtpList.size());

            return "user";}
        else{
            List<VirtualUser> messages = null;
            // virtuaUser.fi(Long.parseLong(id));
            String name;

            VirtualUser message=virtuaUser.findById(id).get();
            name=message.getUsername();
            File file=new File("D:\\MailBox\\"+name);
            file.delete();
            virtuaUser.delete(message);
            messages = virtuaUser.findAll();
            messages = virtuaUser.findAll();
            model.addAttribute("virtuausers", messages);
            List<POP3user> smtpList = (List<POP3user>) messageRepo.findAll();
            model.addAttribute("smtpList", smtpList);
            model.addAttribute("filter", id);
//            POP3ConcurServer.virtualUsers=virtuaUser.findAll();


            System.out.println("!$!"+ virtuaUser);
            return "user";
        }
    }

//    @GetMapping("/user")
//    public String group(@RequestParam(required = false, defaultValue = "") String filter, Model model) {
//        List<VirtualUser> messages = null;
//          messages = virtuaUser.findAll();
//
//        model.addAttribute("virtuausers", messages);
//        model.addAttribute("filter", filter);
//
//        return "user";
//    }

    @PostMapping("/user")
    public String add(
            @AuthenticationPrincipal VirtualUser user,
            @RequestParam String login,
            @RequestParam String password,
            @RequestParam String smtp,
            Map<String, Object> model

    ) throws IOException {
        String path="D:\\MailBox\\";
        File file=new File(path+login);
        file.mkdir();

        System.out.println("login=" + login + " password=" + password + " smtp=" + smtp);

            VirtualUser message = new VirtualUser(login, password,smtp);
        virtuaUser.save(message);
        Iterable<VirtualUser> messages = virtuaUser.findAll();
        model.put("virtuausers", messages);
        List<POP3user> smtpList = (List<POP3user>) messageRepo.findAll();
        model.put("smtpList", smtpList);
        System.out.println("add");
        System.out.println("users virt");
  //      POP3ConcurServer.virtualUsers=virtuaUser.findAll();
        return "user";


    }


}
