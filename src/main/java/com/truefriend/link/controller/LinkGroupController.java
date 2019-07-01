package com.truefriend.link.controller;

import com.truefriend.link.dao.LinkGroupDAO;
import com.truefriend.link.entity.LinkGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/group")
public class LinkGroupController {

    @Autowired
    private LinkGroupDAO linkGroupDAO;

    @GetMapping("/all")
    public List<LinkGroup> getAllGroups(){
        return linkGroupDAO.findAll();
    }

    @GetMapping("/{id}")
    public LinkGroup getGroup(@PathVariable long id){
        return linkGroupDAO.getOne(id);
    }
}
