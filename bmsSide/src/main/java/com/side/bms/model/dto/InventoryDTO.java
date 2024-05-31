package com.side.bms.model.dto;

import lombok.*;
import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class InventoryDTO {
    private int inventoryId;
    private int bookId;
    private int quantity;
    private String location;
    private Date lastUpdated;
}
