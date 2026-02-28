package org.fitconnect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class FitConnect {
    public static void main(String[] args) {
        SpringApplication.run(FitConnect.class, args);
    }
}
