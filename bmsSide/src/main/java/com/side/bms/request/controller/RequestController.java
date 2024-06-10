package com.side.bms.request.controller;

import com.side.bms.request.model.RequestBookDTO;
import com.side.bms.request.model.RequestDTO;
import com.side.bms.request.service.RequestService;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class RequestController {

    private final PrintResult printResult;
    private final RequestService requestService;

    public RequestController() {

        printResult = new PrintResult();
        requestService = new RequestService();
    }

    public void selectRequestBook() {           // 주문 도서 확인
        List<RequestBookDTO> requestBook = requestService.selectRequestBook();

        if (requestBook != null) {
            printResult.printRequsetList(requestBook);
        } else {
            printResult.printErrorMessage("selectRequest");
        }



    }

    public void selectRequest(Object details) {
        List<RequestDTO> request = requestService.selectRequest();

        if (request != null) {
            printResult.printRequsetList2(request);
        } else {
            printResult.printErrorMessage("request");           //printResult 주문내역출력 서비스부터
        }
    }

    public void checkRequest() {
        System.out.println("주문할 도서 선택");
        Scanner sc = new Scanner(System.in);
        int bookId = sc.nextInt();
        RequestBookDTO selectedBook = requestService.getBookById(bookId);

        if (selectedBook != null) {
            System.out.println("당신이 선택한 도서 : " + selectedBook);
            // 선택한 도서를 RequestDTO에 추가합니다.
            RequestDTO requestDTO = new RequestDTO();
            requestDTO.setOrderId(1); // 임의의 주문 ID 설정
            requestDTO.setUserId(1); // 임의의 사용자 ID 설정
            requestDTO.setOrderDate(new Date());
            requestDTO.setStatus("Ordered");
            // 필요에 따라 requestDTO에 더 많은 정보를 설정할 수 있습니다.
            selectRequest(requestDTO);
        } else {
            System.out.println("없는 도서번호 입니다");
        }
        return;
    }
}