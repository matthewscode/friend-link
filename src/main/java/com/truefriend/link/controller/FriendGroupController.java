package com.truefriend.link.controller;

import com.truefriend.link.dao.FriendGroupDAO;
import com.truefriend.link.entity.FriendGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/group")
public class FriendGroupController {

    @Autowired
    private FriendGroupDAO friendGroupDAO;

    @GetMapping("/all")
    public List<FriendGroup> getAllGroups(){
        return friendGroupDAO.findAll();
    }

    @GetMapping("/{id}")
    public FriendGroup getGroup(@PathVariable long id){
        return friendGroupDAO.getOne(id);
    }
}
