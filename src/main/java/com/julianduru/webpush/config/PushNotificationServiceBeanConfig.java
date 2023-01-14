package com.julianduru.webpush.config;

import com.fasterxml.jackson.core.JsonGenerator;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * created by julian on 02/12/2022
 */
@Configuration
public class PushNotificationServiceBeanConfig {


    @Bean
    public Jackson2ObjectMapperBuilderCustomizer om() {
        return builder -> builder.featuresToDisable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
    }


}
