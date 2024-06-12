package com.side.bms.BookManagement.model.service;

import com.side.bms.BookManagement.model.DAO.BookManagementMapper;
import com.side.bms.BookManagement.model.DTO.BookRegister;
import com.side.bms.BookManagement.model.DTO.ProductSearchDTO;
import com.side.bms.BookManagement.model.DTO.UpdateDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.side.bms.BookManagement.common.MyBatisTemplate.getSqlSession;

public class BookManagementService {

    public boolean registerBook(BookRegister bookRegister) {

        SqlSession sqlSession = getSqlSession();

        BookManagementMapper bookManagementMapper = sqlSession.getMapper(BookManagementMapper.class);
        int result = bookManagementMapper.registerBook(bookRegister);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result > 0 ? true : false;

    }


    public List<UpdateDTO> ViewAllProduct() {

        SqlSession sqlSession = getSqlSession();
        BookManagementMapper bookManagementMapper = sqlSession.getMapper(BookManagementMapper.class);
        List<UpdateDTO> updateList = bookManagementMapper.ViewAllProduct();

        sqlSession.close();
        return updateList;

    }


    public List<ProductSearchDTO> searchProductByCategory(String category) {

        SqlSession sqlSession = getSqlSession();
        BookManagementMapper bookManagementMapper = sqlSession.getMapper(BookManagementMapper.class);
        List<ProductSearchDTO> productList = bookManagementMapper.searchProductByCategory(category);
        sqlSession.close();
        return productList;

    }

    public List<ProductSearchDTO> searchProductByPrice(String price) {
        SqlSession sqlSession = getSqlSession();
        BookManagementMapper bookManagementMapper = sqlSession.getMapper(BookManagementMapper.class);
        List<ProductSearchDTO> productlist = bookManagementMapper.searchProductByPrice(price);
        sqlSession.close();
        return productlist;
    }

    public List<ProductSearchDTO> searchProductByAuthor(String author) {
        SqlSession sqlSession = getSqlSession();
        BookManagementMapper bookManagementMapper = sqlSession.getMapper(BookManagementMapper.class);
        List<ProductSearchDTO> authorList = bookManagementMapper.searchProductByAuthor(author);
        sqlSession.close();
        return authorList;
    }


    public boolean ModifyBook(UpdateDTO update) {

        SqlSession sqlSession = getSqlSession();

        BookManagementMapper bookManagementMapper = sqlSession.getMapper(BookManagementMapper.class);
        int result = bookManagementMapper.ModifyBook(update);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0 ? true : false;

    }


    public List<UpdateDTO> printProductBook(String bookId) {
        SqlSession sqlSession = getSqlSession();
        BookManagementMapper bookManagementMapper = sqlSession.getMapper(BookManagementMapper.class);

        List<UpdateDTO> list = bookManagementMapper.choosebookid(bookId);
        sqlSession.close();
        return list;
    }

    public String getTitle(int book_id) {
        SqlSession sqlSession = getSqlSession();
        BookManagementMapper bookManagementMapper = sqlSession.getMapper(BookManagementMapper.class);


        String title = bookManagementMapper.getTitle(book_id);

        if (title != null) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        return title;
    }

    public boolean ChangeBook(UpdateDTO updateDTO) {
        SqlSession sqlSession = getSqlSession();
        BookManagementMapper bookManagementMapper = sqlSession.getMapper(BookManagementMapper.class);

        int changeResult = bookManagementMapper.ChangeBook(updateDTO);


        if (changeResult> 0) {
            sqlSession.commit();
            System.out.println("성공");
        } else {
            sqlSession.rollback();
            System.out.println("실패");
        }
        sqlSession.close();
        return changeResult > 0 ? true: false ;

    }
}




