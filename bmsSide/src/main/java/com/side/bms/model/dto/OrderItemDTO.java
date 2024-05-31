package com.side.bms.model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class OrderItemDTO {
    private int orderItemId;
    private int orderId;
    private int bookId;
    private int quantity;
    private double price;
}
