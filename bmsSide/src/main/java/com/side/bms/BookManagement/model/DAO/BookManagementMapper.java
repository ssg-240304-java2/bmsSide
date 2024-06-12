package com.side.bms.BookManagement.model.DAO;

import com.side.bms.BookManagement.model.DTO.BookRegister;
import com.side.bms.BookManagement.model.DTO.ProductSearchDTO;
import com.side.bms.BookManagement.model.DTO.UpdateDTO;

import java.util.List;
import java.util.Map;

public interface BookManagementMapper {
    int registerBook(BookRegister bookRegister);

    List<UpdateDTO> ViewAllProduct();

    List<ProductSearchDTO> searchProductByCategory(String category);

    List<ProductSearchDTO> searchProductByPrice(String price);

    List<ProductSearchDTO> searchProductByAuthor(String author);
    int ModifyBook(UpdateDTO update);


    List<UpdateDTO> choosebookid(String bookId);


    String getTitle(int bookId);

    int ChangeBook(UpdateDTO updateDTO);

}

