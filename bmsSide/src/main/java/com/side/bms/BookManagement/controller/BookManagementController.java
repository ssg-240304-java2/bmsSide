package com.side.bms.BookManagement.controller;

import com.side.bms.BookManagement.model.DTO.BookRegister;
import com.side.bms.BookManagement.model.service.BookManagementService;
import com.side.bms.BookManagement.view.ResultView;

import java.util.Map;

public class BookManagementController {

    BookManagementService bookManagementService =new BookManagementService();

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

        if(bookManagementService.registerBook(bookRegister)){
            ResultView.registerBook(bookRegister);
        }


    }
}
