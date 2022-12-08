package com.julianduru.webpush;


import com.julianduru.webpush.config.TestConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * created by julian
 */
@ExtendWith({SpringExtension.class})
@SpringBootTest(classes = {
    TestConfig.class,
    PushNotificationServiceApplication.class
})
public class ContextLoadingTest {


    @Test
    public void contextLoads() {

    }


}
