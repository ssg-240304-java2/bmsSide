package com.side.bms.request.mapper;

import com.side.bms.request.model.RequestBookDTO;

import java.util.List;

public interface RequestMapper {
     List<RequestBookDTO> selectRequestBook();      // 도서주문테이블 출력



}
