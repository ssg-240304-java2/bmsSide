package com.side.bms.model.dto;

import lombok.*;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO {

    private int userId;
    private String userName;
    private String password;
    private String role;
    private Date createdAt;


}

