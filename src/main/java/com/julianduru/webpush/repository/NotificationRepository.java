package com.julianduru.webpush.repository;

import com.julianduru.webpush.entity.Notification;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * created by julian on 29/11/2022
 */
@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {



    Page<Notification> findByUserId(String userId, Pageable pageable);



}
