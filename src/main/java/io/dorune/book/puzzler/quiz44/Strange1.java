package io.dorune.book.puzzler.quiz44;

public class Strange1 {
	public static void main(String[] args) {
		try {
			Missing m = new Missing();
		} catch(NoClassDefFoundError ex) {
			System.out.println("Got it!");
		}
	}
}
