package io.dorune.book.puzzler.quiz02;

import java.math.BigDecimal;

public class Change {

	/**
	 * @author : piyoro
	 * 
	 * <pre>
	 * 2번째 퍼즐 : 변화를 위한 시간
	 * </pre>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(2.00 - 1.10);
		System.out.println(2.00);
		System.out.println(1.10);
		System.out.println(new BigDecimal(.1));
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
	}
}
