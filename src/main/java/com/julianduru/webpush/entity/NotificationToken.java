package com.julianduru.webpush.entity;

import com.julianduru.jpa.entity.BaseEntity;
import com.julianduru.util.jpa.LocalDateTimeConverter;
import com.julianduru.webpush.NotificationConstant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * created by julian on 01/12/2022
 */
@Data
@Entity
@Table(name = NotificationConstant.TABLE_PREFIX + "notification_token")
public class NotificationToken extends BaseEntity {


    @Column(nullable = false, length = 200)
    private String userId;


    @Column(nullable = false, unique = true, length = 200)
    private String token;


    @Column(nullable = false)
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime expiresOn;


}


