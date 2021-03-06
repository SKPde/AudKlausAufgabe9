import java.util.Scanner;

public class IntervalComputing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		ShortValue a = new ShortValue((short) 3);
		ShortValue b = new ShortValue((short) 4);
		ShortValue d = new ShortValue((short) 5);
		
		Interval m = new Interval(a,b);
		Value v;
		
		do {
			v = m.comb(m);
			m.shift(v);
			System.out.println("V: " + v.toString() + " D: " + d.toString());
			//in.next();
		} while(! v.equals(d));
		
	}

}
