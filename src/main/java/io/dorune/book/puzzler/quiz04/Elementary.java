package io.dorune.book.puzzler.quiz04;

public class Elementary {

	/**
	 * @author : piyoro
	 * 
	 * <pre>
	 * 5번째 퍼즐 : 16진수의 즐거움
	 * </pre>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));
	}
}
