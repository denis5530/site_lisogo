package com.example.sweater.controller;

import com.example.sweater.domain.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GroupController {


    @Value("${upload.path}")
    private String uploadPath;
    private Iterable<Group> groups;



    @GetMapping("/group")
    public String group(@RequestParam(required = false, defaultValue = "") String filter, Model model) {
//        Iterable<Group> groups = messageRepo.findAll();
//        groups = messageRepo.findAll();
//        model.addAttribute("groups", groups);
//        model.addAttribute("filter", filter);

        return "group";
    }

//    @PostMapping("/group")
//    public String add(
//            @AuthenticationPrincipal User user,
//            @RequestParam String login,
//            @RequestParam String password,
//            @RequestParam String smtp,
//            @RequestParam String smtpport,
//            @RequestParam String pop3,
//            @RequestParam String pop3Port,
//            Map<String, Object> model
//
//    ) throws IOException {
//        Iterable<POP3user> loginTry = messageRepo.findByLogin(login);
//        System.out.println(((List<POP3user>) loginTry).size()+"   login");
//        if(((List<POP3user>) loginTry).size()>0){
//            System.out.println(login+"   login");
//            return "group";
//        }
//        else{
//        POP3user message = new POP3user(login, password,smtp,smtpport,pop3,pop3Port, user);
//        messageRepo.save(message);
//        Iterable<POP3user> messages = messageRepo.findAll();
//        model.put("messages", messages);
//        System.out.println("add");
//        return "group";
//    }
//
//    }


}
