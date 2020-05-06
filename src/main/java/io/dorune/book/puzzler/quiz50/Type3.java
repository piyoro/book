package io.dorune.book.puzzler.quiz50;

public class Type3 {

	public static void main(String[] args) {
		Type3 t3 = (Type3) new Object();
		//본문에는 없는 println 실행
		System.out.println(t3);
	}

}
