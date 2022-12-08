package com.julianduru.webpush.send;

import com.julianduru.webpush.entity.NotificationToken;
import com.julianduru.webpush.repository.UserIdNotificationTokenRepository;
import com.julianduru.webpush.send.api.UserIdNotificationToken;
import com.julianduru.webpush.service.NotificationTokenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * created by julian on 01/12/2022
 */
@Component
@RequiredArgsConstructor
public class NotificationTokenRepositoryImpl implements NotificationTokenRepository {


    private final UserIdNotificationTokenRepository tokenRepository;



    @Override
    public void saveUserSubscriptionToken(UserIdNotificationToken notificationToken) {
        var token = new NotificationToken();
        token.setToken(notificationToken.getToken());
        token.setUserId(notificationToken.getUserId());
        token.setExpiresOn(notificationToken.getExpiresOn());

        tokenRepository.save(token);
    }


    @Override
    public Optional<UserIdNotificationToken> getUserIdWithToken(String token) {
        return tokenRepository.findByToken(token)
            .map(
                t -> UserIdNotificationToken.builder()
                    .userId(t.getUserId())
                    .token(t.getToken())
                    .expiresOn(t.getExpiresOn())
                    .build()
            );
    }


}


