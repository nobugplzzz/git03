package com.kuang.mapper;

import com.kuang.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    //if
    List<Blog> queryBlogIF(Map<String,Object> map);
    //choose-when-otherwise
    List<Blog> queryBlogChoose(Map<String,Object> map);
    //set
    List<Blog> UpdateBlogSet(Map<String,Object> map);
}
