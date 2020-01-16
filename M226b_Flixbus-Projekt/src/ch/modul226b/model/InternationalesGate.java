package ch.modul226b.model;

public class InternationalesGate extends Gate {

	// Konstanten
	public static final int KLEIN = 0;
	public static final int GROSS = 1;
	
	private int groesse;
	
	public InternationalesGate(int nummer, int groesse) {
		super(nummer);
		this.groesse = groesse;
	}
	
	public int getGroesse() {
		return groesse;
	}
}
