package com.example.mediacrawler.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "xhs_creator")
public class XhsCreator extends XhsBaseEntity {

    @Column(columnDefinition = "TEXT")
    private String description;

    private String gender;

    private String follows;

    private String fans;

    private String interaction;

    @Column(columnDefinition = "TEXT")
    private String tagList;
}
