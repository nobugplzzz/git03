package com.kuang.mapper;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //查
    List<User> getUserList();
    //根据ID查询用户
    User getUserById(int id);
    //增
    void addUser(User user);
    //改
    int updateUser(User user);
    //删
    int deleteUser(int id);
    //通用Map参数
    int addUser2(Map<String,Object> map);
    //模糊查
    List<User> getUserLike(String value);
}
