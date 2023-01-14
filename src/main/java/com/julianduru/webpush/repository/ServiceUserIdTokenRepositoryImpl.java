package com.julianduru.webpush.repository;

import com.julianduru.webpush.send.UserIdToken;
import com.julianduru.webpush.send.UserIdTokenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Optional;

/**
 * created by julian on 14/01/2023
 */
@Component
@RequiredArgsConstructor
public class ServiceUserIdTokenRepositoryImpl implements UserIdTokenRepository {


    private final UserIdNotificationTokenRepository userIdTokenRepository;


    @Override
    public Collection<UserIdToken> findByUserId(String userId) {
        return userIdTokenRepository.findByUserId(userId).stream()
            .map(token -> new UserIdToken(
                token.getUserId(), token.getToken(), token.getExpiresOn()
            )).toList();
    }


    @Override
    public Optional<UserIdToken> findByToken(String token) {
        return userIdTokenRepository.findByToken(token).map(
            tokenEntity -> new UserIdToken(
                tokenEntity.getUserId(),
                tokenEntity.getToken(),
                tokenEntity.getExpiresOn()
            )
        );
    }


}
