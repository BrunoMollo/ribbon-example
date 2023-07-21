package com.example.givedataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.Random;

@SpringBootApplication
@EnableDiscoveryClient
public class GiveDataServiceApplication {

    public static void main(String[] args) {
        int random=getRandomNumberInRange(8001,8400);
        System.setProperty("server.port", String.valueOf(random));
        SpringApplication.run(GiveDataServiceApplication.class, args);
    }
    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("Max must be greater than Min");
        }

        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
