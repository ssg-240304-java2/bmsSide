package com.side.bms.model.dao;

import com.side.bms.model.dto.BookDTO;
import com.side.bms.model.dto.QuantityByBookDTO;
import com.side.bms.model.dto.QuantityByLocationDTO;

import java.util.List;

public interface InventoryMapper {
    List<BookDTO> selectAllBook();

    List<QuantityByBookDTO> selectBookQuantity();

    List<QuantityByLocationDTO> selectLocationQuantity(String locationName);
}
