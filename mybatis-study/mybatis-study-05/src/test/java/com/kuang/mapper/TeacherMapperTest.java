package com.kuang.mapper;


import com.kuang.pojo.Teacher;
import com.kuang.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TeacherMapperTest {
    @Test
    public void getStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        List<Teacher> teacherList = mapper.getTeacher(1);
        for (Teacher t:teacherList) {
            System.out.println(t);
        }
    }

    @Test
    public void getStudent2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        List<Teacher> teacherList = mapper.getTeacher2(1);
        for (Teacher t:teacherList) {
            System.out.println(t);
        }
    }
}
