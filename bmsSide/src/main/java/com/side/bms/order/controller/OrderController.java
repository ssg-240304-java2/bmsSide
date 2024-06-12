package com.side.bms.order.controller;

import com.side.bms.order.model.dto.OrderDTO;
import com.side.bms.order.model.service.OrderService;
import com.side.bms.order.view.ResultView;

import java.util.List;
import java.util.Scanner;


public class OrderController {
    private  OrderService orderService =new OrderService();
    private ResultView resultView = new ResultView();
    private Scanner sc = new Scanner(System.in);
    public OrderController() {

//        orderService = new OrderService();
//        resultView = new ResultView();
    }

    public void findAll() {
        try {
        List<OrderDTO> orderList = orderService.findAll(); // n개의 OrderDto 반환 : List<OrderDto>
            if (orderList != null || orderList.isEmpty())
                resultView.resultList(orderList);

        } catch (Exception e) {
            e.printStackTrace(); // 예외가 발생한 위치와 스택 트레이스 정보를 출력/예외가 발생했을 때, 문제가 발생한 위치를 알 수 있음
        }
    }


    public void findByOrderId(int orderId) {
        try{
        // 0~30: orderId 중 입력값 반환: OrderDTO
        OrderDTO orderDTO = orderService.findByOrderId(orderId);
        ResultView.displayOrder(orderDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
