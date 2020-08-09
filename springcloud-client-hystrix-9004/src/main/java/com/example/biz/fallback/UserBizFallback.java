package com.example.biz.fallback;

import com.example.biz.UserBiz;
import com.example.entity.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class UserBizFallback implements FallbackFactory<UserBiz> {

    public UserBiz create(Throwable throwable) {
        return new UserBiz() {
            public User findInfo(int id) {
                User user = new User();
                user.setId(id);
                user.setName("数据查询异常...");
                return user;
            }
        };
    }
}
