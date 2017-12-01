package com.yhy.spring.security.service;

import com.yhy.spring.security.domain.SysUser;
import com.yhy.spring.security.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author yhy
 * date : 2017/12/1
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private BCryptPasswordEncoder encoder;
    public SysUser findByName(String username){
        return  userMapper.findByName(username);
    }

    public void insertUser(SysUser user) {
        user.setPassword(encoder.encode(user.getPassword()));
        userMapper.save(user);
    }


}
