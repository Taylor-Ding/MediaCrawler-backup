package com.example.mediacrawler;

import com.example.mediacrawler.factory.CrawlerFactory;
import com.example.mediacrawler.service.Crawler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CrawlerCommandLineRunner implements CommandLineRunner {

    private final CrawlerFactory crawlerFactory;

    @Value("${media.crawler.platform}")
    private String platform;

    @Value("${media.crawler.login-type}")
    private String loginType;

    @Value("${media.crawler.crawler-type}")
    private String crawlerType;


    public CrawlerCommandLineRunner(CrawlerFactory crawlerFactory) {
        this.crawlerFactory = crawlerFactory;
    }

    @Override
    public void run(String... args) throws Exception {
        // The properties will be injected from application.properties
        // and can be overridden by command line arguments.
        // For example: --media.crawler.platform=dy
        Crawler crawler = crawlerFactory.createCrawler(platform);
        crawler.initConfig(platform, loginType, crawlerType);
        crawler.start();
    }
}
