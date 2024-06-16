package com.side.bms.BookManagement.view;
import com.side.bms.BookManagement.controller.BookManagementController;

import java.util.*;

public class UpdateBookView {
    Scanner sc = new Scanner(System.in);
    BookManagementController bookManagementController = new BookManagementController();

    public void updateBook() {

        while (true) {
            String menu = """
                    ======================================
                    수정 할 재고 입력 하시겠습니까(Y/N) ?
                    =======================================
                    입력 : """;

            System.out.print(menu);
            String no = sc.nextLine();
            if (no.toUpperCase().equals("Y")) {
                bookManagementController.ChangeBook(ChooseBook());
                break;
            } else {
                System.out.print("재고 입력을 하지 않겠습니다.");
                break;
            }
        }
    }

    /**
     * book_id가져오기
     *
     * @return 근데 굳이 SELECT을 해야하나????????? 그냥 바로 넣으면 안되나????
     */
    private Map<String, String> ChooseBook() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("""
                    ============================
                    등록 물품을 수정하겠습니다.
                    책 번호를 입력하세요 :
                    ============================
                    """);
            String book_id = sc.nextLine();
            Map<String, String> book = new HashMap<>();
            book.put("book_id", book_id);

            System.out.print("바꾸고 싶은 분야를 입력해 주세요: title/author/description/price/category: ");
            String depart = sc.nextLine();

            if (depart.equals("title")) {
                System.out.print("수정 할 title: ");
                String title = sc.nextLine();
                book.put("title", title);
            } else if (depart.equals("author")) {
                System.out.print("수정 할 author: ");
                String author = sc.nextLine();
                book.put("author", author);
            } else if (depart.equals("description")) {
                System.out.print("수정 할 description: ");
                String description = sc.nextLine();
                book.put("description", description);
            } else if(depart.equals("price")){
                System.out.print("수정 할 price : ");
                String price = sc.nextLine();
                book.put("price",price);
            }else if(depart.equals("category")){
                System.out.print("수정 할 category :");
                String category = sc.nextLine();
                book.put("category",category);
            }else {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                continue;
            }

            return book;
        }
    }
}


