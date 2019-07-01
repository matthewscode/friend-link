package com.truefriend.link.controller;

import com.truefriend.link.dao.UserDAO;
import com.truefriend.link.entity.LinkUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class LinkUserController {

    @Autowired
    private UserDAO userDAO;

    @GetMapping("/all")
    public List<LinkUser> getAllUsers(){
        return userDAO.findAll();
    }

    @GetMapping("/{id}")
    public LinkUser getUser(@PathVariable long id){
        return userDAO.getOne(id);
    }
}
