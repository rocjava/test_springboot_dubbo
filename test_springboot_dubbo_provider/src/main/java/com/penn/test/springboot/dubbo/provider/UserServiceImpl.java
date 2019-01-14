package com.penn.test.springboot.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.penn.test.springboot.dubbo.api.UserService;

@Service
public class UserServiceImpl implements UserService {

    public String getUserName() {
        return "Penn";
    }
}
