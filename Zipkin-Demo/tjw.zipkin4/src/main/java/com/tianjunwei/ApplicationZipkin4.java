package com.tianjunwei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableAutoConfiguration
public class ApplicationZipkin4 {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ApplicationZipkin4.class);
        app.run(args);
    }
}