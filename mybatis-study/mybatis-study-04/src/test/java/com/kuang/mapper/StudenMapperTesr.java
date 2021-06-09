package com.kuang.mapper;

import com.kuang.pojo.Student;
import com.kuang.pojo.Teacher;
import com.kuang.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudenMapperTesr {

    @Test
    public void getStudent(){
        try (SqlSession sqlSession=MybatisUtils.getSqlSession();) {

            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            Teacher teacher = new Teacher();
            teacher.setId(1);
            List<Student> userList = mapper.getStudent();
            for (Student s : userList) {
                s.setTeacher(teacher);
                System.out.println(s);
            }
        }
    }

    @Test
    public void getStudent2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> userList = mapper.getStudent2();
        for (Student s:userList) {
            System.out.println(s);
        }
    }
}
