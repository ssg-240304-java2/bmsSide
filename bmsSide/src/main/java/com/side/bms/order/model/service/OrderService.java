package com.side.bms.order.model.service;

import com.side.bms.order.model.dto.OrderDTO;
import com.side.bms.order.model.mapper.OrderMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.side.bms.order.unils.database.MyBatisTemplate.getSqlSession;

public class OrderService {
    public List<OrderDTO> findAll() { // 주문 조회

        SqlSession sqlSession = getSqlSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<OrderDTO> orderList= orderMapper.selectAllOrder();

        sqlSession.close();
        return orderList;
    }
}
