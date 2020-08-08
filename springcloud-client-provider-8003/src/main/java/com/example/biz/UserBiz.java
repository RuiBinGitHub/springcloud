package com.example.biz;

import com.example.entity.User;

public interface UserBiz {

    void insertUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

    User findInfoUser(int id);
}
