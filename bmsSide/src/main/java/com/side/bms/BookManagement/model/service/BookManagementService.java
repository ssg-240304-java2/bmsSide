package com.side.bms.BookManagement.model.service;

import com.side.bms.BookManagement.model.DAO.BookManagementMapper;
import com.side.bms.BookManagement.model.DTO.BookRegister;
import org.apache.ibatis.session.SqlSession;

import static com.side.bms.common.MyBatisTemplate.getSqlSession;

public class BookManagementService {

    public boolean registerBook(BookRegister bookRegister) {

        SqlSession sqlSession = getSqlSession();

        BookManagementMapper bookManagementMapper = sqlSession.getMapper( BookManagementMapper.class);
        int result = bookManagementMapper.registerBook(bookRegister);

        if(result > 0){
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }

        sqlSession.close();
        return result > 0 ? true: false ;

    }
}
