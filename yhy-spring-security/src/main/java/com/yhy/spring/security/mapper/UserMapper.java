package com.yhy.spring.security.mapper;

import com.yhy.spring.security.domain.SysUser;
import org.springframework.data.repository.CrudRepository;

/**
 * @author yhy
 * date : 2017/12/1
 */
public interface UserMapper extends CrudRepository<SysUser,Integer>{

    SysUser findByName(String username);
}
