package ch.modul226b.model;

public class InvalidGateNumberException extends Exception {

	public InvalidGateNumberException() {
		super("SORRY - Diese Gatenummer gibt es nicht");
	}
}
