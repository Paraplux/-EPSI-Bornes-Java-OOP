package com.marcbouchez.models;

import java.util.List;

public class Technicien {

    private int id;
    private String nom;
    private String prenom;
    private List<Visite> lesVisites;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setLesVisites(List<Visite> lesVisites) {
        this.lesVisites = lesVisites;
    }

    public Integer getTempsOccupe() {
        int tempsOccupe = 0;
        for (Visite visite : lesVisites) {
            tempsOccupe += visite.getDureeTotale();
        }
        return tempsOccupe;
    }

    public void affecterVisite(Visite uneVisite) {
        this.lesVisites.add(uneVisite);
    }

    @Override
    public String toString() {
        return "Technicien{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", lesVisites=" + lesVisites +
                '}';
    }

    public List<Visite> getLesVisites() {
        return this.lesVisites;
    }
}
