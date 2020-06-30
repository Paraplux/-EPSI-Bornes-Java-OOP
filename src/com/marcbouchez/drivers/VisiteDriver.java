package com.marcbouchez.drivers;

import com.marcbouchez.interfaces.Driver;
import com.marcbouchez.models.Borne;
import com.marcbouchez.models.Station;
import com.marcbouchez.models.TypeBorne;
import com.marcbouchez.models.Visite;
import com.marcbouchez.services.Search;
import com.marcbouchez.services.UniqueID;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class VisiteDriver implements Driver {

    private static List<Visite> visites = new LinkedList<>();

    public static void hydrate () {

    }

    public static void create () {
        List<Borne> bornesAVisiter = new LinkedList<>();
        char choice;

        System.out.println("// Méthode créer visite lancée");
        System.out.println("Selectionnez une station parmis les suivantes : ");
        StationDriver.list();
        int stationId = new Scanner(System.in).nextInt();
        Station laStation = (Station) Search.withId(stationId, StationDriver.getStations());
        System.out.println("Station" + laStation.getLibelleEmplacement() + "selectionnée");

        System.out.println("Selectionnez au moins une borne à visiter parmis les suivantes : ");
        do {
            BorneDriver.list(laStation);
            int borneId = new Scanner(System.in).nextInt();
            System.out.println("Borne selectionnée");
            bornesAVisiter.add((Borne) Search.withId(borneId, BorneDriver.getBornes()));
            System.out.println("A pour ajouter une autre borne");
            System.out.println("F pour finir");
            choice = new Scanner(System.in).next().charAt(0);
        } while (choice != 'F');

        Visite v = new Visite(bornesAVisiter, laStation);
        v.setId(UniqueID.generateFrom(visites));

        visites.add(v);

        list();
    }

    public static void list() {
        System.out.println("// Méthode lister visites lancée");
        for (Visite visite : visites) {
            System.out.println(visite.toString());
        }
    }

    public List<Visite> getVisites () {
        return visites;
    }
}
