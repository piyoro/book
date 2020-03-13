package io.dorune.book.puzzler.quiz38;

public class UnwelcomeGuest {

	public static final long GUEST_USER_ID = -1;

	private static final long USER_ID;

	static {
		try {
			USER_ID = getUserIdFromEnvironment();
		} catch (IdUnvailableException e) {
			USER_ID = GUEST_USER_ID;
			System.out.println("Logging in as guest");
		}
	}

	private static long getUserIdFromEnvironment() throws IdUnvailableException {
		throw new IdUnvailableException(); // error를 강제로 발생
	}

	public static void main(String[] args) {
		System.out.println("User ID: " + USER_ID);
	}
}

class IdUnvailableException extends Exception {
	IdUnvailableException() {
	}
}
