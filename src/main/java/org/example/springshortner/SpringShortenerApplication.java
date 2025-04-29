package org.example.springshortner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SpringShortenerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringShortenerApplication.class, args);
    }

}
