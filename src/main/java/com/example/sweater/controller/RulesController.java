package com.example.sweater.controller;

import com.example.sweater.domain.POP3user;
import com.example.sweater.domain.Rules;
import com.example.sweater.domain.User;
import com.example.sweater.domain.VirtualUser;
import com.example.sweater.repos.MessageRepo;

import com.example.sweater.repos.RuleRepo;
import com.example.sweater.repos.VirtuaUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
public class RulesController {


    @Value("${upload.path}")
    private String uploadPath;
    private Iterable<POP3user> messages;
    @Autowired
    private VirtuaUser virtuaUser;
    @Autowired
    private MessageRepo messageRepo;
    @Autowired
    private RuleRepo roleRepo;


    @GetMapping("/rules")
    public String main(
            @RequestParam(name="id",required = false, defaultValue = "-1") Long id, Model model) {
        System.out.println("id="+id);
        if(id==-1){
            Iterable<POP3user> messages =null;
            messages = messageRepo.findAll();
            Iterable<VirtualUser> virtUser =null;
            virtUser = virtuaUser.findAll();
            Iterable<Rules> rules1 =null;
            rules1 = roleRepo.findAll();
            model.addAttribute("rule", rules1);
            model.addAttribute("virtList", virtUser);
            model.addAttribute("smtpList", messages);

            return "rules";}
        else{
            List<Rules> rules = null;
            rules= (List<Rules>) roleRepo.findAll();


            Rules message=roleRepo.findById(id).get();

            roleRepo.delete(message);

            Iterable<POP3user> messages =null;
            messages = messageRepo.findAll();
            Iterable<VirtualUser> virtUser =null;
            virtUser = virtuaUser.findAll();
            Iterable<Rules> rules1 =null;
            rules1 = roleRepo.findAll();
            model.addAttribute("rule", rules1);
            model.addAttribute("virtList", virtUser);
            model.addAttribute("smtpList", messages);
            return "rules";
        }
    }


    @PostMapping("/rules")
    public String add(
            @AuthenticationPrincipal User user,
            @RequestParam String from,
            @RequestParam String to,
            @RequestParam String in,
            Map<String, Object> model

    ) throws IOException {
        Iterable<Rules> role =roleRepo.findAll() ;

        Rules rules = new Rules(from,to,in);
        roleRepo.save(rules);
         role =roleRepo.findAll() ;

        Iterable<POP3user> messages =null;
        messages = messageRepo.findAll();
        Iterable<VirtualUser> virtUser =null;
        virtUser = virtuaUser.findAll();
        Iterable<Rules> rules1 =null;
        rules1 = roleRepo.findAll();
        model.put("rule", rules1);
        model.put("virtList", virtUser);
        model.put("smtpList", messages);
        return "rules";
    }



    //@PostMapping(value="/main", method = RequestMethod.DELETE)

//    @DeleteMapping("/main/{id}")
//    public ResponseEntity deleteBook(@PathVariable(value = "id") Long id) throws Exception {
//
//        System.out.println(id+" id");
//        return ResponseEntity.ok().build();
//    }

//    @GetMapping("/main/{id}")
//    public String delete(
//
//            @ModelAttribute("CustomersDelete") POP3user user,
//            Map<String, Object> model
//
//    ) throws IOException {
//      //  POP3user message ;
//        System.out.println(user.getLogin()+"   login");
//       // messages = messageRepo.findByLogin(login);
////        if(((List<POP3user>) messages).size()>0){
////        message=((List<POP3user>) messages).get(0);
////
////        messageRepo.delete(message);
//        ((List<POP3user>) messages).get(1).setLogin("ttt");
//       model.put("messages", messages);
//    //}
//        return "main";
//    }
}
