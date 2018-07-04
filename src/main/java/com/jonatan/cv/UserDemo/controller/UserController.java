package com.jonatan.cv.UserDemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author msjonatan on 01/07/18
 * @project UserDemo
 */
@Slf4j
@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("message", "This is a test message");
        return "user/index";
    }

    @GetMapping("create")
    public String create(Model model){
        return "create";

    }

}
