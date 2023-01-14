package com.julianduru.webpush;


import graphql.kickstart.spring.webclient.boot.GraphQLWebClientAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

/**
 * created by julian
 */
@Configuration
@EntityScan(
    basePackages = {
        "com.julianduru.util.jpa",
        "com.julianduru.webpush.entity"
    }
)
@SpringBootApplication
public class PushNotificationServiceApplication {


    public static void main(String[] args) {
        SpringApplication.run(PushNotificationServiceApplication.class, args);
    }


}
