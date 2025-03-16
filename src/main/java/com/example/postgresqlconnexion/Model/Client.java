package com.example.postgresqlconnexion.Model;
import jakarta.persistence.*;

@Entity
@Table(name = "Clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private String email;
    private String tel;
    private String adress;
    private String dateNaiss;

    public Client() {}

    public Client(String nom, String prenom, String email, String tel, String adress, String dateNaiss) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.adress = adress;
        this.dateNaiss = dateNaiss;
    }

    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getEmail() {
        return email;
    }
    public String getTel() {
        return tel;
    }
    public String getAdress() {
        return adress;
    }
    public String getDateNaiss() {
        return dateNaiss;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public void setDateNaiss(String dateNaiss) {
        this.dateNaiss = dateNaiss;
    }
}
