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

@Service("xhsCrawlerService")
public class XhsCrawlerServiceImpl implements Crawler {

    private final Playwright playwright;
    private final LoginService loginService;
    private final StoreService storeService;

    private String platform;
    private String loginType;
    private String crawlerType;

    @Autowired
    public XhsCrawlerServiceImpl(Playwright playwright,
                                 @Qualifier("xhsLoginService") LoginService loginService,
                                 @Qualifier("xhsStoreService") StoreService storeService) {
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
        // 1. Launch browser
        BrowserContext context = launchBrowser(playwright.chromium(), null, null, false);

        // 2. Login
        loginService.begin();

        // 3. Crawl data
        if ("search".equals(crawlerType)) {
            search();
        } else {
            // other types not implemented yet
        }
    }

    @Override
    public void search() {
        // Search logic will be implemented here
    }

    @Override
    public BrowserContext launchBrowser(BrowserType chromium, Map<String, String> playwrightProxy, String userAgent, boolean headless) {
        return chromium.launch().newContext();
    }
}
