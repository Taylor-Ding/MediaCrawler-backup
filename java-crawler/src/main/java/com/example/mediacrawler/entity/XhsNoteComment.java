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
@Table(name = "xhs_note_comment", indexes = {
        @Index(name = "idx_comment_id", columnList = "commentId"),
        @Index(name = "idx_create_time", columnList = "createTime")
})
public class XhsNoteComment extends XhsBaseEntity {

    @Column(unique = true)
    private String commentId;

    private Long createTime;

    private String noteId;

    @Column(columnDefinition = "TEXT")
    private String content;

    private Integer subCommentCount;

    private String pictures;
}
