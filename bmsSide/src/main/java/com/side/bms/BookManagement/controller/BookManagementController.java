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


    public int printProductBook(String bookId) {

        int result = 0;
        List<UpdateDTO> updateList = new ArrayList<>();
        updateList = bookManagementService.printProductBook(bookId);

        if (updateList.size() > 0) {
            result = 1;
            ResultView.printInventoryList(updateList);
        } else {
            System.out.println("잘못된 검색어 입니다. 다시 선택해주세요.");
        }

        return result;
    }


//    public void ChangeBook(Map<String, String> book) {
//
//        UpdateDTO updateDTO = new UpdateDTO();
//        int book_id = Integer.parseInt(book.get("book_id"));
//        String title = book.get("title");
//        String author = book.get("author");
//        String description = book.get("description");
//
//
//        if(book_id > 0 ){
//
//            updateDTO.setBook_id(book_id);
//            updateDTO.setAuthor(author);
//            updateDTO.setTitle(title);
//            updateDTO.setDescription(description);
//
//            boolean isModified = bookManagementService.ChangeBook(updateDTO);
//
//            if(isModified) {
//                System.out.println("성공");
//            }else{
//                System.out.println("실패");
//            }
//        }
//    }
//}

    public void ChangeBook(Map<String, String> book) {
        UpdateDTO updateDTO = new UpdateDTO();
        String bookIdStr = book.get("book_id");
        String title = book.get("title");
        String author = book.get("author");
        String description = book.get("description");

        try {
            int book_id = Integer.parseInt(bookIdStr);

            if (book_id > 0) {
                updateDTO.setBook_id(book_id);
                updateDTO.setAuthor(author);
                updateDTO.setTitle(title);
                updateDTO.setDescription(description);

                boolean isModified = bookManagementService.ChangeBook(updateDTO);

                if (isModified) {
                    System.out.println("성공");
                } else {
                    System.out.println("실패");
                }
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
}







