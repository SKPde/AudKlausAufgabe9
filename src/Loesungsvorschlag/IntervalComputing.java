package Loesungsvorschlag;

public class IntervalComputing {
	public static void main(String[] args) {
		ShortValue a = new ShortValue((short) 3);
		ShortValue b = new ShortValue((short) 4);
		ShortValue d = new ShortValue((short) 5);
		Interval m = new Interval(a, b);
		Value v;
		do {
			v = m.comb(m);
			m.shift(v);
		} while (!v.equals(d));
	}
}
