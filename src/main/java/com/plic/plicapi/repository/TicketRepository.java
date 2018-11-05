package com.plic.plicapi.repository;


import com.plic.plicapi.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByUserId(String userId);

    List<Ticket> findByUserIdAndScoreIsNull(String userId);

    List<Ticket> findByUserIdAndScoreNotNull(String userId);

    List<Ticket> findByUserIdAndCommentIsNull(String userId);

    List<Ticket> findByUserIdAndCommentNotNull(String userId);
    List<Ticket> findByUserIdAndMt20id(String userId, String mt20id);
}
