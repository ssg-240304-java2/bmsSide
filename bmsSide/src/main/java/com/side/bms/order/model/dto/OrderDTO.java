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
    private int user_id;
    private Date order_date;
    private String status;

}
