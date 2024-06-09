package com.side.bms.BookManagement.view;
import com.side.bms.BookManagement.controller.BookManagementController;
import com.side.bms.BookManagement.model.DTO.UpdateDTO;

import java.util.*;

public class UpdateBookView {
    Scanner sc = new Scanner(System.in);
    BookManagementController bookManagementController = new BookManagementController();


    public List<UpdateDTO> updateBook() {

        List<UpdateDTO> update = new ArrayList<>();
        while (true) {
            String menu = """
                    ======================================
                    수정 할 재고 입력 하시겠습니까 ?
                    =======================================
                    입력 : """;

            System.out.print(menu);
            String no = sc.nextLine();
            int result = 0;

            if (no.toUpperCase().equals("Y")) {

                while(result == 0) {

                    Map<String, String> para = ChooseBook();
                    UpdateDTO modify = bookManagementController.ModifyBook(para);
                    update.add(modify);

                }
            }
            return update;
        }
    }

    /***
     *
     * book_id 얻는 메서드
     * @return
     *
     */

    private Map<String, String> ChooseBook() {

        Scanner sc = new Scanner(System.in);
        Map<String, String> book = new HashMap<>();

        do {
            System.out.print("책 book_id를 입력해 주세요: ");
            String book_id = sc.nextLine();
            book.put("book_id", book_id);

            if (bookManagementController.printProductBook(book_id) == 0) {
                System.out.println("검색한 상품이 존재하지 않습니다. 다시 검색해주세요.");
            } else {
                break;
            }
        } while (true);

        return book;
    }
}


