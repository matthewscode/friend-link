package com.truefriend.link.controller;

import com.truefriend.link.dao.LinkGroupDAO;
import com.truefriend.link.dao.UserDAO;
import com.truefriend.link.entity.LinkGroup;
import com.truefriend.link.entity.LinkUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private LinkGroupDAO linkGroupDAO;

    @Autowired
    private UserDAO userDAO;

//    Users
    @PostMapping("/user")
    public LinkUser addUser(@RequestBody LinkUser user){
        return userDAO.save(user);
    }
//    Groups
    @PostMapping("/group")
    public LinkGroup addGroup(@RequestBody LinkGroup group){
        return linkGroupDAO.save(group);
    }

}
