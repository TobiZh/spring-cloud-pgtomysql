package com.example.pgsql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class PgsqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(PgsqlApplication.class, args);
    }

}
