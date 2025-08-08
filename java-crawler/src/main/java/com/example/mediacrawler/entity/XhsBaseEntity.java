package com.example.mediacrawler.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class XhsBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId;

    private String nickname;

    private String avatar;

    private String ipLocation;

    private Long addTs;

    private Long lastModifyTs;
}
