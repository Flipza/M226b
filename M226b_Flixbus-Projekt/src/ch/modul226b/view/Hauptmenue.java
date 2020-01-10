package ch.modul226b.view;
import ch.modul226b.model.*;

private Busbahnhof busbahnhof;


import ch.modul226b.utils.ConsoleReader;

public class Hauptmenue {

	public static void main(String[] args) {
		Hauptmenue menue = new Hauptmenue();
		while (menue.aktion()) {
			// einfach immer wieder anzeigen
		}
		System.out.println();
		System.out.println("Besten Dank und auf Widersehen.");

<<<<<<< HEAD
public class Hauptmenue {
	busbahnhof = new Busbahnhof();
=======
	}
>>>>>>> 03d6115eb8e3d7c92c176d4b02aff1a93dbcc92c

	private void anzeigen() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Busstation Scheduler Hauptmenü");
		System.out.println("==============================");
		System.out.println();
		System.out.println("1 Ankunft");
		System.out.println("2 Abfahrt");
		System.out.println("3 Gatedaten");
		System.out.println();
		System.out.println("4 Ende");
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

	private void ankunft() {
		System.out.println("Ankunft...");
	}

	private void abfahrt() {
		System.out.println("Abfahrt...");
	}

	private void gateDatenAnzeigen() {
		System.out.println("Gate Daten Anzeigen...");
	}

}
