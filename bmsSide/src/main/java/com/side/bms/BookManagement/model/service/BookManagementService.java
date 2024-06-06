package com.side.bms.BookManagement.model.service;

import com.side.bms.BookManagement.model.DAO.BookManagementMapper;
import com.side.bms.BookManagement.model.DTO.BookRegister;
import com.side.bms.BookManagement.model.DTO.ProductSearchDTO;
import com.side.bms.BookManagement.model.DTO.UpdateDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.side.bms.common.MyBatisTemplate.getSqlSession;

public class BookManagementService {

    public boolean registerBook(BookRegister bookRegister) {

        SqlSession sqlSession = getSqlSession();

        BookManagementMapper bookManagementMapper = sqlSession.getMapper( BookManagementMapper.class);
        int result = bookManagementMapper.registerBook(bookRegister);

        if(result > 0){
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }

        sqlSession.close();
        return result > 0 ? true: false ;

    }


    public List<UpdateDTO> ViewAllProduct() {

        SqlSession sqlSession = getSqlSession();
        BookManagementMapper bookManagementMapper = sqlSession.getMapper( BookManagementMapper.class);
        List<UpdateDTO> updateList =  bookManagementMapper.ViewAllProduct();

        sqlSession.close();
        return updateList;

    }

    public boolean updateBook(UpdateDTO updateDTO) {

        SqlSession sqlSession = getSqlSession();
        BookManagementMapper bookManagementMapper = sqlSession.getMapper( BookManagementMapper.class);
        int result =  bookManagementMapper.updateBook(updateDTO);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result > 0 ? true: false ;


    }

    public List<ProductSearchDTO> searchProductByCategory(String category) {
        SqlSession sqlSession = getSqlSession();
        BookManagementMapper bookManagementMapper = sqlSession.getMapper( BookManagementMapper.class);
        List<ProductSearchDTO> productList = bookManagementMapper.searchProductByCategory(category);
        sqlSession.close();
        return productList;

    }

    public List<ProductSearchDTO> searchProductByPrice(String price) {
        SqlSession sqlSession = getSqlSession();
        BookManagementMapper bookManagementMapper = sqlSession.getMapper( BookManagementMapper.class);
        List<ProductSearchDTO> productlist =  bookManagementMapper.searchProductByPrice(price);
        sqlSession.close();
        return productlist;
    }

    public List<ProductSearchDTO> searchProductByAuthor(String author) {
        SqlSession sqlSession = getSqlSession();
        BookManagementMapper bookManagementMapper = sqlSession.getMapper( BookManagementMapper.class);
        List<ProductSearchDTO> authorList = bookManagementMapper.searchProductByAuthor(author);
        sqlSession.close();
        return authorList;
    }
}
