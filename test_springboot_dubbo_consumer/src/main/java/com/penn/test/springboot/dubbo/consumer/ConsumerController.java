package com.penn.test.springboot.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.penn.test.springboot.dubbo.api.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Reference
    private UserService userService;

    @RequestMapping("/consume")
    public String consume() {
        String name = userService.getUserName();

        return "index";
    }
}
