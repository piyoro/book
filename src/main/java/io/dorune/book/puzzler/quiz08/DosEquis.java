package io.dorune.book.puzzler.quiz08;

public class DosEquis {

	/**
	 * @author : piyoro
	 * 
	 * <pre>
	 * 8번째 퍼즐 : Dos Equis
	 * </pre>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		char x = 'X';
		int i = 0;
		System.out.print(true ? x : 0);
		System.out.print(false ? i : x);
		System.out.println();
		int xx = 89;
		int yy = 92;
		int zz = 100;
		float f = xx + yy + zz / 3;
		double d = xx + yy + zz / 3.0;
		System.out.println(xx + yy + zz / 3);
		System.out.println(f);
		System.out.println(d);
		System.out.println(xx + yy + zz / 3.0);

		short xxx = 0;
		i = 123456;

		xxx = (short) (xxx + i);
		System.out.println(xxx);

		Object o = "buy";
		String s = "Ej";
		o += s;
		System.out.println(o);

		x = 65535;
		byte b = 127;
		char a = (char) (false ? b : x);
		System.out.println(a);
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(x + b));
		System.out.println(x + b);
		System.out.println((char) (x + b));
		// x = (x + b);
		// x = (char) (x + b);
		System.out.println();
		System.out.println(Integer.toBinaryString(x));
		System.out.println(false ? b : x);
		byte b1 = 127;
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b + b1);
		System.out.println((byte) (b + b1));
		// byte b2 = b + b1;
		// char b2 = b + b1;
		// short b2 = b + b1;
		int b2 = b + b1;
		System.out.println((int) Math.sqrt(5));
	}
}
