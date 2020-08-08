package com.example.biz;

import com.example.biz.fallback.UserBizFallback;
import com.example.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "springcloud-client-provider", fallbackFactory = UserBizFallback.class)
public interface UserBiz {

    void insertUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

    @RequestMapping(value = "/client/findinfo/{id}")
    User findInfo(@PathVariable(value = "id") int id);

}
