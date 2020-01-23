package ch.modul226b.model;

/**
 * Die konkrete Implementierung eines internationalen Gates<br />
 * Internationale Gates kommen in zwei verschiedenen Groessen vor
 * 
 * @author Philipp
 * @version V1.0
 *
 */

public class InternationalesGate extends Gate {

	/**
	 * Konstante definiert den Wert fuer kleine Gates
	 */
	public static final int KLEIN = 0;

	/**
	 * Konstante definiert den Wert fuer grosse Gates
	 */
	public static final int GROSS = 1;

	/**
	 * Die Groesse des Gates. Dies ist einer der beiden Werte KLEIN resp. GROSS
	 */
	private int groesse;

	/**
	 * Konstruktor
	 * 
	 * @param nummer  Nummer des Gates
	 * @param groesse Groesse des Gates (KLEIN, GROSS)
	 */
	public InternationalesGate(int nummer, int groesse) {
		super(nummer);
		this.groesse = groesse;
	}

	/**
	 * Abfrage der Groesse des Gates
	 * 
	 * @return Groesse des Gates (KLEIN, GROSS)
	 */
	public int getGroesse() {
		return groesse;
	}
}
