package io.github.aylesw.mch.backend.repository;

import io.github.aylesw.mch.backend.model.EmailNotification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface EmailNotificationRepository extends JpaRepository<EmailNotification, Long> {
    @Query("SELECT n FROM EmailNotification n WHERE n.sent = false")
    List<EmailNotification> findAllUnsent();

    @Modifying
    @Transactional
    @Query("DELETE FROM EmailNotification n WHERE n.message LIKE %?1%")
    int deleteByMessage(String message);
}
