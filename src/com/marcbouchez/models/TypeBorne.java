package com.marcbouchez.models;

public class TypeBorne {

    private String codeTypeBorne;
    private Integer dureeRevision;
    private Integer nbJoursEntreRevisions;
    private Integer nbUnitesEntreRevisions;


    public Integer getDureeRevision() {
        return this.dureeRevision;
    }

    public Integer getNbJoursEntreRevisions() {
        return this.nbJoursEntreRevisions;
    }

    public Integer getNbUnitesEntreRevisions() {
        return this.nbUnitesEntreRevisions;
    }
}
