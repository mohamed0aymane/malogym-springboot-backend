package com.gym.malo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="adherant")
public class Adherant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer adherantId;
    private String adherantNom;
    private String adherantPrenom;
    private String adherantAge;
    private String adherantCin;
    private String adherantPoids;
    private String adherantTaille;
    private String adherantAdress;
    private String adherantContactNumber;
    private String adherantEtatMedical;
    private String adherantPack;
    private String adherantDure;
    private String adherantDate;
    private String adherantMotPasse;


    public Adherant(){

    }

    public Integer getAdherantId() {
        return adherantId;
    }

    public void setAdherantId(Integer adherantId) {
        this.adherantId = adherantId;
    }

    public String getAdherantNom() {
        return adherantNom;
    }

    public void setAdherantNom(String adherantNom) {
        this.adherantNom = adherantNom;
    }

    public String getAdherantPrenom() {
        return adherantPrenom;
    }

    public void setAdherantPrenom(String adherantPrenom) {
        this.adherantPrenom = adherantPrenom;
    }

    public String getAdherantAge() {
        return adherantAge;
    }

    public void setAdherantAge(String adherantAge) {
        this.adherantAge = adherantAge;
    }

    public String getAdherantCin() {
        return adherantCin;
    }

    public void setAdherantCin(String adherantCin) {
        this.adherantCin = adherantCin;
    }

    public String getAdherantPoids() {
        return adherantPoids;
    }

    public void setAdherantPoids(String adherantPoids) {
        this.adherantPoids = adherantPoids;
    }

    public String getAdherantTaille() {
        return adherantTaille;
    }

    public void setAdherantTaille(String adherantTaille) {
        this.adherantTaille = adherantTaille;
    }

    public String getAdherantAdress() {
        return adherantAdress;
    }

    public void setAdherantAdress(String adherantAdress) {
        this.adherantAdress = adherantAdress;
    }

    public String getAdherantContactNumber() {
        return adherantContactNumber;
    }

    public void setAdherantContactNumber(String adherantContactNumber) {
        this.adherantContactNumber = adherantContactNumber;
    }

    public String getAdherantEtatMedical() {
        return adherantEtatMedical;
    }

    public void setAdherantEtatMedical(String adherantEtatMedical) {
        this.adherantEtatMedical = adherantEtatMedical;
    }

    public String getAdherantPack() {
        return adherantPack;
    }

    public void setAdherantPack(String adherantPack) {
        this.adherantPack = adherantPack;
    }

    public String getAdherantDure() {
        return adherantDure;
    }

    public void setAdherantDure(String adherantDure) {
        this.adherantDure = adherantDure;
    }

    public String getAdherantDate() {
        return adherantDate;
    }

    public void setAdherantDate(String adherantDate) {
        this.adherantDate = adherantDate;
    }

    public String getAdherantMotPasse() {
        return adherantMotPasse;
    }

    public void setAdherantMotPasse(String adherantMotPasse) {
        this.adherantMotPasse = adherantMotPasse;
    }
}
