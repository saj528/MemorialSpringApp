package com.alexjoiner.memorialspringapp.web;

import com.alexjoiner.memorialspringapp.domain.MemorialMessage;
import com.alexjoiner.memorialspringapp.service.MemorialMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemorialMessageController {

    @Autowired
    private MemorialMessageService memorialMessageService;

    @GetMapping("/")
    public String getIndex(){return "redirect:/messages";}

    @GetMapping("/messages")
    public String getMessages(ModelMap modelMap){
        List<MemorialMessage> messages = memorialMessageService.findAll();
        modelMap.put("messages",messages);
        return "messages";
    }

    @GetMapping("/add-message")
    public String getAddMessage(ModelMap modelMap){
        modelMap.put("message",new MemorialMessage());
        return "add-message";
    }

    @PostMapping("/add-message")
    public String postAddMessage(MemorialMessage message){
        memorialMessageService.save(message);
        return "redirect:/messages";
    }


}
