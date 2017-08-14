
public class ShortValue extends Value {

	private short s; // eigentlicher short-Wert

	public ShortValue(short s) { // Konstruktor
		this.s = s;
	}

	@Override
	public void plus(Value v) {
		// TODO Auto-generated method stub

	}

	@Override
	public void times(Value v) {
		// TODO Auto-generated method stub

	}
	
	public boolean equals(ShortValue zahl) {  // Vergleichs-Methode
		
		
		return this.s == zahl.s; 
	}

}
