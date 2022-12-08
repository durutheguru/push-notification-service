package com.julianduru.webpush.repository;

import com.julianduru.webpush.entity.NotificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * created by julian on 01/12/2022
 */
@Repository
public interface UserIdNotificationTokenRepository extends JpaRepository<NotificationToken, Long> {


    Optional<NotificationToken> findByToken(String token);


}
