package com.jpa.entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="club")
public class ClubEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="coach_id")
    private CoachEntity coachEntity;

    @OneToMany(mappedBy = "clubEntity", cascade = CascadeType.ALL)
    private List<PlayerEntity> players;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="futbolass_id")
        private FutbolAssociationEntity futbolAssociationEntity;

}
