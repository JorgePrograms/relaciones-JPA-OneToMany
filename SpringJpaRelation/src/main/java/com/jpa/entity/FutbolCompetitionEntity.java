package com.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "futbol_competition")
public class FutbolCompetitionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name="cantidad_equipos")
    private int cantidadEquipos;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="futbolass_id")
        private FutbolAssociationEntity futbolAssociationEntity;



}
