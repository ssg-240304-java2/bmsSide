package com.side.bms.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class QuantityByLocationDTO {
    private int bookId;
    private String title;
    private int quantity;
    private String location;

    @Override
    public String toString() {
        return "[ 도서번호 : " + bookId +" | 도서명 : " + title +
                " | 재고량 : " + quantity + " ]";
    }



}
