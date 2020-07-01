package com.marcbouchez.drivers;

import com.marcbouchez.interfaces.Driver;
import com.marcbouchez.models.Borne;
import com.marcbouchez.models.Station;
import com.marcbouchez.models.Visite;
import com.marcbouchez.utils.Search;
import com.marcbouchez.utils.UniqueID;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


/**
 * Nous permet de gérer les visites sans toucher au model Borne
 */
public class VisiteDriver implements Driver {

    private static List<Visite> visites = new LinkedList<>();

    public static void hydrate () {

    }

    public static void create () {

    }

    public static void list() {
        System.out.println("Voici la liste des visites :");
        for (Visite visite : visites) {
            System.out.println(visite.toString());
        }
    }

    public List<Visite> getVisites () {
        return visites;
    }
}
