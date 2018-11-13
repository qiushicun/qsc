package com.example.qscuser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qsc
 * @date 2018/11/13
 * @introduce
 */
@RestController
public class UserController {


    @GetMapping("/user")
    public String getUser(){

        System.out.println("6666666666");

        return "我快被压死了";
    }

}
