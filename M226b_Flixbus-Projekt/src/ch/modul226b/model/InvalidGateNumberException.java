package ch.modul226b.model;

/**
 * Exception, welche angibt, dass eine ungueltige Gatenummer verlangt worden ist
 * 
 * @author ruggiero
 * @version V1.0
 *
 */
public class InvalidGateNumberException extends Exception {

	/**
	 * Default serial ID, nicht relevant aber verhindert Compiler Warning ab Java 5
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Konstruktor
	 */
	public InvalidGateNumberException() {
		super("SORRY - Diese Gatenummer gibt es nicht");
	}
}
