

public class Variables {
	public static void main (String[] args) {
		int One = (int)1; //value: 1, initialized
		One = (int)2.33; //value: 2, cast
		double OnePointSix = 1.6; //value: 1.6, initialized
		OnePointSix += 3; //value: 4.6, +=
		char A = 'a'; //value: a, initialized
		A -= 23; //value: J, -=
		String ottf = "one two three four"; //value: one two three four, initialized
		ottf += 123; //value: one two three four123, +=
		boolean f = false; //value: false, initialized
		f = One != OnePointSix; //value: true, !=
		System.out.println(One);
		System.out.println(OnePointSix);
		System.out.println(A);
		System.out.println(ottf);
		System.out.println(f);
		boolean t = OnePointSix > One; //value: true, >
		boolean x = !t; //value: false, !
		System.out.println(t);
		System.out.println(x);
	}
}
