package ch.modul226b.view;
import ch.modul226b.model.*;

private Busbahnhof busbahnhof;


public class Hauptmenue {
	busbahnhof = new Busbahnhof();

	private void anzeigen() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Busstation Scheduler Hauptmenü");
		System.out.println("==============================");
		System.out.println();
		System.out.println("1 Landen");
		System.out.println("2 Starten");
		System.out.println("3 Gatedaten");
		System.out.println();
		System.out.println("4 Ende");
	}
}
