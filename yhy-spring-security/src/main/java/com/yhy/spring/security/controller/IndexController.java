package com.yhy.spring.security.controller;

import com.yhy.spring.security.domain.SysUser;
import com.yhy.spring.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yhy
 * date : 2017/12/1
 */
@Controller
public class IndexController {
    @Value("${re}")
    private String re;
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
       // userService.insertUser(user);
        String str ="杨";
        Pattern pattern =Pattern.compile(re);

        Matcher matcher =pattern.matcher(str);
        if(matcher.matches()){
            return "ok";
        }
        return "false";
    }
    @RequestMapping("/getUser")
    @ResponseBody
    public SysUser getUser(String username){
        return userService.findByName(username);
    }
}
