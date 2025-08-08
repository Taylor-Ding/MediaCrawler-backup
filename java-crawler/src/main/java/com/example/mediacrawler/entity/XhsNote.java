package com.example.mediacrawler.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "xhs_note", indexes = {
        @Index(name = "idx_note_id", columnList = "noteId"),
        @Index(name = "idx_time", columnList = "time")
})
public class XhsNote extends XhsBaseEntity {

    @Column(unique = true)
    private String noteId;

    private String type;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(columnDefinition = "TEXT")
    private String videoUrl;

    private Long time;

    private Long lastUpdateTime;

    private String likedCount;

    private String collectedCount;

    private String commentCount;

    private String shareCount;

    @Column(columnDefinition = "TEXT")
    private String imageList;

    @Column(columnDefinition = "TEXT")
    private String tagList;

    private String noteUrl;
}
