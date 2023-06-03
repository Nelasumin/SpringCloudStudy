package com.test.service.client;

import com.test.entity.User;
import org.springframework.stereotype.Component;


@Component
public class UserFallbackClient implements UserClient{

    @Override
    public User findUserById(int uid) {
        String hello ="Hello";
        return null;
    }
}
