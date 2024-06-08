package com.side.bms.BookManagement.controller;

import com.side.bms.BookManagement.model.DTO.BookRegister;
import com.side.bms.BookManagement.model.DTO.ProductSearchDTO;
import com.side.bms.BookManagement.model.DTO.UpdateDTO;
import com.side.bms.BookManagement.model.service.BookManagementService;
import com.side.bms.BookManagement.view.ResultView;

import java.util.*;

public class BookManagementController {


    BookManagementService bookManagementService = new BookManagementService();

    public void registerBook(Map<String, String> book) {

        String title = book.get("title");
        String author = book.get("author");
        String description = book.get("description");
        int price = Integer.parseInt(book.get("price"));
        String category = book.get("category");

        BookRegister bookRegister = new BookRegister();
        bookRegister.setTitle(title);
        bookRegister.setAuthor(author);
        bookRegister.setDescription(description);
        bookRegister.setPrice(price);
        bookRegister.setCategory(category);

        if (bookManagementService.registerBook(bookRegister)) {
            ResultView.registerBook(bookRegister);
        }


    }


    public void ViewAllProduct() {
        List<UpdateDTO> updateList = bookManagementService.ViewAllProduct();

        if (updateList != null && !updateList.isEmpty()) {
            ResultView.printBook(updateList);
        }
    }


    public void searchProductByCategory(String category) {

        List<ProductSearchDTO> list = bookManagementService.searchProductByCategory(category);

        if (list != null && !list.isEmpty()) {
            ResultView.searchByCategory(list);
        } else {
            System.out.println("해당 카테고리는 없습니다. ");
        }
    }

    public void searchProductByPrice(String price) {
//        bookManagementService 객체의 searchProductByPrice 메서드를 호출하여 주어진 가격을 기준으로 제품을 검색합니다.
//        검색 결과는 ProductSearchDTO 객체의 리스트로 반환되며, 이 리스트는 list 변수에 저장됩니다.
        List<ProductSearchDTO> list = bookManagementService.searchProductByPrice(price);

        if (list != null && !list.isEmpty()) {
            ResultView.searchByPrice(list);
        } else {
            System.out.println("해당 가격은 없습니다.");
        }


    }

    public void searchProductByAuthor(String author) {

        List<ProductSearchDTO> list = bookManagementService.searchProductByAuthor(author);

        if (list != null && !list.isEmpty()) {
            ResultView.searchByAuthor(list);
        } else {
            System.out.print("해당 저자는 없습니다.");
        }

    }


    public void ModifyBook(Map<String, String> book) {

        int book_id = Integer.parseInt(book.get("book_id"));
        String title = book.get("title");
        String author = book.get("author");
        String description = book.get("description");
        int price = Integer.parseInt(book.get("price"));
        String category = book.get("category");

        UpdateDTO update = new UpdateDTO();
        update.setBook_id(book_id);
        update.setTitle(title);
        update.setAuthor(author);
        update.setDescription(description);
        update.setPrice(price);
        update.setCategory(category);

        if (bookManagementService.ModifyBook(update)) {
            ResultView.ModifyBook(update);
        }
    }
}

