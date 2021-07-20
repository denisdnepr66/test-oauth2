package com.example.testoauth2.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "community_page")
@Entity
@Data
public class CommunityPage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
}