package com.tianjunwei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableAutoConfiguration
@SpringBootApplication
public class ApplicationZipkin {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ApplicationZipkin.class);
        app.run(args);
    }
}