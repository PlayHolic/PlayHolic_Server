package com.plic.plicapi.repository;

import com.plic.plicapi.domain.Keyword;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KeywordRepository extends JpaRepository<Keyword, Long> {

    // TODO 왜 모든 컬럼명을 적시해야만 쿼리가 작동하는 걸까?
    @Query(value = "SELECT id, user_id, word, now_date, created_date, last_modified_date " +
            "FROM keyword WHERE user_id = ? ORDER BY now_date DESC LIMIT 10"
            , nativeQuery = true)
    List<Keyword> findByUserId(@Param("userId") String userId);
}
