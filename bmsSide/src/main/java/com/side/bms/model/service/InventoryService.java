package com.side.bms.model.service;

import com.side.bms.model.dao.InventoryMapper;
import com.side.bms.model.dto.BookDTO;
import com.side.bms.model.dto.QuantityByBookDTO;
import com.side.bms.model.dto.QuantityByLocationDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.side.bms.common.Template.getSqlSession;

public class InventoryService {
    /***
     * 도서별 재고 조회
     * @return List<BookQuantityDTO>
     * 도서별 재고리스트 반환
     */
    public List<QuantityByBookDTO> selectBookQuantity() {
        SqlSession sqlSession = getSqlSession();
        InventoryMapper inventoryMapper = sqlSession.getMapper(InventoryMapper.class);
        List<QuantityByBookDTO> bookQuantityList = inventoryMapper.selectBookQuantity();
        sqlSession.close();
        return bookQuantityList;
    }

    public List<QuantityByLocationDTO> selectLocationQuantity(String locationName) {
        SqlSession sqlSession = getSqlSession();
        InventoryMapper inventoryMapper = sqlSession.getMapper(InventoryMapper.class);
        List<QuantityByLocationDTO> locationQuantityList = inventoryMapper.selectLocationQuantity(locationName);
        sqlSession.close();
        return locationQuantityList;
    }
}
