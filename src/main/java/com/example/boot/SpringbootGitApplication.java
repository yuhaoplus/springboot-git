package com.example.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootGitApplication.class, args);
        System.out.println("hello,git");
        System.out.println("master!");
        System.out.println("hot-fix");
        System.out.println("push");
    }

}
