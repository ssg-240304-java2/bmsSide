package com.side.bms.model.dto;

import lombok.*;

import java.sql.Date;

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