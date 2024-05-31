package com.side.bms.controller;

import com.side.bms.model.dto.BookDTO;
import com.side.bms.model.service.BookService;
import com.side.bms.view.ResultView;

import java.util.List;

public class BookController {
    private BookService bookService = new BookService();
    private ResultView resultView = new ResultView();
    public void selectInventoryByBook() {
    }

    public void selectAllBook() {

        List<BookDTO> bookList = bookService.selectAllBook();

        if(bookList != null) {
            resultView.printSuccessMessage("select");
            resultView.printBookList(bookList);
        } else {
            resultView.printErrorMessage("selectList");
        }
    }

}
