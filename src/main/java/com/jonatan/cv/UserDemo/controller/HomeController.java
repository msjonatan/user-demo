package com.jonatan.cv.UserDemo.controller;

import com.jonatan.cv.UserDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author msjonatan on 03/07/18
 * @project UserDemo
 */
@Controller
public class HomeController {
    @Autowired
    UserService userService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("usersCount", userService.countAll());
        model.addAttribute("usersConcat", userService.concatAll());
        return "index";
    }
}
