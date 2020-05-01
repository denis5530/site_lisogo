package com.example.sweater.controller;

import com.example.sweater.domain.POP3user;
import com.example.sweater.domain.User;
import com.example.sweater.repos.MessageRepo;
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
public class PropertiesController {
    @Autowired
    private MessageRepo messageRepo;

    @Value("${upload.path}")
    private String uploadPath;
    private Iterable<POP3user> messages;

    

    @GetMapping("/properties")
    public String group(@RequestParam(required = false, defaultValue = "") String filter, Model model) {
        Iterable<POP3user> messages = messageRepo.findAll();
            messages = messageRepo.findAll();
        model.addAttribute("messages", messages);
        model.addAttribute("filter", filter);

        return "properties";
    }

    @PostMapping("/properties")
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
            return "properties";
        }
        else{
        POP3user message = new POP3user(login, password,smtp,smtpport,pop3,pop3Port, user);
        messageRepo.save(message);
        Iterable<POP3user> messages = messageRepo.findAll();
        model.put("messages", messages);
        System.out.println("add");
        return "properties";
    }

    }


}
