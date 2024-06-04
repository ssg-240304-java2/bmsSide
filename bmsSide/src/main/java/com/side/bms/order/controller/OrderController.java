package com.side.bms.order.controller;

import com.side.bms.order.model.dto.OrderDTO;
import com.side.bms.order.model.service.OrderService;
import com.side.bms.order.view.ResultView;

import java.util.List;

public class OrderController {
    private  OrderService orderService;
    private ResultView resultView;
    public OrderController() {

        orderService = new OrderService();
        resultView = new ResultView();
    }

    public void findAll() {

        try {
        List<OrderDTO> orderList = orderService.findAll(); // n개의 OrderDto 반환 : List<OrderDto>
            if (orderList != null)
                resultView.resultList(orderList);

        } catch (Exception e) {
            e.printStackTrace(); // 예외가 발생한 위치와 스택 트레이스 정보를 출력/예외가 발생했을 때, 문제가 발생한 위치를 알 수 있음
        }
    }



}
