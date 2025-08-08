package com.example.mediacrawler.service;

public interface LoginService {

    void begin();

    void loginByQrcode();

    void loginByMobile();

    void loginByCookies();
}
