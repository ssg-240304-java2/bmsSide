package com.side.bms.BookManagement.model.DAO;

import com.side.bms.BookManagement.model.DTO.BookRegister;
import com.side.bms.BookManagement.model.DTO.ProductSearchDTO;
import com.side.bms.BookManagement.model.DTO.UpdateDTO;

import java.util.List;

public interface BookManagementMapper {
    int registerBook(BookRegister bookRegister);

    List<UpdateDTO> ViewAllProduct();

    int updateBook(UpdateDTO updateDTO);

    List<ProductSearchDTO> searchProductByCategory(String category);

    List<ProductSearchDTO> searchProductByPrice(String price);

    List<ProductSearchDTO> searchProductByAuthor(String author);

}
