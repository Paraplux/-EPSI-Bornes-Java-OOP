package com.marcbouchez.models;

import java.util.List;

public class Visite {

    private Character etat;
    private Integer dureeTotale;
    private Station laStation;
    private List<Borne> lesBornes;

    public Visite (List<Borne> lesBornesAVisiter, Station uneStation) {

    }

    public Integer getDureeTotale() {
        return this.dureeTotale;
    }

    public Character getEtat() {
        return this.etat;
    }

    public void changerEtat() {

    }
}
