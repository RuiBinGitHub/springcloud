package com.example.controller;

import com.example.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private RestTemplate template;

    private final static String Path = "http://springcloud-client-provider/client";

    @RequestMapping(value = "/findinfo/{id}")
    public User findInfo(@PathVariable(value = "id") int id) {
        String url = Path + "/findinfo/" + id;
        ResponseEntity<User> entity = template.getForEntity(url, User.class);
        return entity.getBody();
    }

}
