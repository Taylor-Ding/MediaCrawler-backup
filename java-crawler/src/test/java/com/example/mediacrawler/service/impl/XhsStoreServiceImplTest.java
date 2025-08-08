package com.example.mediacrawler.service.impl;

import com.example.mediacrawler.entity.XhsNote;
import com.example.mediacrawler.repository.XhsNoteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestPropertySource(properties = {
    "media.crawler.platform=xhs",
    "media.crawler.login-type=qrcode",
    "media.crawler.crawler-type=search"
})
class XhsStoreServiceImplTest {

    @Autowired
    private XhsStoreServiceImpl xhsStoreService;

    @Autowired
    private XhsNoteRepository xhsNoteRepository;

    @Test
    void testStoreContent() {
        Map<String, Object> contentItem = new HashMap<>();
        contentItem.put("note_id", "test-note-123");
        contentItem.put("title", "Test Note");
        contentItem.put("user_id", "test-user-456");

        XhsNote savedNote = xhsStoreService.storeContent(contentItem);

        assertNotNull(savedNote);
        assertNotNull(savedNote.getId());
        assertEquals("test-note-123", savedNote.getNoteId());
        assertEquals("Test Note", savedNote.getTitle());
    }
}
