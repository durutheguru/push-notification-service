package com.julianduru.webpush.config;


import com.github.javafaker.Faker;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * created by julian
 */
@TestConfiguration
@EnableJpaRepositories(
    basePackages = "com.julianduru.webpush.repository"
)
@EnableAutoConfiguration
public class TestConfig {


    @Bean
    public Faker faker() {
        return new Faker();
    }


}
