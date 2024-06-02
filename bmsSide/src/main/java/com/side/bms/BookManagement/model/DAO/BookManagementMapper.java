package com.side.bms.BookManagement.model.DAO;

import com.side.bms.BookManagement.model.DTO.BookRegister;

public interface BookManagementMapper {
    int registerBook(BookRegister bookRegister);
}
