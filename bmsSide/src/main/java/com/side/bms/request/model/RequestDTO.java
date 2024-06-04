package com.side.bms.request.model;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class RequestDTO {

    private int OrderId;
    private int UserId;
    private Date OrderDate;
    private String Status;

}
