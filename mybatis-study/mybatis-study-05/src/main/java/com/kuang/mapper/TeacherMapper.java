package com.kuang.mapper;

import com.kuang.pojo.Teacher;

import java.util.List;

public interface TeacherMapper {
    //结果嵌套
    List<Teacher> getTeacher(int id);
    //查询嵌套
    List<Teacher> getTeacher2(int id);
}
