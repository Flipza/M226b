package ch.modul226b.model;

/**
 * Konkrete Implementation eines nationalen Gates
 * 
 * @author Philipp
 * @version V1.0
 *
 */
public class NationalesGate extends Gate {

	/**
	 * Konstruktor
	 * 
	 * @param nummer Gatenummer
	 */
	public NationalesGate(int nummer) {
		super(nummer);
	}

	/**
	 * Dummymethode. Abfrage der Groesse des Gates. Dies ist notwendig, da es sich
	 * in der Oberklasse um eine abstrakte Methode handelt. Nationale Gates haben
	 * effektiv keine Groesse (sie sind immer "gross genug")
	 */
	public int getGroesse() {
		return 0;
	}
}
