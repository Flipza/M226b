package ch.modul226b.model;

public class Busbahnhof {

	private Gate[] gates;
	private String name;

	public Busbahnhof() {
		this.name = "Z�rich";
		this.gates = new Gate[10];
		
		// vier nationale Gates
		gates[0] = new NationalesGate(1);
		gates[1] = new NationalesGate(2);
		gates[2] = new NationalesGate(3);
		gates[3] = new NationalesGate(4);
		
		// zwei kleine internationale Gates
		gates[4] = new InternationalesGate(5, InternationalesGate.KLEIN);
		gates[5] = new InternationalesGate(6, InternationalesGate.KLEIN);
		
		// vier grosse internationale Gates
		gates[6] = new InternationalesGate(7, InternationalesGate.GROSS);
		gates[7] = new InternationalesGate(8, InternationalesGate.GROSS);
		gates[8] = new InternationalesGate(9, InternationalesGate.GROSS);
		gates[9] = new InternationalesGate(10, InternationalesGate.GROSS);
		
	}

	public int ankunft(Fahrt fahrt) throws NoGateAvailableException {
		for (short i = 0; i < 10; i++) {		// Schleife �ber alle Gates
			if (gates[i].istFrei()) {			// nur freie Gates
				if (fahrt.istNational()) {		// nationale fahrt passt immer
					gates[i].ankunft(fahrt);
					return i + 1;
				}
				else {							// internationale fahrt
					if (fahrt.getBus().istGrossraum()) {	// Grossraumbus
						if (gates[i] instanceof InternationalesGate && ((InternationalesGate )gates[i]).getGroesse() == InternationalesGate.GROSS) {
							gates[i].ankunft(fahrt);
							return i+1;			// Gate ist gross -> OK, passt
						}
						else {					// Kein Grossraum
							gates[i].ankunft(fahrt);
							return i+1;			// Gate passt, immer 
						}
					}
				}
			}
			throw new NoGateAvailableException();
		}
	}

	public void abfahrt(int gateNummer) {

	}
	
	public Gate getGate(int gateNummer) throws InvalidGateNumberException {
		try {
			return gates[gateNummer];
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			throw new InvalidGateNumberException();
		}
	}
	
	
	private Gate freiesGateSuchen(Fahrt fahrt) throws NoGateAvailableException {
		for (short i = 0; i < gates.length; i++) {
			if (gates[i].istFrei()) {
				if (fahrt.istNational()) {
					return gates[i];
				}
				else {
					if (gates[i].getGroesse() == InternationalesGate.GROSS)| .fahrt.getBus().istGrossraum()) {
						return gates[i];
					}
				}
			}
		}
		throw new NoGateAvailableException();
	}
	
	
}
