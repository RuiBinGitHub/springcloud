package com.example.biz.fallback;

import com.example.biz.UserBiz;
import com.example.entity.User;
import feign.hystrix.FallbackFactory;

public class UserBizFallback implements FallbackFactory<UserBiz> {

    public UserBiz create(Throwable throwable) {
        return new UserBiz() {

            public void insertUser(User user) {
                System.out.println("添加数据异常...");
            }

            public void updateUser(User user) {
                System.out.println("更新数据异常...");
            }

            public void deleteUser(User user) {
                System.out.println("删除数据异常...");
            }

            public User findInfo(int id) {
                User user = new User();
                user.setId(id);
                user.setName("数据查询异常...");
                return user;
            }
        };
    }
}
