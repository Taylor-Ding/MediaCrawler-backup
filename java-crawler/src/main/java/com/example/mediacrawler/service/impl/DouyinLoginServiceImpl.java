package com.example.mediacrawler.service.impl;

import com.example.mediacrawler.service.LoginService;
import org.springframework.stereotype.Service;

@Service("douyinLoginService")
public class DouyinLoginServiceImpl implements LoginService {

    @Override
    public void begin() {
        // Login logic for Douyin will be implemented here
    }

    @Override
    public void loginByQrcode() {
        // QR code login logic for Douyin will be implemented here
    }

    @Override
    public void loginByMobile() {
        // Mobile login logic for Douyin will be implemented here
    }

    @Override
    public void loginByCookies() {
        // Cookie login logic for Douyin will be implemented here
    }
}
