package com.side.bms.view;

import com.side.bms.model.dto.BookDTO;

import java.util.List;

public class ResultView {

    // 전체 book 조회
    public void printBookList(List<BookDTO> bookList) {
        for(BookDTO book : bookList) {
            System.out.println(book);
        }
    }

    public void printSuccessMessage(String successCode) {

        String successMessage = "";
        switch(successCode) {
            case "select" : successMessage = "도서 조회에 성공하였습니다."; break;
            case "insert" : successMessage = "신규 도서 등록을 성공하였습니다."; break;
            case "update" : successMessage = "도서 수정을 성공하였습니다."; break;
            case "delete" : successMessage = "도서 삭제를 성공하였습니다."; break;
        }

        System.out.println(successMessage);
    }


    public void printErrorMessage(String errorCode) {

        String errorMessage = "";

        switch(errorCode) {
            case "selectList" :
                errorMessage = "도서 목록 조회를 실패하였습니다.";
                break;
            case "insert" :
                errorMessage = "도서 등록을 실패하였습니다.";
                break;
            case "update" :
                errorMessage = "도서 수정을 실패하였습니다.";
                break;
            case "delete" :
                errorMessage = "도서 삭제를 실패하였습니다.";
                break;
        }
        System.out.println(errorMessage);
    }
}
