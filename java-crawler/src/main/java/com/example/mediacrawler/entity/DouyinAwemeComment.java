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
@Table(name = "douyin_aweme_comment", indexes = {
        @Index(name = "idx_comment_id", columnList = "commentId"),
        @Index(name = "idx_aweme_id", columnList = "awemeId")
})
public class DouyinAwemeComment extends DouyinBaseEntity {

    @Column(unique = true)
    private String commentId;

    private String awemeId;

    @Column(columnDefinition = "TEXT")
    private String content;

    private Long createTime;

    private String subCommentCount;
}
