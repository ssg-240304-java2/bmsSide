package com.side.bms.BookManagement.model.DTO;

import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@ToString
@AllArgsConstructor

public class BookRegister {

    private int book_id;
    private String  title;
    private String  author;
    private String  description;
    private int price;
    private String category;
    private String created_at;
    // 근데 timestamp인데 String으로 dto관리괜춘?



}
