package ch.modul226b.model;

/**
 * Diese Klasse modelliert die "Fahrt"
 * 
 * @author Philipp
 * @version V1.0
 *
 */

public class Fahrt {

	// Instanzvariablen

	/**
	 * Jede Fahrt hat eine eindeutige Nummer
	 */

	private int nummer;

	/**
	 * Eine Fahrt hat eine eindeutige Abfahrtzeit. Diese wird hier nicht weiter
	 * verwertet und daher als String definiert
	 */

	private String abfahrtzeit;

	/**
	 * Eine Fahrt hat eine eindeutige Ankunftzeit. Diese wird hier nicht weiter
	 * verwertet und daher als String definiert
	 */

	private String ankunftzeit;

	/**
	 * Eine Fahrt wird mit einem Bus durchgefuert
	 */

	private Bus bus;

	/**
	 * Beantwortet die Frage, ob eine Fahrt national oder internation ist
	 * 
	 * @return true wenn es eine nationale Fahrt ist, false bei international
	 */

	public boolean istNational() {
		return (nummer < 1000);
	}

	/**
	 * Zugriffsmethode, liefert eine Referenz auf den Bus
	 * 
	 * @return Referenz auf den Bus
	 */
	public Bus getBus() {
		return bus;
	}

	/**
	 * Erlaubt die Zuweisung eines Busses
	 * 
	 * @param bus Bus, mit welchem die Fahrt durchgefuert wird
	 */
	public void setBus(Bus bus) {
		this.bus = bus;
	}

	/**
	 * Abfrage der Ankunftzeit
	 * 
	 * @return Ankunftzeit
	 */
	public String getAnkunftzeit() {
		return ankunftzeit;
	}

	/**
	 * Setzen der Ankunftzeit. Zeiten werden als String erfasst<br />
	 * <b>Beispiele</b><br />
	 * 12:30<br />
	 * 13 Uhr<br />
	 * heute Abend
	 * 
	 * @param ankunftzeit Die Ankunftzeit
	 */
	public void setAnkunftzeit(String ankunftzeit) {
		this.ankunftzeit = ankunftzeit;
	}

	/**
	 * Abfrage der Fahrtnummer
	 * 
	 * @return die Fahrtnummer
	 */
	public int getNummer() {
		return nummer;
	}

	/**
	 * Setzt die Fahrtnummer
	 * 
	 * @param nummer Fahrtnummer
	 */
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	/**
	 * Abfrage der Abfahrtzeit
	 * 
	 * @return Abfahrtzeit
	 */
	public String getAbfahrtzeit() {
		return abfahrtzeit;
	}

	/**
	 * Setzen der Abfahrtzeit. Zeiten werden als String erfasst<br />
	 * <b>Beispiele</b><br />
	 * 12:30<br />
	 * 13 Uhr<br />
	 * heute Abend
	 * 
	 * @param abfahrtzeit Die Abfahrtzeit
	 */
	public void setAbfahrtzeit(String abfahrtzeit) {
		this.abfahrtzeit = abfahrtzeit;
	}
}
