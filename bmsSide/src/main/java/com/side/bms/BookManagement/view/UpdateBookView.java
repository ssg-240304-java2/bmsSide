package com.side.bms.BookManagement.view;
import com.side.bms.BookManagement.controller.BookManagementController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
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
                case "2" : bookManagementController.ModifyBook(ChooseBook()); break;
                case "3" : return ;
            }
        }while(true);
    }

        private  Map<String, String> ChooseBook(){

        Scanner sc = new Scanner(System.in);

        System.out.print("책 book_id를 입력해 주세요: ");
        String book_id = sc.nextLine();

        System.out.print("바꾸고 싶은 부분을 입력해 주세요 (title, author, description, price, category): ");
        String fieldToChange = sc.nextLine();

        Map<String, String> book = new HashMap<>();
        book.put("book_id", book_id);  // 항상 book_id를 맵에 추가

            if("book_id".equals(book_id)) {
                book.put("book_id", book_id);
            }else if("title".equals(fieldToChange)){
                System.out.print("바꾸고 싶은 title :");
                String title = sc.nextLine();
                book.put("title",title);
            }else if("author".equals(fieldToChange)){
                String author = sc.nextLine();
                book.put("author",author);
            }else if("description".equals(fieldToChange)){
                String description = sc.nextLine();
                book.put("description","description");
            }else if("price".equals(fieldToChange)){
                String price = sc.nextLine();
                book.put("price",price);
            }else if("category".equals(fieldToChange)){
                String category = sc.nextLine();
                book.put("category",category);
            }else{
                System.out.print("다시 입력해 주세요.");
            }
            return book;
        }

}
