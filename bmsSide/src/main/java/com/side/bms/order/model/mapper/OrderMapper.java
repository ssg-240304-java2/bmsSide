package com.side.bms.order.model.mapper;

import com.side.bms.order.model.dto.OrderDTO;

import java.util.List;

public interface OrderMapper {

    List<OrderDTO> selectAllOrder();

    OrderDTO findByOrderId(int orderId);
}
