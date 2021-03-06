
public class Interval {

	private Value l, r; // linke und rechte Grenze des Intervalls

	public Interval(Value l, Value r) { // Konstruktor
		this.l = l;
		this.r = r;
	}

	public void shift(Value s) {
		l = l.plus(s);
		r = r.plus(s);
	}

	public Value comb(Interval y) {
		Value temp1 = l.plus(y.l);
		Value temp2 = r.plus(y.r);
		return temp1.times(temp2);
	}

}
