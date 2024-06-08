package com.side.bms.BookManagement.view;

import com.side.bms.BookManagement.model.DTO.BookRegister;
import com.side.bms.BookManagement.model.DTO.ProductSearchDTO;
import com.side.bms.BookManagement.model.DTO.UpdateDTO;

import java.sql.SQLOutput;
import java.util.List;
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


    public static void printBook(List<UpdateDTO> updateList) {

        for(UpdateDTO s : updateList){
            System.out.println(s);
        }
    }

    public static void printSuccessMessage(String successCode){
        String successMessage="";
        switch (successCode){
            case "updatae" :successMessage = "메뉴 수정을 성공하였습니다."; break;
        }
        System.out.println(successMessage);
    }

    public static void searchByCategory(List<ProductSearchDTO> categoryList){

        for(ProductSearchDTO s : categoryList) {
            System.out.print(s);
        }
    }

    public static void searchByPrice(List<ProductSearchDTO> Pricelist){

        for(ProductSearchDTO s :  Pricelist){
            System.out.print(s);
        }
    }
    public static void searchByAuthor(List<ProductSearchDTO> AuthorList){

        for(ProductSearchDTO s : AuthorList){
            System.out.print(s);
        }
    }

    public static void ModifyBook(UpdateDTO update) {

        if( update == null){
            System.out.print(">>>등록되지 않았습니다.<<<");
        }
        else{
            System.out.println("====================");
            System.out.println("book_id :" + update.getBook_id());
            System.out.println("title : " + update.getTitle() );
            System.out.println("author : " + update.getAuthor());
            System.out.println("description : " + update.getDescription());
            System.out.println("price : " + update.getPrice());
            System.out.println("category : " + update.getCategory());
        }
    }

}
