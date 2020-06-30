package com.marcbouchez.models;

import com.marcbouchez.interfaces.Countable;

public class TypeBorne implements Countable {

    private int id;

    private String codeTypeBorne;
    private Integer dureeRevision;
    private Integer nbJoursEntreRevisions;
    private Integer nbUnitesEntreRevisions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeTypeBorne() {
        return codeTypeBorne;
    }

    public void setCodeTypeBorne(String codeTypeBorne) {
        this.codeTypeBorne = codeTypeBorne;
    }

    public Integer getDureeRevision() {
        return this.dureeRevision;
    }

    public void setDureeRevision(Integer dureeRevision) {
        this.dureeRevision = dureeRevision;
    }

    public Integer getNbJoursEntreRevisions() {
        return this.nbJoursEntreRevisions;
    }

    public void setNbJoursEntreRevisions(Integer nbJoursEntreRevisions) {
        this.nbJoursEntreRevisions = nbJoursEntreRevisions;
    }

    public Integer getNbUnitesEntreRevisions() {
        return this.nbUnitesEntreRevisions;
    }

    public void setNbUnitesEntreRevisions(Integer nbUnitesEntreRevisions) {
        this.nbUnitesEntreRevisions = nbUnitesEntreRevisions;
    }

}
