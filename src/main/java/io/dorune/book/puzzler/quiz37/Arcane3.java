package io.dorune.book.puzzler.quiz37;

public class Arcane3 implements Type3 {

	public static void main(String[] args) {
		Type3 t3 = new Arcane3();
		t3.f();
	}

	public void f() {
		System.out.println("Hello world");
	}
}

interface Type1 {
	void f() throws CloneNotSupportedException;
}

interface Type2 {
	void f() throws InterruptedException;
}

interface Type3 extends Type1, Type2 {
}
