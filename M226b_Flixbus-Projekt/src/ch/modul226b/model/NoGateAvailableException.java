package ch.modul226b.model;

/**
 * Diese Exception wird geworfen, wenn beim Landen kein freies Gate gefunden
 * werden kann
 * 
 * @author ruggiero
 * @version V1.0
 *
 */
@SuppressWarnings("serial")
public class NoGateAvailableException extends Exception {

	public NoGateAvailableException() {
		super("SORRY - Kein freies Gate gefunden");
	}
}