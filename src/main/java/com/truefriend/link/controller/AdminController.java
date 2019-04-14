package com.truefriend.link.controller;

import com.truefriend.link.dao.FriendGroupDAO;
import com.truefriend.link.entity.FriendGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private FriendGroupDAO friendGroupDAO;

    @PostMapping("/group")
    public FriendGroup addGroup(@RequestBody FriendGroup group){
        return friendGroupDAO.save(group);
    }

}
