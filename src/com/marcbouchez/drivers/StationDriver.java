package com.marcbouchez.drivers;

import com.marcbouchez.interfaces.Driver;
import com.marcbouchez.models.Station;
import com.marcbouchez.services.UniqueID;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StationDriver implements Driver {

    private static List<Station> stations = new LinkedList<>();

    public static void hydrate () {
        //Hydrate with data
        Station s1 = new Station();
        s1.setId(1);
        s1.setLibelleEmplacement("Etaples");
        stations.add(s1);

        Station s2 = new Station();
        s2.setId(2);
        s2.setLibelleEmplacement("Angers");
        stations.add(s2);

        Station s3 = new Station();
        s3.setId(3);
        s3.setLibelleEmplacement("Bordeaux");
        stations.add(s3);
    }

    public static void create() {
        System.out.println("// Méthode créer station lancée");
        System.out.println("Donnez l'emplacement de la station : ");
        String emplacement = new Scanner(System.in).next();

        Station s = new Station();
        s.setId(UniqueID.generateFrom(stations));
        s.setLibelleEmplacement(emplacement);

        stations.add(s);

        list();
    }

    public static void list() {
        System.out.println("// Méthode lister stations lancée");
        for (Station station : stations) {
            System.out.println(station.toString());
        }
    }

    public static List<Station> getStations () {
        return stations;
    }
}
