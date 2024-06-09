package com.side.bms.BookManagement.model.DAO;

import com.side.bms.BookManagement.model.DTO.BookRegister;
import com.side.bms.BookManagement.model.DTO.ProductSearchDTO;
import com.side.bms.BookManagement.model.DTO.UpdateDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookManagementMapper {
    int registerBook(BookRegister bookRegister);

    List<UpdateDTO> ViewAllProduct();

    List<ProductSearchDTO> searchProductByCategory(String category);

    List<ProductSearchDTO> searchProductByPrice(String price);

    List<ProductSearchDTO> searchProductByAuthor(String author);
    int ModifyBook(UpdateDTO update);


    List<UpdateDTO> choosebookid(String bookId);


    String getTitle(int bookId);

    List<UpdateDTO> Modifytitle(String title);
}
