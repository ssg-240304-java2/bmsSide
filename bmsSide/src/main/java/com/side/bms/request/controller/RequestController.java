package com.side.bms.request.controller;

import com.side.bms.request.model.RequestBookDTO;
import com.side.bms.request.model.RequestDTO;
import com.side.bms.request.service.RequestService;

import java.util.List;

public class RequestController {

    private final PrintResult printResult;
    private final RequestService requestService;

    public RequestController() {

        printResult = new PrintResult();
        requestService = new RequestService();
    }

    public void selectRequestBook() {           // 주문 도서 선택
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
}
