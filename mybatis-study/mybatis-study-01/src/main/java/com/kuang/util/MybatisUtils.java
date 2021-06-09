package com.kuang.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * SqlSessionFactory---->SqlSession
 */
public class MybatisUtils {

    //
    private static SqlSessionFactory sqlsessionFactory;

    static{
        try {
            //使用mybatis第一步：获取SqlSession
            String resource= "mybatis/mybatis-config.xml";
            InputStream inputStream= Resources.getResourceAsStream(resource);
            sqlsessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //获取SqlSession实例
    public static SqlSession getSqlSession(){
        return sqlsessionFactory.openSession();
    }
}
