package io.dorune.book.puzzler.quiz01;

public class Odd {

	public static void main(String[] args) {
		Odd odd = new Odd();
		System.out.print("1-1. 1의 홀수/짝수 판단. 무엇이 출력될까? : ");
		System.out.println(odd.isOdd(1));
		System.out.print("1-2. 2의 홀수/짝수 판단. 무엇이 출력될까? : ");
		System.out.println(odd.isOdd(2));
		System.out.print("1-3. -1의 홀수/짝수 판단. 무엇이 출력될까? : ");
		System.out.println(odd.isOdd(-1));
		System.out.print("1-4. -2의 홀수/짝수 판단. 무엇이 출력될까? : ");
		System.out.println(odd.isOdd(-2));

		System.out.println();
		System.out.print("2-1. 1의 홀수/짝수 판단. 무엇이 출력될까? : ");
		System.out.println(odd.isOdd2(1));
		System.out.print("2-2. 2의 홀수/짝수 판단. 무엇이 출력될까? : ");
		System.out.println(odd.isOdd2(2));
		System.out.print("2-3. -1의 홀수/짝수 판단. 무엇이 출력될까? : ");
		System.out.println(odd.isOdd2(-1));
		System.out.print("2-4. -2의 홀수/짝수 판단. 무엇이 출력될까? : ");
		System.out.println(odd.isOdd2(-2));

		System.out.println();
		System.out.print("3-1. 1의 홀수/짝수 판단. 무엇이 출력될까? : ");
		System.out.println(odd.isOdd3(1));
		System.out.print("3-2. 2의 홀수/짝수 판단. 무엇이 출력될까? : ");
		System.out.println(odd.isOdd3(2));
		System.out.print("3-3. -1의 홀수/짝수 판단. 무엇이 출력될까? : ");
		System.out.println(odd.isOdd3(-1));
		System.out.print("3-4. -2의 홀수/짝수 판단. 무엇이 출력될까? : ");
		System.out.println(odd.isOdd3(-2));
	}

	/**
	 * @author : piyoro
	 * 
	 * <pre>
	 * 일반적인 홀수/짝수 반환
	 * </pre>
	 * 
	 * @param i
	 * @return
	 * true : 홀수
	 * false : 짝수
	 */
	public boolean isOdd(int i) {
		return (i % 2) == 1;
	}

	/**
	 * @author : piyoro
	 * 
	 * <pre>
	 * isOdd 메서드와 동일한 표현식에 != 0 이 아닐때의 결과로 홀수/짝수 를 판단
	 * </pre>
	 * 
	 * @param i
	 * @return
	 * true : 홀수
	 * false : 짝수
	 */
	public boolean isOdd2(int i) {
		return (i % 2) != 0;
	}

	/**
	 * @author : piyoro
	 * 
	 * <pre>
	 * 나누기/나머지 연산자의 성능 개선을 위해 비트 AND 연산자를 사용하여 홀수/짝수 를 판단
	 * </pre>
	 * 
	 * @param i
	 * true : 홀수
	 * false : 짝수
	 * @return
	 */
	public boolean isOdd3(int i) {
		return (i & 1) != 0;
	}
}
