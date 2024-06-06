package com.side.bms.BookManagement.model.DTO;
import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@ToString
@AllArgsConstructor

public class UpdateDTO {

    private int book_id;
    private String  title;
    private String  author;
    private String  description;
    private int price;
    private String category;
    private String created_at;

}
