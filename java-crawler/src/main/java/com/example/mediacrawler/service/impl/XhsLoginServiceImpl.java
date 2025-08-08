package com.example.mediacrawler.service.impl;

import com.example.mediacrawler.service.LoginService;
import org.springframework.stereotype.Service;

@Service("xhsLoginService")
public class XhsLoginServiceImpl implements LoginService {

    @Override
    public void begin() {
        // Login logic will be implemented here
    }

    @Override
    public void loginByQrcode() {
        // QR code login logic will be implemented here
    }

    @Override
    public void loginByMobile() {
        // Mobile login logic will be implemented here
    }

    @Override
    public void loginByCookies() {
        // Cookie login logic will be implemented here
    }
}
