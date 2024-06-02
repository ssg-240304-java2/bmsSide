package com.side.bms.request.view;

import com.side.bms.request.controller.RequestController;

import java.util.Scanner;

public class RequestView {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RequestController requestController = new RequestController();

        //do while 문 사용

        do {                // MainMenu
            System.out.println("=========== 주문 관리 시스템 ============");
            System.out.println(" 1. 주문할 도서 선택 ");
            System.out.println(" 2. 주문 내역 확인 ");
            System.out.println(" 3. ");
            System.out.println(" 4. ");
            System.out.println("============ 메뉴를 선택하세요 ============");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    requestController.selectRequestBook();
                    break;
                case 2:
                    requestController.selectRequest();
                    break;
            }


        }while (true);
    }
}
