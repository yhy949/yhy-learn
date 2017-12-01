package com.yhy.spring.security.controller;

import com.yhy.spring.security.domain.SysUser;
import com.yhy.spring.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yhy
 * date : 2017/12/1
 */
@Controller
public class IndexController {
    @Autowired
    private UserService userService;
//    @RequestMapping("/hello")
//    public String hello(){
//        return "hello";
//    }
//    @RequestMapping("/")
//    public String index(){
//        return "index";
//    }
//    @RequestMapping("/login")
//    public String login(){
//        return "login";
//    }

    @RequestMapping("/int")
    @ResponseBody
    public String insertUser(SysUser user){
        userService.insertUser(user);
        return "ok";
    }
    @RequestMapping("/getUser")
    @ResponseBody
    public SysUser getUser(String username){
        return userService.findByName(username);
    }
}
