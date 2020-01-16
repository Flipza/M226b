package ch.modul226b.model;

public class NoGateAvailableException extends Exception{
	
	public NoGateAvailableException() {
		super("SORRY - Kein freies Gate gefunden");
	}
}
