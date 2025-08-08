package com.example.mediacrawler.service;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;

import java.util.Map;

public interface Crawler {

    void initConfig(String platform, String loginType, String crawlerType);

    void start();

    void search();

    BrowserContext launchBrowser(BrowserType chromium, Map<String, String> playwrightProxy, String userAgent, boolean headless);
}
