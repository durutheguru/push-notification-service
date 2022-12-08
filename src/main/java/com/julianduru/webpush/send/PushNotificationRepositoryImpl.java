package com.julianduru.webpush.send;

import com.julianduru.webpush.entity.Notification;
import com.julianduru.webpush.repository.NotificationRepository;
import com.julianduru.webpush.send.api.PushNotification;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

/**
 * created by julian on 29/11/2022
 */
@Component
@RequiredArgsConstructor
public class PushNotificationRepositoryImpl implements PushNotificationRepository {


    private final NotificationRepository notificationRepository;


    @Override
    public void save(PushNotification notification) {
        var notif = new Notification();

        notif.setUuid(notification.getUuid());
        notif.setUserId(notification.getUserId());
        notif.setMessage(notification.getMessage());
        notif.setType(notification.getType());

        notificationRepository.save(notif);
    }


    @Override
    public Page<PushNotification> fetchNotifications(String username, Pageable pageable) {
        return notificationRepository.findByUserId(username, pageable)
            .map(n -> PushNotification.builder()
                .uuid(n.getUuid())
                .userId(n.getUserId())
                .message(n.getMessage())
                .type(n.getType())
                .build()
            );
    }


}
