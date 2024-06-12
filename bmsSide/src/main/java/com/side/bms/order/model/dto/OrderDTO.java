package com.side.bms.order.model.dto;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class OrderDTO {

    private int orderId;
    private int userId;
    private Date orderDate;
    private String status;

}
