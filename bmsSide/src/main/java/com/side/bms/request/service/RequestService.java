package com.side.bms.request.service;

import com.side.bms.request.mapper.RequestMapper;
import com.side.bms.request.model.RequestBookDTO;
import com.side.bms.request.model.RequestDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class RequestService {
    public static List<RequestBookDTO> selectRequestBook() {            // 주문도서선택

//        SqlSession sqlSession = getSqlSession();
//        RequestMapper = sqlSession.getMapper(RequestMapper.class);
//        List<RequestBookDTO> requestBook = RequestMapper.selectRequestBook();
//        sqlSession.close();
//        return requestBook;


        SqlSession sqlSession = getSqlSession();        // try catch 사용
        try {
            RequestMapper requestMapper = sqlSession.getMapper(RequestMapper.class);
            List<RequestBookDTO> requestBook = RequestMapper.selectRequestBook();
            return requestBook;
        } finally {
            sqlSession.close();
        }
    }

    private static SqlSession getSqlSession() {

        return null;
    }

    public List<RequestDTO> selectRequest() {

        return null;
    }
}
