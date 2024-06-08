package com.side.bms.BookManagement.view;

import com.side.bms.BookManagement.controller.BookManagementController;

import java.util.Scanner;

public class searchBookView {

    Scanner sc =new Scanner(System.in);
    BookManagementController bookManagementController = new BookManagementController();

    public void SearchBookView(){

        String menu = """
                ==============================
                1. 상세 상품 조회
                2. 이전 메뉴로
                ==============================
                입력 : """;
    while(true){
        System.out.println(menu);
        String num = sc.nextLine();
        switch (num){

            case "1" :detailSearchBook();  break;
            case "2" : return ;
            default:
                System.out.println("올바른 숫자를 입력하세요.");
            }
        }
    }

    private void detailSearchBook(){
        String menu = """
                ======================================
                1.  카테고리로 찾기
                2.  가격으로 찾기
                3.  저자로 찾기 
                0.  이전 메뉴로
                =======================================
                입력 : """;
        while (true){
            System.out.println(menu);
            String num = sc.nextLine();
            switch(num) {
                case "1" : bookManagementController.searchProductByCategory(inputCategory()); break;
                case "2" : bookManagementController.searchProductByPrice(inputPrice()); break;
                case "3" : bookManagementController.searchProductByAuthor(inputAuthor()); break;
                case "0" : return;
                default:
                    System.out.println("올바른 숫자를 입력하세요. ");
            }
        }

    }

    private String inputAuthor() {

        Scanner sc = new Scanner(System.in);
        System.out.print("저자를 입력해 주세요 :");
        String author = sc. nextLine();

        return author;
    }

    private String inputPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("가격을 입력 해 주세요 : ");
        String price = sc .nextLine();

        return price;

    }

    private String inputCategory() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" 카테고리를  입력해 주세요. ");
        String category = sc.nextLine();

        return category;
    }


}
