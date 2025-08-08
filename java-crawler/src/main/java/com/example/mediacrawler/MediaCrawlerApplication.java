package com.example.mediacrawler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class MediaCrawlerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MediaCrawlerApplication.class, args);
    }

}
