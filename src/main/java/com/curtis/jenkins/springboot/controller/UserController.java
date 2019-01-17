package com.curtis.jenkins.springboot.controller;

import com.curtis.jenkins.springboot.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController {

    private static Map<Long, User> userMap = new HashMap<>();
    static {
        userMap.put(1L, new User(1L, "curtis1", 21));
        userMap.put(2L, new User(2L, "curtis2", 22));
        userMap.put(3L, new User(3L, "curtis3", 23));
    }

    // 测试url：http://localhost:9001/api/user/1
    @RequestMapping("/user/{id}")
    public User getUserById(@PathVariable Long id) {
        User user = userMap.get(id);
        return user;
    }
}
