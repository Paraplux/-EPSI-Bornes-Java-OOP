package com.marcbouchez.drivers;

import com.marcbouchez.models.Borne;
import com.marcbouchez.models.Maintenance;
import com.marcbouchez.models.Station;
import com.marcbouchez.models.Visite;
import com.marcbouchez.utils.Search;
import com.marcbouchez.utils.UniqueID;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MaintenanceDriver {
    private static List<Maintenance> maintenances = new LinkedList<>();

    public static void hydrate () {

    }

    public static void create () {

    }

    public static void list () {
        System.out.println("Recherche de bornes nécessitant une maintenance...");
        if (StationDriver.listStationsAReviser()) {
            System.out.println("Affecter automatiquement les visites ?");
            System.out.println("(O)ui - (N)on");
            char userChoice = new Scanner(System.in).next().charAt(0);
            if (userChoice == 'O') {
                create();
            }
        }
    }

    public List<Maintenance> getMaintenances () {
        return maintenances;
    }
}



/*
Le système doit automatiquement calculer les maintenances à faire et créer les visites et les affecter aux techniciens

        List<Borne> bornesAVisiter = new LinkedList<>();
        char choice;
int stationId = new Scanner(System.in).nextInt();
        Station laStation = (Station) Search.withId(stationId, StationDriver.getStations());
        System.out.println("Station" + laStation.getLibelleEmplacement() + "selectionnée");

        System.out.println("Selectionnez au moins une borne à maintenir parmis les suivantes : ");
        do {
            BorneDriver.list(laStation);
            int borneId = new Scanner(System.in).nextInt();
            System.out.println("Borne selectionnée");
            bornesAVisiter.add((Borne) Search.withId(borneId, BorneDriver.getBornes()));
            System.out.println("A pour ajouter une autre borne");
            System.out.println("F pour finir");
            choice = new Scanner(System.in).next().charAt(0);
        } while (choice != 'F');

        Maintenance m = new Maintenance(bornesAMaintenir, laStation);
        m.setId(UniqueID.generateFrom(maintenances));

        maintenances.add(m);

        list();

 */