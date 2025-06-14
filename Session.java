package com.Heaper.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 〈功能概述〉<br>
 *
 * @author:mzxy
 * @date: 2025/6/12 22:02
 */
public class Session {
    public static SqlSession getSession(){
        String res = "mybatis-config.xml";
        SqlSession session = null;
        try {
            InputStream is = Resources.getResourceAsStream(res);//读文件
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);//按照文件创建工厂类
            session = factory.openSession(true);//工厂生成
        }catch (IOException ex){
            ex.printStackTrace();
        }
        return session;
    }
}
