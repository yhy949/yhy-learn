package com.yhy.mybatis.test;

import com.yhy.mybatis.domain.Blog;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author : yhy
 * @since ： 2018/1/20
 */
public class BlogTest {

    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void start() throws IOException {
        String resource ="mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test
    public void findById(){
        SqlSession sqlSession = sqlSessionFactory.openSession();

        try {
            List<Blog> blog =  sqlSession.selectList("com.yhy.mybatis.dao.BlogDao.findById",1);
            System.out.println(blog);
        }finally {
            sqlSession.close();
        }


    }
}