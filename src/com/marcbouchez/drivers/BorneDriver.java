package com.marcbouchez.drivers;

import com.marcbouchez.models.Borne;
import com.marcbouchez.models.Station;
import com.marcbouchez.interfaces.Driver;
import com.marcbouchez.models.TypeBorne;
import com.marcbouchez.utils.Search;
import com.marcbouchez.utils.UniqueID;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


/**
 * Nous permet de gérer les bornes sans toucher au model Borne
 */
public class BorneDriver implements Driver {

    private static List<Borne> bornes = new LinkedList<>();

    public static void hydrate () {
        //Hydrate with data
        Borne b1 = new Borne();
        b1.setId(1);
        b1.setIndiceCompteurUnites(1001);
        b1.setLeType( (TypeBorne) Search.withId(1, TypeBorneDriver.getTypeBornes()));
        StationDriver.getStations().get(0).getLesBornes().add(b1);
        bornes.add(b1);

        Borne b2 = new Borne();
        b2.setId(2);
        b2.setLeType( (TypeBorne) Search.withId(1, TypeBorneDriver.getTypeBornes()));
        StationDriver.getStations().get(2).getLesBornes().add(b2);
        bornes.add(b2);

        Borne b3 = new Borne();
        b3.setId(3);
        b3.setLeType( (TypeBorne) Search.withId(2, TypeBorneDriver.getTypeBornes()));
        StationDriver.getStations().get(1).getLesBornes().add(b3);
        bornes.add(b3);

        Borne b4 = new Borne();
        b4.setId(4);
        b4.setLeType( (TypeBorne) Search.withId(1, TypeBorneDriver.getTypeBornes()));
        StationDriver.getStations().get(0).getLesBornes().add(b4);
        bornes.add(b4);

        Borne b5 = new Borne();
        b5.setId(5);
        b5.setLeType( (TypeBorne) Search.withId(2, TypeBorneDriver.getTypeBornes()));
        StationDriver.getStations().get(2).getLesBornes().add(b5);
        bornes.add(b5);
    }

    public static void create() {
        System.out.println("Méthode créer borne lancée");
        System.out.println("Quel est le type de la borne ?");
        TypeBorneDriver.list();
        int borneID = new Scanner(System.in).nextInt();
        System.out.println("Type : " + borneID + " selectionné.");
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
        System.out.println("// Méthode lister bornes lancée");
        for (Borne borne : bornes) {
            System.out.println(borne.toString());
        }
    }

    public static void list(Station laStation) {
        System.out.println("// Méthode lister bornes (station) lancée");
        for (Borne borne : laStation.getLesBornes()) {
            System.out.println(borne.toString());
        }
    }


    public static List<Borne> getBornes () {
        return bornes;
    }
}
