package com.example.biz;

import com.example.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "springcloud-client-provider")
public interface UserBiz {

    @RequestMapping(value = "/client/user/findinfo/{id}")
    User findInfo(@PathVariable(value = "id") int id);

}
