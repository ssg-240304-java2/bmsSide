package com.side.bms.order.view;

import com.side.bms.order.controller.OrderController;

import java.util.Scanner;

public class OrderView {


    private OrderController orderController = new OrderController();
    private Scanner sc = new Scanner(System.in);

    public void mainOrder() {

        String order = """
            =====================
            1. 전체오더 조회
//            2. 
//            3. 
//            4. 
//            5. 
//            6. 
//            7. 
//            8. 
//            9. 
//            0. 
            =====================
            입력 : """;
        while(true) {
            System.out.println(order);
            String choice = sc.next();
            switch (choice) {
                case "1": orderController.findAll(); break;
            default:
                System.out.println("잘못 입력하셨습니다.");
            }
        }



    }
}
