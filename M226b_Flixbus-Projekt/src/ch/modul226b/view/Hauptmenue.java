package ch.modul226b.view;
import ch.modul226b.model.*;
import ch.modul226b.utils.ConsoleReader;






public class Hauptmenue {

	public static void main(String[] args) {
		Hauptmenue menue = new Hauptmenue();
		while (menue.aktion()) {
			// einfach immer wieder anzeigen
		}
		System.out.println();
		System.out.println("Besten Dank und auf Widersehen.");
	}
	
private Busbahnhof busbahnhof;

public Hauptmenue() {
	busbahnhof = new Busbahnhof();


	}


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
		System.out.println("\n\n\nAnkunft...\n\n");
		Fahrt fahrt = fahrtDatenBeschaffen();
		try {
		int gateNummer = busbahnhof.ankunft(fahrt);
		System.out.println("Fahrzeug ist am Gate" + gateNummer + " angekommen");
		}
		catch(NoGateAvailableException ex) {
			System.out.println(ex.getMessage());
		}
	}

	private void abfahrt() {
		System.out.println("Abfahrt...");
	}

	private void gateDatenAnzeigen() {
		System.out.println("Gate Daten Anzeigen...");
		int gateNummer = ConsoleReader.readInteger("Gatenummer eingeben");
		try {
			Gate gate = busbahnhof.getGate(gateNummer);
			if (gate.istFrei()) {
				System.out.println("Gate ist frei\n\n\n");
				return;
			}
			if (gate instanceof NationalesGate) {
				System.out.println("Nationales Gate");
				System.out.println("---------------");
			}
			else {
				System.out.println("Internationales Gate");
				System.out.println("--------------------");
				System.out.println(
						gate.getGroesse() == InternationalesGate.GROSS 
						? "Grosses Gate" 
						: "kleines Gate");
			}
			System.out.println("Busnummer: " + gate.getFahrt().getNummer());
			System.out.println("Bustyp")
			+ (gate.getBus().getTyp() == Bus.ELEKTRO ? "Elektro" : "benzin"));
		}
		catch (InvalidGateNumberException ex) {
			System.out.println(ex.getMessage());
		}
	}

	private Fahrt fahrtDatenBeschaffen() {
		Fahrt fahrt = new Fahrt();
		System.out.println();
		System.out.println();
		System.out.println("Bitte Fahrtdaten eingeben");
		System.out.println("------------------------");
		fahrt.setNummer(ConsoleReader.readInteger("Fahrtnummer"));
		fahrt.setAnkunftzeit(ConsoleReader.readString("Ankunftzeit"));
		fahrt.setAbfahrtzeit(ConsoleReader.readString("Abfahrtzeit"));
		
		fahrt.setBus(busDatenBeschaffen());
		return fahrt;
	}
	
	private Bus busDatenBeschaffen() {
		Bus bus = new Bus();
		bus.setTyp(ConsoleReader.readInteger("Fahrzeugtyp (0=Elektro, 1=Kerosin)"));
		bus.setKapazitaet(ConsoleReader.readInteger("Passagieranzahl"));
		bus.setNachtankzeit(ConsoleReader.readString("Nachtankzeit"));
		return bus;
	}
	
}
