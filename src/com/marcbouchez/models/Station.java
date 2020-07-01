package com.marcbouchez.models;

import com.marcbouchez.utils.Countable;

import java.util.LinkedList;
import java.util.List;

public class Station implements Countable {

    private int id;
    private String libelleEmplacement;
    private List<Borne> lesBornes;

    public Station () {
        this.lesBornes = new LinkedList<>();
    }

    public Visite getVisiteAFaire() {
        Visite visite;
        List<Borne> lesBornesAVisiter;
        lesBornesAVisiter = new LinkedList<>();
        for (Borne borne : lesBornes) {
            if (borne.estAReviser()) {
                lesBornesAVisiter.add(borne);
            }
        }
        visite = new Visite(lesBornesAVisiter, this);
        return visite;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelleEmplacement() {
        return this.libelleEmplacement;
    }

    public void setLibelleEmplacement(String libelleEmplacement) {
        this.libelleEmplacement = libelleEmplacement;
    }

    public List<Borne> getLesBornes() {
        return lesBornes;
    }

    public void setLesBornes(List<Borne> lesBornes) {
        this.lesBornes = lesBornes;
    }

    @Override
    public String toString() {
        return "Station{" +
                "id=" + id +
                ", libelleEmplacement='" + libelleEmplacement + '\'' +
                ", lesBornes=" + lesBornes +
                '}';
    }
}
