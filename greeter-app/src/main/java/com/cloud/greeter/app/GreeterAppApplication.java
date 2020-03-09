package com.cloud.greeter.app;

import com.cloud.greeter.library.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreeterAppApplication implements CommandLineRunner {

    @Autowired
    private Greeter greeter;

    public static void main(String[] args) {
        SpringApplication.run(GreeterAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String message = greeter.greet();
        System.out.println(message);
    }
}
