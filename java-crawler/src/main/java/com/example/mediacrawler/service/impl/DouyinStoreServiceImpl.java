package com.example.mediacrawler.service.impl;

import com.example.mediacrawler.repository.DouyinAwemeCommentRepository;
import com.example.mediacrawler.repository.DouyinAwemeRepository;
import com.example.mediacrawler.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("douyinStoreService")
public class DouyinStoreServiceImpl implements StoreService {

    private final DouyinAwemeRepository douyinAwemeRepository;
    private final DouyinAwemeCommentRepository douyinAwemeCommentRepository;

    @Autowired
    public DouyinStoreServiceImpl(DouyinAwemeRepository douyinAwemeRepository,
                                  DouyinAwemeCommentRepository douyinAwemeCommentRepository) {
        this.douyinAwemeRepository = douyinAwemeRepository;
        this.douyinAwemeCommentRepository = douyinAwemeCommentRepository;
    }

    @Override
    public <T> T storeContent(Map<String, Object> contentItem) {
        // Storing logic for Douyin Aweme will be implemented here
        return null;
    }

    @Override
    public void storeComment(Map<String, Object> commentItem) {
        // Storing logic for Douyin Aweme Comment will be implemented here
    }

    @Override
    public void storeCreator(Map<String, Object> creator) {
        // Storing logic for Douyin Creator will be implemented here
    }
}
