package com.side.bms.BookManagement.view;
import com.side.bms.BookManagement.controller.BookManagementController;
import java.util.*;

public class BookManagementView {
    Scanner sc =new Scanner(System.in);
    BookManagementController bookManagementController = new BookManagementController();

    searchBookView searchBookView = new searchBookView();
    UpdateBookView updateBookView = new UpdateBookView();

    public void bookManagement(){

        do{

            System.out.println("=====도서 관리=======");
            System.out.println("1. 도서 등록 ");
            System.out.println("2. 도서 수정 ");
            System.out.println("3. 도서 조회");
            int no =sc.nextInt();

            switch(no) {
                case 1 : bookManagementController.registerBook(inputBook()); break;
                case 2 : updateBookView.updateBook(); ; break;
                case 3 : searchBookView.SearchBookView();  break;
            }
        }while(true);
    }




    private static Map<String , String> inputBook() {

        Scanner sc = new Scanner(System.in);
        System.out.print(" 제목을 입력하세요 : ");
        String title = sc.nextLine();
        System.out.print("저자를 입력하세요 ");
        String author = sc.nextLine();
        System.out.print(" 책 설명을 해주세요 :");
        String description = sc.nextLine();
        System.out.print("가격을 알려주세요 :");
        String price = sc.nextLine();
        System.out.print("카테고리를 알려주세요 : ");
        String category = sc.nextLine();

        Map<String ,String > book = new HashMap<>();
        book.put("title",title);
        book.put("author",author);
        book.put("description",description);
        book.put("price",price);
        book.put("category",category);


        return book;
    }

}
