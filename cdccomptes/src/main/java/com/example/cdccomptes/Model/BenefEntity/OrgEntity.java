package com.example.cdccomptes.Model.BenefEntity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "organismes")
public class OrgEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nom_org_ar;
    private String nom_org_fr;
    private String num_depot;
    private Date date_creation;
    private String ville;
    private String adresse;
    private Date date_renouvlement;
    private String delai_validite;
    private String email;
    private Long telephone;
    private String nature_activite;
    private String emploi;
    private byte[] membres_listes;
    private byte[] systeme;
    private byte[] recu_depot;
    private byte[] cin;
    @OneToMany(mappedBy = "organismes", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Ribs> ribs;
    @ManyToOne
    private RepresentantEntity representant;
    public OrgEntity() {
    }

    public OrgEntity(Long id, String nom_org_ar, String nom_org_fr, String num_depot, Date date_creation, String ville, String adresse, Date date_renouvlement, String delai_validite, String email, Long telephone, String nature_activite, String emploi, byte[] membres_listes, byte[] systeme, byte[] recu_depot, byte[] cin, List<Ribs> ribs, RepresentantEntity representant) {
        Id = id;
        this.nom_org_ar = nom_org_ar;
        this.nom_org_fr = nom_org_fr;
        this.num_depot = num_depot;
        this.date_creation = date_creation;
        this.ville = ville;
        this.adresse = adresse;
        this.date_renouvlement = date_renouvlement;
        this.delai_validite = delai_validite;
        this.email = email;
        this.telephone = telephone;
        this.nature_activite = nature_activite;
        this.emploi = emploi;
        this.membres_listes = membres_listes;
        this.systeme = systeme;
        this.recu_depot = recu_depot;
        this.cin = cin;
        this.ribs = ribs;
        this.representant = representant;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNom_org_ar() {
        return nom_org_ar;
    }

    public void setNom_org_ar(String nom_org_ar) {
        this.nom_org_ar = nom_org_ar;
    }

    public String getNom_org_fr() {
        return nom_org_fr;
    }

    public void setNom_org_fr(String nom_org_fr) {
        this.nom_org_fr = nom_org_fr;
    }

    public String getNum_depot() {
        return num_depot;
    }

    public void setNum_depot(String num_depot) {
        this.num_depot = num_depot;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Date getDate_renouvlement() {
        return date_renouvlement;
    }

    public void setDate_renouvlement(Date date_renouvlement) {
        this.date_renouvlement = date_renouvlement;
    }

    public String getDelai_validite() {
        return delai_validite;
    }

    public void setDelai_validite(String delai_validite) {
        this.delai_validite = delai_validite;
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

    public String getNature_activite() {
        return nature_activite;
    }

    public void setNature_activite(String nature_activite) {
        this.nature_activite = nature_activite;
    }

    public String getEmploi() {
        return emploi;
    }

    public void setEmploi(String emploi) {
        this.emploi = emploi;
    }

    public byte[] getMembres_listes() {
        return membres_listes;
    }

    public void setMembres_listes(byte[] membres_listes) {
        this.membres_listes = membres_listes;
    }

    public byte[] getSysteme() {
        return systeme;
    }

    public void setSysteme(byte[] systeme) {
        this.systeme = systeme;
    }

    public byte[] getRecu_depot() {
        return recu_depot;
    }

    public void setRecu_depot(byte[] recu_depot) {
        this.recu_depot = recu_depot;
    }

    public byte[] getCin() {
        return cin;
    }

    public void setCin(byte[] cin) {
        this.cin = cin;
    }

    public List<Ribs> getRibs() {
        return ribs;
    }

    public void setRibs(List<Ribs> ribs) {
        this.ribs = ribs;
    }

    public RepresentantEntity getRepresentant() {
        return representant;
    }

    public void setRepresentant(RepresentantEntity representant) {
        this.representant = representant;
    }
}
