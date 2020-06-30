package com.marcbouchez.main;

import com.marcbouchez.drivers.BorneDriver;
import com.marcbouchez.drivers.StationDriver;
import com.marcbouchez.drivers.VisiteDriver;
import com.marcbouchez.drivers.TypeBorneDriver;
import com.marcbouchez.utils.Menu;

public class Main {

    public static void main(String[] args) {
    	//Hydratation
		TypeBorneDriver.hydrate();

		StationDriver.hydrate();
		BorneDriver.hydrate();

	    Menu mainMenu = new Menu();

	    mainMenu.addEntry(1, "Créer une station", StationDriver::create);
		mainMenu.addEntry(2, "Lister les stations", StationDriver::list);
	    mainMenu.addEntry(3, "Créer une borne", BorneDriver::create);
		mainMenu.addEntry(4, "Lister les bornes", BorneDriver::list);
		mainMenu.addEntry(5, "Créer une visite", VisiteDriver::create);
		mainMenu.addEntry(6, "Lister les visites", VisiteDriver::list);
	    mainMenu.addEntry(0, "Sortir");

	    mainMenu.render();
    }

}
