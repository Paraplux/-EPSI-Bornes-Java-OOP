package com.marcbouchez.drivers;

import com.marcbouchez.models.Station;
import com.marcbouchez.models.Technicien;
import com.marcbouchez.models.Visite;
import com.marcbouchez.utils.UniqueID;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TechnicienDriver {
    private static List<Technicien> techniciens = new LinkedList<>();

    public static void hydrate () {
        Technicien t1 = new Technicien();
        t1.setId(1);
        t1.setNom("Francis");
        t1.setPrenom("Underwood");
        techniciens.add(t1);

        Technicien t2 = new Technicien();
        t2.setId(2);
        t2.setNom("Clint");
        t2.setPrenom("Eastwood");
        techniciens.add(t2);

        Technicien t3 = new Technicien();
        t3.setId(3);
        t3.setNom("Will");
        t3.setPrenom("Coyotte");
        techniciens.add(t3);
    }

    public static void create () {
        System.out.println("Vous allez créer un nouveau technicien.");
        Technicien t = new Technicien();
        System.out.println("Nom : ");
        t.setNom(new Scanner(System.in).next());
        System.out.println("Prénom : ");
        t.setPrenom(new Scanner(System.in).next());

        t.setId(UniqueID.generateFrom(techniciens));

        techniciens.add(t);
        System.out.println("Technicien créé avec succès.");
    }

    public static void list () {
        System.out.println("Voici la liste des techniciens :");
        for (Technicien technicien : techniciens) {
            System.out.println(technicien.toString());
        }
    }

    public List<Technicien> getTechniciens () {
        return techniciens;
    }
}
