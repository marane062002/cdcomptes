package com.example.cdccomptes.Model.BenefEntity;

import jakarta.persistence.*;

@Entity
@Table(name = "representant_org")
public class RepresentantEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String prnom_ar;
    private String prnom_fr;
    private String nom_ar;
    private String nom_fr;
    private String email;
    private String cine;
    private Long tel;

    public RepresentantEntity() {
    }

    public RepresentantEntity(Long id, String prnom_ar, String prnom_fr, String nom_ar, String nom_fr, String email, String cine, Long tel) {
        Id = id;
        this.prnom_ar = prnom_ar;
        this.prnom_fr = prnom_fr;
        this.nom_ar = nom_ar;
        this.nom_fr = nom_fr;
        this.email = email;
        this.cine = cine;
        this.tel = tel;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getPrnom_ar() {
        return prnom_ar;
    }

    public void setPrnom_ar(String prnom_ar) {
        this.prnom_ar = prnom_ar;
    }

    public String getPrnom_fr() {
        return prnom_fr;
    }

    public void setPrnom_fr(String prnom_fr) {
        this.prnom_fr = prnom_fr;
    }

    public String getNom_ar() {
        return nom_ar;
    }

    public void setNom_ar(String nom_ar) {
        this.nom_ar = nom_ar;
    }

    public String getNom_fr() {
        return nom_fr;
    }

    public void setNom_fr(String nom_fr) {
        this.nom_fr = nom_fr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCine() {
        return cine;
    }

    public void setCine(String cine) {
        this.cine = cine;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }
}
