package com.example.controller;

import com.example.biz.UserBiz;
import com.example.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserBiz userBiz;

    @RequestMapping(value = "/findinfo/{id}")
    public User findInfo(@PathVariable(value = "id") int id) {
        return userBiz.findInfo(id);
    }

}
