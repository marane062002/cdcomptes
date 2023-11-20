package com.example.cdccomptes.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "donateur")
public class DonateurEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nom_ar;
    private String nom_fr;
    private String prenom_ar;
    private String prenom_fr;
    private String character;
    private String cine;
    private String email;
    private Long telephone;
    private byte[] demande_access;
    private String demende_access_url;
    private byte[] cin;
    private String cin_url;

    public DonateurEntity() {
    }

    public DonateurEntity(Long id, String nom_ar, String nom_fr, String prenom_ar, String prenom_fr, String character, String cine, String email, Long telephone, byte[] demande_access, String demende_access_url, byte[] cin, String cin_url) {
        Id = id;
        this.nom_ar = nom_ar;
        this.nom_fr = nom_fr;
        this.prenom_ar = prenom_ar;
        this.prenom_fr = prenom_fr;
        this.character = character;
        this.cine = cine;
        this.email = email;
        this.telephone = telephone;
        this.demande_access = demande_access;
        this.demende_access_url = demende_access_url;
        this.cin = cin;
        this.cin_url = cin_url;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public String getPrenom_ar() {
        return prenom_ar;
    }

    public void setPrenom_ar(String prenom_ar) {
        this.prenom_ar = prenom_ar;
    }

    public String getPrenom_fr() {
        return prenom_fr;
    }

    public void setPrenom_fr(String prenom_fr) {
        this.prenom_fr = prenom_fr;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getCine() {
        return cine;
    }

    public void setCine(String cine) {
        this.cine = cine;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }

    public byte[] getDemande_access() {
        return demande_access;
    }

    public void setDemande_access(byte[] demande_access) {
        this.demande_access = demande_access;
    }

    public String getDemende_access_url() {
        return demende_access_url;
    }

    public void setDemende_access_url(String demende_access_url) {
        this.demende_access_url = demende_access_url;
    }

    public byte[] getCin() {
        return cin;
    }

    public void setCin(byte[] cin) {
        this.cin = cin;
    }

    public String getCin_url() {
        return cin_url;
    }

    public void setCin_url(String cin_url) {
        this.cin_url = cin_url;
    }
}
