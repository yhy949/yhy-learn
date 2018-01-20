package com.yhy.mybatis.dao;

import com.yhy.mybatis.domain.Blog;

/**
 * @author : yhy
 * @since ： 2018/1/20
 */
public interface BlogDao {

    public Blog findById(Long id);
}
