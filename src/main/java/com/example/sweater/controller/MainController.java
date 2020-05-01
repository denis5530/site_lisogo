package com.example.sweater.controller;

import com.example.sweater.domain.POP3user;
import com.example.sweater.domain.User;
import com.example.sweater.repos.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {
    @Autowired
    private MessageRepo messageRepo;

    @Value("${upload.path}")
    private String uploadPath;
    private Iterable<POP3user> messages;

    @GetMapping("/")
    public String greeting(Map<String, Object> model) {
        return "main";
    }

    @GetMapping("/main")
    public String main(
            @RequestParam(name="id",required = false, defaultValue = "0") String filter, Model model) {

            return "main";
        }


    @PostMapping("/main")
    public String add(
            @AuthenticationPrincipal User user,
            @RequestParam String login,
            @RequestParam String password,
            @RequestParam String smtp,
            @RequestParam String smtpport,
            @RequestParam String pop3,
            @RequestParam String pop3Port,
            Map<String, Object> model

    ) throws IOException {
        Iterable<POP3user> loginTry = messageRepo.findByLogin(login);
        System.out.println(((List<POP3user>) loginTry).size()+"   login");
        if(((List<POP3user>) loginTry).size()>0){
            System.out.println(login+"   login");
            return "main";
        }
        else{
        POP3user message = new POP3user(login, password,smtp,smtpport,pop3,pop3Port, user);
        messageRepo.save(message);
        Iterable<POP3user> messages = messageRepo.findAll();
        model.put("messages", messages);
        System.out.println("add");
        return "main";
    }

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
