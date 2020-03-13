package io.dorune.book.puzzler.quiz27;

public class Shfty {

	public static void main(String[] args) {
		int i = 0, tmp = 0;

		int target = -1 * Integer.MAX_VALUE;
		for (i = 0; i < 35; i++) {
			System.out.printf("%s의 %2d번째 왼쪽 이동값 [%s]%n", target, i, (target << i));
		}

		// System.out.println(Integer.MIN_VALUE);
		// System.out.println(Integer.MAX_VALUE);
		// System.out.println(-1 << -1);
		// System.out.println(-1 << 32);
		// System.out.println(-1 << 64);
		/*
		while (-1 << i != 0) {
			tmp = -1 << i;
			System.out.format("%s : %s%n", i, tmp);
			i++;
		}
		System.out.println(-1 << 1);
		System.out.println(-1 << 2);
		System.out.println(-1 << 3);
		*/
		int distance = 0;
		for (int val = -1; val != 0; val <<= 1) {
			distance++;
		}
		// System.out.println(distance);
	}

}
