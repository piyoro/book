package io.dorune.book.puzzler.quiz18;

public class StringCheese {

	/**
	 * @author : piyor
	 * 
	 * <pre>
	 * String 생성자에 charset 지정할 경우 throws UnsupportedEncodingException 추가
	 * </pre>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		byte[] bytes = new byte[256];
		for (int i = 0; i < 256; i++)
			bytes[i] = (byte) i;

		// 시스템 default charset 확인
		System.out.println(java.nio.charset.Charset.defaultCharset());

		String str = new String(bytes);
		/*
		 * byte 배열을 문자열로 변환할 때, 캐릭터셋을 지정하는 습관을 들이자
		 */
		// String str = new String(bytes, "ISO-8859-1");
		for (int i = 0, n = str.length(); i < n; i++) {
			System.out.println((int) str.charAt(i) + "");
		}
	}
}
