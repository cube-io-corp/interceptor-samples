package com.cube.examples;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.cube.examples", "io.cube"})
public class OrderReceiverApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderReceiverApplication.class, args);
    }
}
