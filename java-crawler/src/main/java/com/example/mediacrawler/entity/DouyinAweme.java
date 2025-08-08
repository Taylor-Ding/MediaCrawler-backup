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
@Table(name = "douyin_aweme", indexes = {
        @Index(name = "idx_aweme_id", columnList = "awemeId"),
        @Index(name = "idx_create_time", columnList = "createTime")
})
public class DouyinAweme extends DouyinBaseEntity {

    @Column(unique = true)
    private String awemeId;

    private String awemeType;

    @Column(length = 500)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    private Long createTime;

    private String likedCount;

    private String commentCount;

    private String shareCount;

    private String collectedCount;

    private String awemeUrl;
}
