package com.example.mediacrawler.service.impl;

import com.example.mediacrawler.service.Crawler;
import com.example.mediacrawler.service.LoginService;
import com.example.mediacrawler.service.StoreService;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("douyinCrawlerService")
public class DouyinCrawlerServiceImpl implements Crawler {

    private final Playwright playwright;
    private final LoginService loginService;
    private final StoreService storeService;

    private String platform;
    private String loginType;
    private String crawlerType;

    @Autowired
    public DouyinCrawlerServiceImpl(Playwright playwright,
                                     @Qualifier("douyinLoginService") LoginService loginService,
                                     @Qualifier("douyinStoreService") StoreService storeService) {
        this.playwright = playwright;
        this.loginService = loginService;
        this.storeService = storeService;
    }

    @Override
    public void initConfig(String platform, String loginType, String crawlerType) {
        this.platform = platform;
        this.loginType = loginType;
        this.crawlerType = crawlerType;
    }

    @Override
    public void start() {
        // Crawling logic for Douyin will be implemented here
    }

    @Override
    public void search() {
        // Search logic for Douyin will be implemented here
    }

    @Override
    public BrowserContext launchBrowser(BrowserType chromium, Map<String, String> playwrightProxy, String userAgent, boolean headless) {
        return chromium.launch().newContext();
    }
}
