package com.marcbouchez.models;

import com.marcbouchez.interfaces.Countable;

import java.time.LocalDate;

public class Borne implements Countable {

    private int id;
    private LocalDate dateDerniereRevision;
    private Integer indiceCompteurUnites;
    private TypeBorne leType;

    public Borne () {
        this.dateDerniereRevision = LocalDate.now();
        this.indiceCompteurUnites = 0;
    }

    public Integer getDureeRevision() {
        return this.leType.getDureeRevision();
    }

    public boolean estAReviser() {
        boolean dateEcoulee = dateDerniereRevision.plusDays(leType.getNbJoursEntreRevisions()).isAfter(LocalDate.now());
        boolean rechargesEcoulees = this.leType.getNbUnitesEntreRevisions() < this.indiceCompteurUnites;
        return dateEcoulee || rechargesEcoulees;
    }

    @Override
    public String toString() {
        return "Borne{" +
                "id=" + id +
                ", dateDerniereRevision=" + dateDerniereRevision +
                ", indiceCompteurUnites=" + indiceCompteurUnites +
                ", leType=" + leType.getCodeTypeBorne() +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateDerniereRevision() {
        return dateDerniereRevision;
    }

    public void setDateDerniereRevision(LocalDate dateDerniereRevision) {
        this.dateDerniereRevision = dateDerniereRevision;
    }

    public Integer getIndiceCompteurUnites() {
        return indiceCompteurUnites;
    }

    public void setIndiceCompteurUnites(Integer indiceCompteurUnites) {
        this.indiceCompteurUnites = indiceCompteurUnites;
    }

    public TypeBorne getLeType() {
        return leType;
    }

    public void setLeType(TypeBorne leType) {
        this.leType = leType;
    }


}
