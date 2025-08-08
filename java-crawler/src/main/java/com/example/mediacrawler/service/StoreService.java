package com.example.mediacrawler.service;

import java.util.Map;

public interface StoreService {

    <T> T storeContent(Map<String, Object> contentItem);

    void storeComment(Map<String, Object> commentItem);

    void storeCreator(Map<String, Object> creator);
}
