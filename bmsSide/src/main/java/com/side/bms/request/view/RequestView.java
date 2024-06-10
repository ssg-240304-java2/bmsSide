package com.side.bms.request.view;

import com.side.bms.request.controller.RequestController;
import com.side.bms.request.model.RequestDTO;

import java.util.Date;
import java.util.Scanner;

public class RequestView {

    private static int orderID;
    private static int userId;
    private static Date orderDate;
    private static String status;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RequestController requestController = new RequestController();

        //do while 문 사용

        do {                // MainMenu
            System.out.println("=========== 주문 관리 시스템 ============");
            System.out.println(" 1. 주문할 도서 확인 ");
            System.out.println(" 2. 주문 내역 확인 ");
            System.out.println(" 3. 주문할 도서 선택 ");
            System.out.println(" 4. 장바구니 확인");
            System.out.println("============ 메뉴를 선택하세요 ============");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    requestController.selectRequestBook();
                    break;
                case 2:
                    requestController.selectRequest(details());
                    break;
                case 3:
                    requestController.checkRequest();
            }


        }while (true);
    }

    private static Object details() {

        RequestDTO parameter = new RequestDTO();
        parameter.setOrderId(orderID);
        parameter.setUserId(userId);
        parameter.setOrderDate(orderDate);
        parameter.setStatus(status);

        return parameter;
    }

}
