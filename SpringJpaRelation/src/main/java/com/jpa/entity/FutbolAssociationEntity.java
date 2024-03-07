package com.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="futbol_association")
public class FutbolAssociationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String country;

    @OneToMany(mappedBy = "futbolAssociationEntity", cascade = CascadeType.ALL)
    private List<ClubEntity>clubEntities;

    @OneToMany(mappedBy ="futbolAssociationEntity", cascade = CascadeType.ALL)
    private List<FutbolCompetitionEntity>futbolCompetitionEntities;


}
