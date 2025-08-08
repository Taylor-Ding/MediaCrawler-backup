package com.example.mediacrawler.service.impl;

import com.example.mediacrawler.entity.XhsCreator;
import com.example.mediacrawler.entity.XhsNote;
import com.example.mediacrawler.entity.XhsNoteComment;
import com.example.mediacrawler.repository.XhsCreatorRepository;
import com.example.mediacrawler.repository.XhsNoteCommentRepository;
import com.example.mediacrawler.repository.XhsNoteRepository;
import com.example.mediacrawler.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Service("xhsStoreService")
public class XhsStoreServiceImpl implements StoreService {

    private final XhsNoteRepository xhsNoteRepository;
    private final XhsNoteCommentRepository xhsNoteCommentRepository;
    private final XhsCreatorRepository xhsCreatorRepository;

    @Autowired
    public XhsStoreServiceImpl(XhsNoteRepository xhsNoteRepository,
                               XhsNoteCommentRepository xhsNoteCommentRepository,
                               XhsCreatorRepository xhsCreatorRepository) {
        this.xhsNoteRepository = xhsNoteRepository;
        this.xhsNoteCommentRepository = xhsNoteCommentRepository;
        this.xhsCreatorRepository = xhsCreatorRepository;
    }

    @Transactional
    @Override
    public <T> T storeContent(Map<String, Object> contentItem) {
        XhsNote note = new XhsNote();
        note.setNoteId((String) contentItem.get("note_id"));
        note.setTitle((String) contentItem.get("title"));
        note.setDescription((String) contentItem.get("desc"));
        note.setUserId((String) contentItem.get("user_id"));
        note.setNickname((String) contentItem.get("nickname"));
        note.setAvatar((String) contentItem.get("avatar"));
        note.setLikedCount((String) contentItem.get("liked_count"));
        note.setCollectedCount((String) contentItem.get("collected_count"));
        note.setCommentCount((String) contentItem.get("comment_count"));
        note.setShareCount((String) contentItem.get("share_count"));
        note.setImageList((String) contentItem.get("image_list"));
        note.setLastUpdateTime(System.currentTimeMillis());
        note.setAddTs(System.currentTimeMillis());
        return (T) xhsNoteRepository.save(note);
    }

    @Override
    public void storeComment(Map<String, Object> commentItem) {
        // Comment storing logic will be implemented here
    }

    @Override
    public void storeCreator(Map<String, Object> creator) {
        // Creator storing logic will be implemented here
    }
}
