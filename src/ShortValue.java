
public class ShortValue extends Value {

	private short s; // eigentlicher short-Wert

	public ShortValue(short s) { // Konstruktor
		this.s = s;
	}

	@Override
	public Value plus(Value v) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Value times(Value v) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public boolean equals(ShortValue zahl) {  // Vergleichs-Methode
		
		
		return this.s == zahl.s; 
	}

}
