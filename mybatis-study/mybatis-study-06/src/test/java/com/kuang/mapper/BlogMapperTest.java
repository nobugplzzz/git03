package com.kuang.mapper;

import com.kuang.pojo.Blog;
import com.kuang.uitil.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class BlogMapperTest {

    @Test
    public void queryBlogIF() {
        try (SqlSession sqlSession = MybatisUtils.getSqlSession();) {
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            HashMap<String, Object> map = new HashMap<>();
            map.put("title", "标题");
            List<Blog> blogList = mapper.queryBlogIF(map);
            for (Blog b : blogList) {
                System.out.println(b);
            }
        }
    }
    @Test
    public void queryBlogChoose() {
        try (SqlSession sqlSession = MybatisUtils.getSqlSession();) {
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            HashMap<String, Object> map = new HashMap<>();
            map.put("title", "标题");
            map.put("author", "作者");
            List<Blog> blogList = mapper.queryBlogIF(map);
            for (Blog b : blogList) {
                System.out.println(b);
            }
        }
    }

}
