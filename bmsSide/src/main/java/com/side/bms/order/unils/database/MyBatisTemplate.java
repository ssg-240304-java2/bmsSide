package com.side.bms.order.unils.database;



import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

//import java.io.IOException;
//import java.io.InputStream;
import java.io.*;
public class MyBatisTemplate {

    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSession() {
        if (sqlSessionFactory == null) {
            String resource = "config/mybatis-config.xml";

            try {
                InputStream inputStream = Resources.getResourceAsStream(resource);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    return sqlSessionFactory.openSession(false);
    }
}
