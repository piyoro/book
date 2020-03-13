package io.dorune.book.puzzler.quiz03;

public class LongDivision {

	/**
	 * @author : piyoro
	 * 
	 * <pre>
	 * 3번째 퍼즐 : ﻿Long 자료형 나눗셈
	 * </pre>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
		System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
	}
}
