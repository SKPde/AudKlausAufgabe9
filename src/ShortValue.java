
public class ShortValue extends Value {

	private short s; // eigentlicher short-Wert

	public ShortValue(short s) { // Konstruktor
		this.s = s;
	}

	@Override
	public Value plus(Value v) {
		// TODO Auto-generated method stub
		ShortValue tempValue = (ShortValue) v;
		return new ShortValue((short) (this.s + tempValue.s));
	}

	@Override
	public Value times(Value v) {
		// TODO Auto-generated method stub
		ShortValue tempValue = (ShortValue) v;
		return new ShortValue((short) (this.s * tempValue.s));
	}
	
	public boolean equals(ShortValue zahl) {  // Vergleichs-Methode
		
		return this.s == zahl.s; 
	}

}
