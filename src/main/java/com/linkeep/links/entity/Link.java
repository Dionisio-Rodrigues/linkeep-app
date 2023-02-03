package com.linkeep.links.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "links")
public class Link{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "_user")
    @Nonnull
    private String user;

    @Column(name = "_uri")
    @Nonnull
    private String uri;

    @Column(name = "_name")
    private String name;

    @Column(name = "_icon")
    private String icon;
}