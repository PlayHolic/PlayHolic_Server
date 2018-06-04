package com.plic.plicapi.repository;


import com.plic.plicapi.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByuserId(Long userId);
    List<Ticket> findByuserIdAndScoreIsNull(Long userId);
    List<Ticket> findByuserIdAndScoreNotNull(Long userId);
    List<Ticket> findByuserIdAndCommentIsNull(Long userId);
    List<Ticket> findByuserIdAndCommentNotNull(Long userId);
}
