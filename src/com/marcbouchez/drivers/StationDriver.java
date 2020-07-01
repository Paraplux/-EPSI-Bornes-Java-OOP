package com.marcbouchez.drivers;

import com.marcbouchez.interfaces.Driver;
import com.marcbouchez.models.Borne;
import com.marcbouchez.models.Station;
import com.marcbouchez.utils.UniqueID;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Nous permet de gérer les stations sans toucher au model Station
 */
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
        System.out.println("Donnez l'emplacement de la station : ");
        String emplacement = new Scanner(System.in).next();

        Station s = new Station();
        s.setId(UniqueID.generateFrom(stations));
        s.setLibelleEmplacement(emplacement);

        stations.add(s);
        System.out.println("Station créée avec succès.");
    }

    public static void list() {
        for (Station station : stations) {
            System.out.println(station.toString());
        }
    }

    public static boolean listStationsAReviser() {
        boolean foundBornesAReviser = false;
        for (Station station : stations) {
            for (Borne borne : station.getLesBornes()) {
                if (borne.estAReviser()) {
                    System.out.println("La borne " + borne.getId() + " de la station " + station.getLibelleEmplacement() + " nécessite une maintenance");
                    foundBornesAReviser = true;
                }
            }
        }
        if (!foundBornesAReviser) {
            System.out.println("Aucune borne ne nécessite de maintenance.");
            return false;
        }
        return true;
    }

    public static List<Station> getStations () {
        return stations;
    }
}
