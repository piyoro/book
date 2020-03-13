package io.dorune.book.puzzler.quiz36;

public class Indecisive {

	public static void main(String[] args) {
		System.out.println(decision());
		System.out.println(decision_improve());

	}

	static boolean decision() {
		try {
			return true;
		} finally {
			return false;
		}
	}

	/**
	 * @author : piyoro
	 * 
	 * <pre>
	 * finally 블록에 return 이 있으면 무조건 finally의 return  이 수행되므로,
	 * catch 로 정확한 exception 에 대한 return 을 처리하면 되겠다.
	 * </pre>
	 * 
	 * @return
	 */
	static boolean decision_improve() {
		String s = "가";
		try {
			Integer.parseInt(s);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
