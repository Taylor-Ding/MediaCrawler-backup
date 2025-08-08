package com.example.mediacrawler.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class DouyinBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId;

    private String secUid;

    private String shortUserId;

    private String userUniqueId;

    private String nickname;

    private String avatar;

    @Column(length = 500)
    private String userSignature;

    private String ipLocation;

    private Long addTs;

    private Long lastModifyTs;
}
