package com.truefriend.link.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/username")
    @CrossOrigin(origins = "http://localhost:3000")
    @ResponseBody
    public final String home() {
//        String username = "ProStoic";
//        if(SecurityContextHolder.getContext().getAuthentication().getName() != null) {
//            username = "not_authenticated";
//        }
        return "{\"username\": \"ProStoic\"}";
    }

}
