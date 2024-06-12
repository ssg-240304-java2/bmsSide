package com.side.bms.order.view;

import com.side.bms.order.controller.OrderController;

import java.util.Scanner;

public class OrderView {


    private OrderController orderController = new OrderController();
    private Scanner sc = new Scanner(System.in);

    public void mainOrder() {

        String order = """
            =====================
            1. 전체주문 조회
            2. 주문번호 조회
            =====================
            입력 : """;
        while(true) {
            System.out.println(order);
            String choice = sc.next();
            switch (choice) {
                case "1": orderController.findAll();                    break;
                case "2": orderController.findByOrderId(searchOrder()); break;
            default:
                System.out.println("잘못 입력하셨습니다.");
            }
        }



    }

    private int searchOrder() {
        System.out.print("주문번호 조회 : " );
        int orderId = sc.nextInt();
        sc.nextLine();

        return orderId;
    }







}
