package io.dorune.book.puzzler.quiz06;

public class Multicast {

	/**
	 * @author : piyoro
	 * 
	 * <pre>
	 * 6번째 퍼즐 : 다중 자료형 변환
	 * </pre>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println((int) (char) (byte) -1);
		// -1 = 11111111_11111111_11111111_11111111
		// (byte) -1 = 11111111
		// (char)(byte)-1 = 11111111_11111111
		// (int) (char) (byte) -1 = 11111111_11111111_11111111_11111111
		System.out.println(Integer.toBinaryString((byte) -1));
		System.out.println(Integer.toBinaryString((char) (byte) -1));

		int bin = 0b11110;
		System.out.println(bin);
		System.out.println(String.valueOf(bin));
		System.out.println(Integer.toBinaryString(bin));

		int bin_1 = 0b00000000000000000000000000000001;
		int bin_com = -1;
		System.out.println(Integer.toBinaryString(bin_1));
		System.out.println(Integer.toBinaryString(bin_com));

		System.out.println(Integer.toBinaryString(~bin_1));

		int hex = 0xF8;
		System.out.println(hex);
		System.out.println(Integer.toBinaryString(hex));
		int b = (byte) 0xF8;
		System.out.println(b);
		System.out.println(b);
		System.out.println(Integer.toBinaryString(b));

		int ex = 248;
		System.out.println(Integer.toBinaryString(ex));

		int t = ((char) (byte) -1) & 0xffff;
		System.out.println((char) (byte) -1 & 0xffff);
		System.out.println(t);

		byte by = -1;
		char c = (char) (((char) (by)) & 0xff);
		System.out.println((int) c);

		t = (short) ((char) (byte) -1);
		System.out.println(t);

		c = 127;
		t = c;
		// 1000001
		System.out.println(t);
		System.out.println(Integer.toBinaryString(t));

		float d = 0.2f;
		System.out.println(Long.toBinaryString(Float.floatToRawIntBits(d)));

		int x = 1984;
		int y = 2001;
		System.out.println(x ^ y);
	}
}
