package com.truefriend.link.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class LinkGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String groupname;

    private String description;

    @ManyToMany
    private List<LinkUser> userList;

    public String getGroupname() {
        return groupname;
    }

    public void setGroupName(String groupName) {
        this.groupname = groupName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<LinkUser> getUserList() {
        return userList;
    }

    public void setUserList(List<LinkUser> userList) {
        this.userList = userList;
    }
}
