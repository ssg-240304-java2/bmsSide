package com.side.bms.order.view;

import com.side.bms.order.model.dto.OrderDTO;

import java.util.List;

public class ResultView {

    public static void displayOrder(OrderDTO orderDTO) {
        if ( orderDTO == null ) {
            System.out.println("조회된 주문번호가 없습니다.");
        } else {
            System.out.println("------------------------------");
            System.out.println("orderId : "    + orderDTO.getOrderId());
            System.out.println("userId : "     + orderDTO.getUserId());
            System.out.println("orderDate : " + orderDTO.getOrderDate());
            System.out.println("status : "     + orderDTO.getStatus());
            System.out.println("------------------------------");
        }
    }

    public void resultList(List<OrderDTO> orderList) {
        for (OrderDTO order : orderList) {
            System.out.println(order);
        }

    }
}
