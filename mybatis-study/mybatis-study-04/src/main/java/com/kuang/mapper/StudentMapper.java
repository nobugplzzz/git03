package com.kuang.mapper;

import com.kuang.pojo.Student;
import com.kuang.pojo.Teacher;

import java.util.List;

public interface StudentMapper {
    //查询嵌套，第一次提交
    List<Student> getStudent();
    //结果嵌套
    List<Student> getStudent2();
}
