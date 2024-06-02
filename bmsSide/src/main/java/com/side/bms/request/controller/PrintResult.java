package com.side.bms.request.controller;

import com.side.bms.request.model.RequestBookDTO;

import java.util.List;

public class PrintResult {
    private String errormessage;
    private String errorCode;
    private RequestBookDTO[] requestBookList;

    public void printRequsetList(List<RequestBookDTO> requestBook) {
        System.out.println("======== 도서 목록 =======");
        for (RequestBookDTO requestBookDTO : requestBookList) { // requestDTO 와 밑에 requestBook 이름이 달라도 될지 의문
            System.out.println(requestBook);
        }
        // 도서 테이블 출력

    }

    public void printErrorMessage(String selectRequset) {
        String ErrorMessage = "";
        switch (errorCode) {
            case "selectRequest" :
                errormessage = "도서선택에 실패했습니다";
                break;

            case "request" :
                errormessage = "주문내역조회에 실패했습니다";
                break;
            }
        }
    }

