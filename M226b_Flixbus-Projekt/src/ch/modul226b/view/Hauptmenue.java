package ch.modul226b.view;
import ch.modul226b.model.*;

private Busbahnhof busbahnhof;


import ch.modul226b.utils.ConsoleReader;



public class Hauptmenue {
	busbahnhof = new Busbahnhof();

	private void anzeigen() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Busstation Scheduler Hauptmen�");
		System.out.println("==============================");
		System.out.println();
		System.out.println("1 Ankunft");
		System.out.println("2 Abfahrt");
		System.out.println("3 Gatedaten");
		System.out.println();
		System.out.println("4 Ende");
	}
}

public boolean aktion() {
	while (true) {
		anzeigen();
		
		int eingabe = ConsoleReader.readInteger("Ihre Wahl");
		switch (eingabe) {
		case 1:
			ankunft();
			return true;
		case 2:
			abfahrt();
			return true;
		case 3:
			gateDatenAnzeigen();
			return true;
		case 4:
			return false;
		default:
			System.out.println("Ungueltige Wahl");
		}
	}
}
