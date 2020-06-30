package com.marcbouchez.models;

import java.util.List;

public class Technicien {

    private Integer matricule;
    private String nom;
    private String prenom;
    private List<Visite> lesVisites;

    public Integer getTempsOccupe() {
        return 0;
    }

    public void affecterVisite(Visite uneVisite) {
        this.lesVisites.add(uneVisite);
    }

    public List<Visite> getLesVisites() {
        return this.lesVisites; //boucle
    }
}
