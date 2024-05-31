package com.side.bms.model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class QuantityByBookDTO {
    private int inventoryId;
    private String title;
    private int quantity;

    @Override
    public String toString() {
        return "[ 재고번호 : " + inventoryId +" | 도서명 : " + title +
                " | 재고량 : " + quantity + " ]";
    }
}





