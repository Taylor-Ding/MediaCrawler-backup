package com.example.mediacrawler;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = {
    "media.crawler.platform=xhs",
    "media.crawler.login-type=qrcode",
    "media.crawler.crawler-type=search"
})
class MediaCrawlerApplicationTests {

    @Test
    void contextLoads() {
    }

}
