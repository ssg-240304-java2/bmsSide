package com.side.bms.order.view;

import com.side.bms.order.model.dto.OrderDTO;

import java.util.List;

public class ResultView {

    public void resultList(List<OrderDTO> orderList) {
        for (OrderDTO order : orderList) {
            System.out.println(order);
        }

    }
}
