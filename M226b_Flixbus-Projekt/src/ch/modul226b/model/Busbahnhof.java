package ch.modul226b.model;

public class Busbahnhof {

	private Gate[] gates;
	private String name;

	public Busbahnhof() {
		this.name = "Z�rich";
		this.gates = new Gate[10];
		
		// vier nationale Gates
		gates[0] = new Gate(1, Gate.NATIONAL, Gate.KLEIN);
		gates[1] = new Gate(2, Gate.NATIONAL, Gate.KLEIN);
		gates[2] = new Gate(3, Gate.NATIONAL, Gate.KLEIN);
		gates[3] = new Gate(4, Gate.NATIONAL, Gate.KLEIN);
		
		// 2 kleine internationale Gates
		gates[4] = new Gate(5, Gate.INTERNATIONAL, Gate.KLEIN);
		gates[5] = new Gate(6, Gate.INTERNATIONAL, Gate.KLEIN);
		
		// 2 grosse internationale Gates
		gates[6] = new Gate(7, Gate.INTERNATIONAL, Gate.GROSS);
		gates[7] = new Gate(8, Gate.INTERNATIONAL, Gate.GROSS);
		gates[8] = new Gate(9, Gate.INTERNATIONAL, Gate.GROSS);
		gates[9] = new Gate(10, Gate.INTERNATIONAL, Gate.GROSS);
		
	}

	public int ankunft(Fahrt fahrt) {

	}

	public void abfahrt(int gateNummer) {

	}
	
	
}
