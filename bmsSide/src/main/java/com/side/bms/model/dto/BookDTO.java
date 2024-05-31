package com.side.bms.model.dto;

import lombok.*;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BookDTO {

    private int bookId;
    private String title;
    private String author;
    private String description;
    private double price;
    private String category;
    private Date createdAt;
}
