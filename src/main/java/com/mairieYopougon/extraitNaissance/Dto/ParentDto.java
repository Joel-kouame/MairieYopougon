package com.mairieYopougon.extraitNaissance.Dto;

import com.mairieYopougon.extraitNaissance.Domaine.Parent;

import java.util.Date;

public class ParentDto {

    private Long id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String lieuNaissance;
    private String nationalite;
    private String profession;
    private String adresse;

    public ParentDto() {
    }

    public ParentDto(Parent parent) {
        this.id = parent.getId();
        this.nom = parent.getNom();
        this.prenom = parent.getPrenom();
        this.dateNaissance = parent.getDateNaissance();
        this.lieuNaissance = parent.getLieuNaissance();
        this.nationalite = parent.getNationalite();
        this.profession = parent.getProfession();
        this.adresse = parent.getAdresse();
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
}
