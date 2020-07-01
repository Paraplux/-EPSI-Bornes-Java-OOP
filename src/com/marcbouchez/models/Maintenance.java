package com.marcbouchez.models;

import com.marcbouchez.utils.Countable;

import java.util.List;

public class Maintenance implements Countable {

    private int id;

    private List<Station> lesStations;
    private List<Technicien> lesTechniciens;
    private List<Visite> lesVisites;

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void reviser() {

    }

    public void affecterVisites() {
        
    }
}
