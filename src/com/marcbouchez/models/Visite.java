package com.marcbouchez.models;

import java.util.List;

public class Visite {

    private int id;
    private Character etat;
    private Integer dureeTotale;
    private Station laStation;
    private List<Borne> lesBornes;

    public Visite (List<Borne> lesBornesAVisiter, Station uneStation) {
        this.lesBornes = lesBornesAVisiter;
        this.laStation = uneStation;
        this.etat = 'p';
        this.dureeTotale = 0;
        for (Borne borne : lesBornesAVisiter) {
            this.dureeTotale += borne.getDureeRevision();
        }
    }

    public int getId () {
        return this.id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public Character getEtat() {
        return this.etat;
    }

    public void setEtat() {
        //Si elle est programmée elle passera en affectée dans tous les autres cas elle passe en réalisée
        // même si elle était déjà à réalisée, elle restera à réalisée
        this.etat = this.etat == 'p' ? 'a'  : 'r';
    }

    public Integer getDureeTotale() {
        return this.dureeTotale;
    }

    public void setDureeTotale(Integer dureeTotale) {
        this.dureeTotale = dureeTotale;
    }

    public Station getLaStation() {
        return laStation;
    }

    public void setLaStation(Station laStation) {
        this.laStation = laStation;
    }

    public List<Borne> getLesBornes() {
        return lesBornes;
    }

    public void setLesBornes(List<Borne> lesBornes) {
        this.lesBornes = lesBornes;
    }

    @Override
    public String toString() {
        return "Visite{" +
                "id=" + id +
                ", etat=" + etat +
                ", dureeTotale=" + dureeTotale +
                ", laStation=" + laStation.getLibelleEmplacement() +
                ", lesBornes=" + lesBornes +
                '}';
    }
}
