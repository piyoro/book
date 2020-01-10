package io.dorune.book.puzzler.quiz01;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OddTest {

	Odd odd;

	@Before
	public void init() {
		System.out.println("test start");
		odd = new Odd();
	}

	@After
	public void complete() {
		System.out.println("teardown");
	}

	// @Test
	public void isOddTest() {
		boolean result = false;
		result = odd.isOdd(1);
		assertTrue(result);
		result = odd.isOdd(2);
		assertFalse(result);
		result = odd.isOdd(-1);
		assertTrue(result);
		result = odd.isOdd(-2);
		assertFalse(result);
	}

	// @Test
	public void isOddTest2() {
		boolean result = false;
		result = odd.isOdd2(11111111);
		assertTrue(result);
		result = odd.isOdd2(22002200);
		assertFalse(result);
		result = odd.isOdd2(-11111111);
		assertTrue(result);
		result = odd.isOdd2(-22002200);
		assertFalse(result);
	}

	// @Test
	public void isOddTest3() {
		boolean result = false;
		result = odd.isOdd3(11111111);
		assertTrue(result);
		result = odd.isOdd3(22002200);
		assertFalse(result);
		result = odd.isOdd3(-11111111);
		assertTrue(result);
		result = odd.isOdd3(-22002200);
		assertFalse(result);
	}

	@Test
	public void isOdd_Stress_Test2() {

		long current = System.currentTimeMillis();
		for (int i = 0; i < 2000000000; i++) {
			isOddTest2();
		}
		System.out.println("나머지 연산자 20억건 부하 테스트 : " + (System.currentTimeMillis() - current));
	}

	@Test
	public void isOdd_Stress_Test3() {

		long current = System.currentTimeMillis();
		for (int i = 0; i < 2000000000; i++) {
			isOddTest3();
		}
		System.out.println("비트 AND 연산자 20억건 부하 테스트 : " + (System.currentTimeMillis() - current));
	}
}
