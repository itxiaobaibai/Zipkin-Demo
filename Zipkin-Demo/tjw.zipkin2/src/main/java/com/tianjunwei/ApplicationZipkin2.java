package com.tianjunwei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ApplicationZipkin2 {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ApplicationZipkin2.class);
        app.run(args);
    }
}
