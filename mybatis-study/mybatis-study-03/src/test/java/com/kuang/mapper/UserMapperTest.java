package com.kuang.mapper;

import com.kuang.pojo.User;
import com.kuang.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void getUsers(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = mapper.getUsers();
        for (User user:userList) {
            System.out.println(user);
        }

    }
    @Test
    public void getUserByID(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.getUserByID(1);
        System.out.println(user);
    }

    @Test
    public void addUser(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user =new User(7,"ming子","1111");
        int n = mapper.addUser(user);
        System.out.println(n);
    }

    @Test
    public void updateUser(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user =new User(7,"zizizi","2222");
        int n = mapper.updateUser(user);
        System.out.println(n);
    }
    @Test
    public void deleteUser(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int n = mapper.deleteUser(7);
        System.out.println(n);
    }
}
