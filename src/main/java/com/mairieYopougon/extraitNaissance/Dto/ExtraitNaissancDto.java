package com.mairieYopougon.extraitNaissance.Dto;

import com.mairieYopougon.extraitNaissance.Domaine.ExtraitNaissance;

import java.time.LocalDate;
import java.time.LocalTime;

public class ExtraitNaissancDto {

    private Long id;
    private String numeroExtrait;
    private String nomEnfant;
    private String prenomEnfant;
    private LocalDate dateNaissance;
    private LocalTime heureNaissance;
    private String lieuNaissance;
    private String sexe;
    private ParentDto parent;
    private LocalDate dateDeclaration;

    public ExtraitNaissancDto() {
    }

    public ExtraitNaissancDto(ExtraitNaissance extraitNaissance) {
        this.id = extraitNaissance.getId();
        this.numeroExtrait = extraitNaissance.getNumeroExtrait();
        this.nomEnfant = extraitNaissance.getNomEnfant();
        this.prenomEnfant = extraitNaissance.getPrenomEnfant();
        this.dateNaissance = extraitNaissance.getDateNaissance();
        this.lieuNaissance = extraitNaissance.getLieuNaissance();
        this.sexe = extraitNaissance.getSexe();
        this.parent = extraitNaissance.getParent() != null ? new ParentDto(extraitNaissance.getParent()) : null;
        this.dateDeclaration = LocalDate.now();
        this.dateDeclaration = extraitNaissance.getDateDeclaration();
    }

    public String getNumeroExtrait() {
        return numeroExtrait;
    }

    public String getNomEnfant() {
        return nomEnfant;
    }

    public String getPrenomEnfant() {
        return prenomEnfant;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public LocalTime getHeureNaissance() {
        return heureNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public String getSexe() {
        return sexe;
    }

    public ParentDto getParent() {
        return parent;
    }

    public LocalDate getDateDeclaration() {
        return dateDeclaration;
    }

    public void setParent(ParentDto parent) {
        this.parent = parent;
    }

    public Long idParent() {
        return getParent().getId();
    }

}
