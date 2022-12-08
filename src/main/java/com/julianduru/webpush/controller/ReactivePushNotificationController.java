package com.julianduru.webpush.controller;


import com.julianduru.webpush.NotificationConstant;
import com.julianduru.webpush.service.NotificationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import reactor.core.publisher.Flux;

import java.io.IOException;

/**
 * created by julian
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = NotificationConstant.SSE_API_PREFIX + "/notifications")
public class ReactivePushNotificationController {


    private final NotificationService notificationService;



//    @GetMapping(value = "/sse/flux"
//        , produces = { MediaType.TEXT_EVENT_STREAM_VALUE }
//    )
//    public Flux<Object> handleNotificationSubscription(
//        ServerHttpResponse response, @RequestParam("token") String token
//    ) throws IOException {
//        response.getHeaders().add("Cache-Control", "no-store");
//        response.getHeaders().add("Connection", "keep-alive");
//        return notificationService.handleNotificationSubscription(token);
//    }


}

