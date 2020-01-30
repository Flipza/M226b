package ch.modul226b.model;

/**
 * Diese Exception wird geworfen, wenn bei der Ankunft kein freies Gate gefunden
 * werden kann
 * 
 * @author Phillip
 * @version V1.0
 *
 */
@SuppressWarnings("serial")
public class NoGateAvailableException extends Exception {

	public NoGateAvailableException() {
		super("SORRY - Kein freies Gate gefunden");
	}
}