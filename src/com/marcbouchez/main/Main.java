package com.marcbouchez.main;

import com.marcbouchez.services.BorneDriver;
import com.marcbouchez.services.StationDriver;
import com.marcbouchez.utils.Menu;

public class Main {

    public static void main(String[] args) {
    	//Hydratation
		StationDriver.hydrate();
		BorneDriver.hydrate();

	    Menu mainMenu = new Menu();

	    mainMenu.addEntry(1, "Créer une station", StationDriver::create);
		mainMenu.addEntry(2, "Lister les stations", StationDriver::list);
	    mainMenu.addEntry(3, "Créer une borne", BorneDriver::create);
		mainMenu.addEntry(4, "Lister les bornes", BorneDriver::list);
	    mainMenu.addEntry(0, "Sortir");

	    mainMenu.render();
    }

}
