package com.example.tp2;

public class Fruit {
    private String nom; // Nom du Fruit
    private String description; // La description
    private String nomIcone;

    // Constructor
    public Fruit(String nom, String description, String nomIcone) {
        this.nom = nom;
        this.description = description;
        this.nomIcone = nomIcone;
    }

    // Getters and setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNomIcone() {
        return nomIcone;
    }

    public void setNomIcone(String nomIcone) {
        this.nomIcone = nomIcone;
    }
}
