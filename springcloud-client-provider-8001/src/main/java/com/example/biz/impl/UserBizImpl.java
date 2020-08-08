package com.example.biz.impl;

import com.example.biz.UserBiz;
import com.example.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserBizImpl implements UserBiz {

    public void insertUser(User user) {
        System.out.println("添加函数");
    }

    public void updateUser(User user) {
        System.out.println("编辑函数");
    }

    public void deleteUser(User user) {
        System.out.println("删除函数");
    }

    public User findInfoUser(int id) {
        User user = new User();
        user.setId(id);
        user.setName("port-8001");
        user.setUsername("100001");
        user.setPassword("123456");
        user.setDate("2018-05-06");
        return null;
    }
}
