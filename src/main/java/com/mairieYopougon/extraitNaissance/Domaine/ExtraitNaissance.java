package com.mairieYopougon.extraitNaissance.Domaine;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

@Entity
@Table(name = "extrait_naissance")
public class ExtraitNaissance {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "extrait_naissance_id_seq")
    @SequenceGenerator(name = "extrait_naissance_id_seq", sequenceName = "extrait_naissance_id_SEQ", allocationSize = 50)
    private Long id;

    @Column(name = "numero_extrait")
    private String numeroExtrait;

    @Column(name = "nom_enfant")
    private String nomEnfant;

    @Column(name = "prenom_enfant")
    private String prenomEnfant;

    @Column(name = "date_naissance")
    private LocalDate dateNaissance;

    @Column(name = "heure_naissance")
    private LocalTime heureNaissance;

    @Column(name = "lieu_naissance")
    private String lieuNaissance;

    private String sexe;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Parent parent;

    @Column(name = "date_declaration")
    private LocalDate dateDeclaration;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "update_by")
    private String updateBy;

    public ExtraitNaissance() {
    }

    public ExtraitNaissance(Long id, String numeroExtrait, String nomEnfant,
                            String prenomEnfant, LocalDate dateNaissance, String lieuNaissance, LocalTime heureNaissance,
                            String sexe, Parent parent, LocalDate dateDeclaration, LocalDateTime createdAt, String createBy,
                            LocalDateTime updatedAt, String updateBy) {
        this.id = id;
        this.numeroExtrait = numeroExtrait;
        this.nomEnfant = nomEnfant;
        this.prenomEnfant = prenomEnfant;
        this.dateNaissance = dateNaissance;
        this.heureNaissance = heureNaissance;
        this.lieuNaissance = lieuNaissance;
        this.sexe = sexe;
        this.parent = new Parent();
        this.dateDeclaration = dateDeclaration;
        this.createdAt = createdAt;
        this.createBy = createBy;
        this.updatedAt = updatedAt;
        this.updateBy = updateBy;
    }


    public Long getId() {
        return id;
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

    public Parent getParent() {
        return parent;
    }

    public LocalDate getDateDeclaration() {
        return dateDeclaration;
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