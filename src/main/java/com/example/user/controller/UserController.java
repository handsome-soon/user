package com.example.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 15995 on 2018/5/11.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getAll")
    public List getAll(){
        List<String> users = new ArrayList<>();
        users.add("zhangsan");
        users.add("lisi");
        users.add("wangwu");
        return users;
    }
}
