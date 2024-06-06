package com.side.bms.BookManagement.model.DTO;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProductSearchDTO {


    private int book_id;
    private String  title;
    private String  author;
    private String  description;
    private int price;
    private String category;
    private String created_at;
}
