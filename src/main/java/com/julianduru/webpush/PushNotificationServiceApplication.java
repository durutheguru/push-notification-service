package com.julianduru.webpush;


import com.fasterxml.jackson.core.JsonGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

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
