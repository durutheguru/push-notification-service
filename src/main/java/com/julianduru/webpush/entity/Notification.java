package com.julianduru.webpush.entity;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.julianduru.jpa.converter.ZonedDateTimeStringConverter;
import com.julianduru.jpa.entity.BaseEntity;
import com.julianduru.util.jpa.CryptoConverter;

import com.julianduru.util.json.ZonedDateTimeDeserializer;
import com.julianduru.util.json.ZonedDateTimeSerializer;
import com.julianduru.webpush.NotificationConstant;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import java.time.ZonedDateTime;

/**
 * created by julian
 */
@Data
@Entity
@Table(name = NotificationConstant.TABLE_PREFIX + "notification")
public class Notification extends BaseEntity {


    @Column(nullable = false, unique = true, length = 200)
    @NotEmpty(message = "UUID cannot be empty")
    private String uuid;


    @Column(nullable = false, columnDefinition = "TEXT")
    @NotEmpty(message = "Notification Message cannot be empty")
    @Convert(converter = CryptoConverter.class)
    private String message;


    @Column(nullable = false, length = 100)
    @NotEmpty(message = "Notification Type should not be empty")
    private String type;


    @Column(nullable = false, length = 100)
    @NotEmpty(message = "User ID cannot be empty")
    private String userId;


    @Column(nullable = false)
    private boolean received;


    @JsonSerialize(using = ZonedDateTimeSerializer.class)
    @JsonDeserialize(using = ZonedDateTimeDeserializer.class)
    @Convert(converter = ZonedDateTimeStringConverter.class)
    @Column(length = 100)
    private ZonedDateTime receivedTimeStamp;


    @Column(nullable = false)
    private boolean viewed;


    @JsonSerialize(using = ZonedDateTimeSerializer.class)
    @JsonDeserialize(using = ZonedDateTimeDeserializer.class)
    @Convert(converter = ZonedDateTimeStringConverter.class)
    @Column(length = 100)
    private ZonedDateTime viewedTimeStamp;



    public Notification received(boolean received) {
        if (isReceived()) {
            return this;
        }

        setReceived(received);
        setReceivedTimeStamp(isReceived() ? ZonedDateTime.now() : null);

        return this;
    }


}

