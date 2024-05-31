package com.side.bms.common;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.side.bms.common.Template.getSqlSession;
import static org.assertj.core.api.Assertions.assertThat;

public class templateTest {

    @DisplayName("SqlSession 객체가 정상적으로 가져올 수 있다.")
    @Test
    void test() {
        SqlSession sqlSession = getSqlSession();
        assertThat(sqlSession).isNotNull();
    }
}
