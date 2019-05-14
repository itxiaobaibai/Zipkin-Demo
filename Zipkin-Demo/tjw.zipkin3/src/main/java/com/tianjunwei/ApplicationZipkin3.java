package com.tianjunwei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ApplicationZipkin3 {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ApplicationZipkin3.class);
        app.run(args);
    }
}