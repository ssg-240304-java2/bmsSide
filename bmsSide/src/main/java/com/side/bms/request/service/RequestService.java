package com.side.bms.request.service;

import com.side.bms.request.mapper.RequestMapper;
import com.side.bms.request.model.RequestBookDTO;
import com.side.bms.request.model.RequestDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.side.bms.common.MyBatisTemplate.getSqlSession;

public class RequestService {

    public List<RequestBookDTO> selectRequestBook() {            // 주문도서선택

//        SqlSession sqlSession = getSqlSession();
//        RequestMapper = sqlSession.getMapper(RequestMapper.class);
//        List<RequestBookDTO> requestBook = RequestMapper.selectRequestBook();
//        sqlSession.close();
//        return requestBook;


        SqlSession sqlSession = getSqlSession();
        try {
            RequestMapper requestMapper = sqlSession.getMapper(RequestMapper.class);
            List<RequestBookDTO> requestBook = requestMapper.selectRequestBook();
            return requestBook;
        } finally {
//            sqlSession.close();
        }
    }


    public List<RequestDTO> selectRequest() {

        return null;
    }
}
