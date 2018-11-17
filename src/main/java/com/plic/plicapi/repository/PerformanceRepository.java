package com.plic.plicapi.repository;

import com.plic.plicapi.domain.Performance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerformanceRepository extends JpaRepository<Performance, Long> {
    List<Performance> findByPerformanceNameContaining(String prfnm);
    void deleteAll();

    Performance findByPerformanceId(String performanceId);

}
