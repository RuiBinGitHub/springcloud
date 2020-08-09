package com.example.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "findinfo")
    public DiscoveryClient findInfo() {
        // 输出服务列表
        List<String> services = discoveryClient.getServices();
        for (String service : services)
            System.out.println(service);

        // 输出指定服务的详细信息
        List<ServiceInstance> instances = discoveryClient.getInstances("SPRINGCLOUD-CLIENT-PROVIDER");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getHost() + "  " + instance.getPort() + "  " + instance.getUri());
        }
        return this.discoveryClient;
    }


}
