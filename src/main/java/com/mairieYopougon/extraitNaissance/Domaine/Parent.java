package com.mairieYopougon.extraitNaissance.Domaine;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name= "parents")
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "parents_id_seq")
    @SequenceGenerator(name = "parents_id_seq", sequenceName = "parents_id_SEQ", allocationSize = 50)
    private Long id;

    private String nom;
    private String prenom;

    @Column(name = "date_naissance")
    private Date dateNaissance;

    @Column(name = "lieu_naissance")
    private String lieuNaissance;

    private String nationalite;
    private String profession;
    private String adresse;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "update_by")
    private String updateBy;

    public Parent() {
    }

    public Parent(Long id, String nom, String prenom, Date dateNaissance,
                  String lieuNaissance, String nationalite, String profession,
                  String adresse, LocalDateTime createdAt, String createBy,
                  LocalDateTime updatedAt, String updateBy) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
        this.nationalite = nationalite;
        this.profession = profession;
        this.adresse = adresse;
        this.createdAt = createdAt;
        this.createBy = createBy;
        this.updatedAt = updatedAt;
        this.updateBy = updateBy;
    }

    public Parent(Parent parent) {
        this.id = parent.id;
        this.nom = parent.nom;
        this.prenom = parent.prenom;
        this.dateNaissance = parent.dateNaissance;
        this.lieuNaissance = parent.lieuNaissance;
        this.nationalite = parent.nationalite;
        this.profession = parent.profession;
        this.adresse = parent.adresse;
        this.createdAt = parent.createdAt;
        this.createBy = parent.createBy;
        this.updatedAt = parent.updatedAt;
        this.updateBy = parent.updateBy;
    }


    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public String getNationalite() {
        return nationalite;
    }

    public String getProfession() {
        return profession;
    }

    public String getAdresse() {
        return adresse;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public String getUpdateBy() {
        return updateBy;
    }


}
