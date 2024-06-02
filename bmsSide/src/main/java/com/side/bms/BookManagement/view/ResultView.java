package com.side.bms.BookManagement.view;

import com.side.bms.BookManagement.model.DTO.BookRegister;

import java.util.Map;

public class ResultView {



    public static void registerBook(BookRegister bookRegister){

        if (bookRegister == null){
            System.out.print(">>>등록되지 않았습니다.<<<");
        }
        else{
            System.out.println("--------------------");
            System.out.println("title : " + bookRegister.getTitle() );
            System.out.println("author : " + bookRegister.getAuthor());
            System.out.println("description : " + bookRegister.getDescription());
            System.out.println("price : " + bookRegister.getPrice());
            System.out.println("category : " + bookRegister.getCategory());
        }

    }



}
