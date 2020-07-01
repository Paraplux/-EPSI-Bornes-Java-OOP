package com.marcbouchez.main;

import com.marcbouchez.drivers.*;
import com.marcbouchez.models.Technicien;
import com.marcbouchez.utils.Menu;

public class Main {

    public static void main(String[] args) {

    	//Hydratation
		TypeBorneDriver.hydrate();

		StationDriver.hydrate();
		BorneDriver.hydrate();
		TechnicienDriver.hydrate();

		//Menu creation
	    Menu mainMenu = new Menu();

	    mainMenu.addEntry(1, "Créer une station", StationDriver::create);
		mainMenu.addEntry(2, "Lister les stations", StationDriver::list);
	    mainMenu.addEntry(3, "Créer une borne", BorneDriver::create);
		mainMenu.addEntry(4, "Lister les bornes", BorneDriver::list);
		mainMenu.addEntry(5, "Créer un technicien", TechnicienDriver::create);
		mainMenu.addEntry(6, "Lister les techniciens", TechnicienDriver::list);
		mainMenu.addEntry(7, "Vérifier les maintenances", MaintenanceDriver::list);
	    mainMenu.addEntry(0, "Sortir");

	    mainMenu.render();
    }

}
