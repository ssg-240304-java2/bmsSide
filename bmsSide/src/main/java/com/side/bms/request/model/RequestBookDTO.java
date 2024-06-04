package com.side.bms.request.model;

import jdk.jfr.StackTrace;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class RequestBookDTO {

    private int BookId;
    private String Title;
    private String Author;
    private String Description;
    private double Price;
    private String Category;
    private Date CreatedAt;
}
