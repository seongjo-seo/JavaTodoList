package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class TodoServerApplication {
    @SpringBootApplication
    public static void main(String[] args){
        SpringApplication.run(TodoServerApplication.class, args);
    }
}
