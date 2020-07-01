package com.marcbouchez.drivers;

import com.marcbouchez.interfaces.Driver;
import com.marcbouchez.models.TypeBorne;

import java.util.LinkedList;
import java.util.List;

/**
 * Nous permet de gérer les types de bornes sans toucher au model TypeBorne
 */
public class TypeBorneDriver implements Driver {
    private static List<TypeBorne> typeBornes = new LinkedList<>();

    public static void hydrate () {
        TypeBorne t1 = new TypeBorne();
        t1.setId(1);
        t1.setCodeTypeBorne("BORNE" + 1);
        t1.setDureeRevision(2);
        t1.setNbJoursEntreRevisions(30);
        t1.setNbUnitesEntreRevisions(1000);
        typeBornes.add(t1);

        TypeBorne t2 = new TypeBorne();
        t2.setId(2);
        t2.setCodeTypeBorne("BORNE" + 2);
        t2.setDureeRevision(3);
        t2.setNbJoursEntreRevisions(90);
        t2.setNbUnitesEntreRevisions(5000);
        typeBornes.add(t2);
    }

    public static void create () {
        //no creation atm
    }

    public static void list() {
        System.out.println("// Méthode lister typeBornes lancée");
        for (TypeBorne typeBorne : typeBornes) {
            System.out.println(typeBorne.toString());
        }
    }

    public static List<TypeBorne> getTypeBornes () {
        return typeBornes;
    }

}
