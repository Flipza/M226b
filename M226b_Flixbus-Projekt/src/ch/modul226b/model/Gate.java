package ch.modul226b.model;

/**
 * Ein Gate ist die zentrale Andockstelle fuer Busse und Fahrten. Jeder
 * Busbahnhof besitzt mindestens ein Gate.<br />
 * 
 * Diese Klasse ist abstract, da Gates erst Sinn machen, wenn man sie genauer
 * spezifiziert (in unserem Fall national/international)<br />
 * 
 * An einem Gate werden zwar Busse parkiert, aber normalerweise spricht man von
 * Fahrt, der am Gate angeschrieben ist. Daher kennt das Gate nur die Fahrt und
 * nicht direkt den Bus
 * 
 * @author Philipp
 * @version V1.0
 *
 */

public abstract class Gate {

	/**
	 * Die Nummer des Gates
	 */
	private int nummer;

	/**
	 * Referenz auf den am Gate gangekommenen Bus
	 */

	private Fahrt fahrt;

	/**
	 * Ein Gate kann nur garade mit Nummer erstellt werden
	 * 
	 * @param nummer Die Gatenummer
	 */

	public Gate(int nummer) {
		super();
		this.nummer = nummer;
	}

	/**
	 * Ein Bus kommt an, indem der Bus am Gate angeschrieben wird
	 * 
	 * @param fahrt
	 * 
	 * @param Der Bus
	 */

	public void ankunft(Fahrt fahrt) {
		this.fahrt = fahrt;
	}

	/**
	 * Abfahrt heisst, dass am Gate kein Bus mehr angeschrieben ist
	 */

	public void abfahrt() {
		this.fahrt = null;
	}

	/**
	 * Ist das Gate gerade frei oder belegt?
	 * 
	 * @return true, gibt true zurueck, wenn Gate frei ist, false bei belegtem Gate
	 */
	public boolean istFrei() {
		return this.fahrt == null;
	}

	/**
	 * Abfrage der Gatenummer
	 * 
	 * @return Gatenummer
	 */
	public int getGateNummer() {
		return nummer;
	}

	/**
	 * Abfrage der Groesse des Gates
	 * 
	 * @return Groesse des Gates
	 */
	public abstract int getGroesse();

	/**
	 * Abfrage der Fahrtinfo
	 * 
	 * @return Referenz auf den am Gate stehenden Bus, null wenn Gate nicht belegt
	 */
	public Fahrt getFahrt() {
		return fahrt;
	}

	/**
	 * Abfrage des Busses am Gate.
	 * 
	 * @return Referenz auf Bus oder null, wenn Gate nicht belegt ist
	 */
	public Bus getBus() {
		if (this.fahrt == null) {
			return null;
		}

		return fahrt.getBus();
	}

}
