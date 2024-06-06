package com.side.bms.BookManagement.view;
import com.side.bms.BookManagement.controller.BookManagementController;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UpdateBookView {
    Scanner sc =new Scanner(System.in);
    BookManagementController bookManagementController = new BookManagementController();


    public void updateBook() {

        do{
            String menu = """
                ======================================
                1. 전체 재고 조회
                2. 수정 할 재고 입력
                3. 이전 메뉴로
                =======================================
                입력 : """;
            System.out.print(menu);
            String update = sc.nextLine();
            switch (update) {
                case "1" : bookManagementController.ViewAllProduct(); break;
                case "2" : bookManagementController.updateBook(updateInformation()); break;
                case "3" :return ;
            }
        }while(true);
    }

    private static Map<String ,String > updateInformation() {

        Scanner sc = new Scanner(System.in);
        System.out.print(" book_id 입력해 주세요 : ");
        String book_id = sc.nextLine();

        System.out.print("title을 입력 :");
        String title = sc.nextLine();
        System.out.print("author를 입력:");
        String author = sc.nextLine();
        System.out.print("description 입력 :");
        String description =sc.nextLine();
        System.out.print("price입력 :");

        System.out.println();
        Map<String ,String > book = new HashMap<>();
        book.put("book_id" , book_id);

        return book;
    }
}
