package io.dorune.book.puzzler.quiz07;

public class CleverSwap {

	/**
	 * @author : piyoro
	 * 
	 * <pre>
	 * 7번째 퍼즐 : 변수 교환
	 * </pre>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 1984; // (0x7c0)
		int y = 2001; // (0x7d1)
		x ^= y ^= x ^= y;
		System.out.println("x = " + x + "; y = " + y);
	}
}
