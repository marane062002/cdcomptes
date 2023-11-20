package com.example.cdccomptes.Model.BenefEntity;

import jakarta.persistence.*;

@Entity
@Table(name = "ribs")
public class Ribs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Long rib;
    @ManyToOne
    private OrgEntity organismes;

    public Ribs() {
    }

    public Ribs(Long id, Long rib, OrgEntity organismes) {
        Id = id;
        this.rib = rib;
        this.organismes = organismes;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getRib() {
        return rib;
    }

    public void setRib(Long rib) {
        this.rib = rib;
    }

    public OrgEntity getOrganismes() {
        return organismes;
    }

    public void setOrganismes(OrgEntity organismes) {
        this.organismes = organismes;
    }
}
