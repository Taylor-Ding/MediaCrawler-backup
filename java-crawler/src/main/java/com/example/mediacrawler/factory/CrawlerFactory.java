package com.example.mediacrawler.factory;

import com.example.mediacrawler.service.Crawler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CrawlerFactory {

    private final Crawler xhsCrawler;
    private final Crawler douyinCrawler;

    @Autowired
    public CrawlerFactory(@Qualifier("xhsCrawlerService") Crawler xhsCrawler,
                          @Qualifier("douyinCrawlerService") Crawler douyinCrawler) {
        this.xhsCrawler = xhsCrawler;
        this.douyinCrawler = douyinCrawler;
    }

    public Crawler createCrawler(String platform) {
        if ("xhs".equalsIgnoreCase(platform)) {
            return xhsCrawler;
        } else if ("dy".equalsIgnoreCase(platform)) {
            return douyinCrawler;
        }
        throw new IllegalArgumentException("Invalid platform: " + platform);
    }
}
