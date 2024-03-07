package com.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

    @Setter
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Table(name="player")
    public class PlayerEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        @Column(name="last_name")
        private String lastName;
        private String nationality;
        private Integer age;
        private String position;

        @ManyToOne(cascade = CascadeType.ALL)
        @JoinColumn(name="club_id")
        private ClubEntity clubEntity;
    }

