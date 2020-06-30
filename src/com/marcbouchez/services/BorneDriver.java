package com.marcbouchez.services;

import com.marcbouchez.models.Borne;
import com.marcbouchez.models.Station;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BorneDriver {

    private static List<Borne> bornes = new LinkedList<>();

    public static void hydrate () {
        //Hydrate with data
        Borne b1 = new Borne();
        b1.setId(1);
        StationDriver.getStations().get(0).getLesBornes().add(b1);
        bornes.add(b1);

        Borne b2 = new Borne();
        b2.setId(2);
        StationDriver.getStations().get(2).getLesBornes().add(b2);
        bornes.add(b2);

        Borne b3 = new Borne();
        b3.setId(3);
        StationDriver.getStations().get(1).getLesBornes().add(b3);
        bornes.add(b3);

        Borne b4 = new Borne();
        b4.setId(4);
        StationDriver.getStations().get(0).getLesBornes().add(b4);
        bornes.add(b4);

        Borne b5 = new Borne();
        b5.setId(5);
        StationDriver.getStations().get(2).getLesBornes().add(b5);
        bornes.add(b5);
    }

    public static void create() {
        System.out.println("Méthode créer borne lancée");
        System.out.println("Votre borne va être reliée à une station, veuillez en choisir une ;");
        StationDriver.list();
        int stationID = new Scanner(System.in).nextInt();
        Station choosenStation = (Station) Search.withId(stationID, StationDriver.getStations());
        Borne b = new Borne();
        b.setId(UniqueID.generateFrom(bornes));

        if (choosenStation != null) {
            bornes.add(b);
            choosenStation.getLesBornes().add(b);
        } else {
            System.out.println("Erreur pendant la création de la borne, veuillez réessayer.");
        }
        list();
    }

    public static void list() {
        System.out.println("// Méthode lister stations lancée");
        for (Borne borne : bornes) {
            System.out.println(borne.toString());
        }
    }
}
