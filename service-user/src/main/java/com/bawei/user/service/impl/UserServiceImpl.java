package com.bawei.user.service.impl;

import com.bawei.user.entity.User;
import com.bawei.user.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUserById(Integer id) {
        User user = new User();
        user.setId(1);
        user.setUsername("李四");
        user.setPassword("123456");
        return user;
    }
}
