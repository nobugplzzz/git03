package com.kuang.mapper;

import com.kuang.pojo.User;
import com.kuang.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {

    static Logger logger=Logger.getLogger(UserDaoTest.class);

    @Test
    public void test() {
        //获取Sqlsession实例,close()
        try (SqlSession sqlSession = MybatisUtils.getSqlSession()) {

            //getMapper获取映射接口的实例
            UserMapper userDao = sqlSession.getMapper(UserMapper.class);

            List<User> userlist = userDao.getUserList();

            for (User user : userlist) {
                System.out.println(user);
            }
        }
    }

    @Test
    public void getUserById() {
        //获取Sqlsession实例,close()
        try (SqlSession sqlSession = MybatisUtils.getSqlSession()) {

            //getMapper获取映射接口的实例
            UserMapper userDao = sqlSession.getMapper(UserMapper.class);

            User user = userDao.getUserById(1);

            System.out.println(user);

        }
    }

    @Test
    public void addUser() {
        //获取Sqlsession实例,close()
        try (SqlSession sqlSession = MybatisUtils.getSqlSession()) {

            //getMapper获取映射接口的实例
            UserMapper userDao = sqlSession.getMapper(UserMapper.class);

            User user = new User(7,"ee","321");
            userDao.addUser(user);
            System.out.println(user);

        }
    }

    @Test
    public void addUser2() {
        //获取Sqlsession实例,close()
        try (SqlSession sqlSession = MybatisUtils.getSqlSession()) {

            //getMapper获取映射接口的实例
            UserMapper userDao = sqlSession.getMapper(UserMapper.class);

            Map<String, Object> map = new HashMap<String, Object>();
            map.put("name", "ww");
            map.put("money", "321");

            userDao.addUser2(map);
            sqlSession.commit();
        }
    }

    @Test
    public void getUserLike() {
        //获取Sqlsession实例,close()
        try (SqlSession sqlSession = MybatisUtils.getSqlSession()) {

            //getMapper获取映射接口的实例
            UserMapper userDao = sqlSession.getMapper(UserMapper.class);

            List<User> userList = userDao.getUserLike("%李%");

            for (User user:userList) {
                System.out.println(user);
            }
            logger.info("info:进入了testLog4j");
            logger.debug("debug:进入了testLog4j");
            logger.error("error:进入了testLog4j");
        }
    }

}
