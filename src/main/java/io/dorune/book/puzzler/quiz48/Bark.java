package io.dorune.book.puzzler.quiz48;

class Dog {
	public static void bark() {
		System.out.println("woof");
	}
}

class Basenji extends Dog {
	public static void bark() { }
}
public class Bark {

	public static void main(String[] args) {
		Dog woofer = new Dog();
		Dog nipper = new Basenji();
		woofer.bark();
		nipper.bark();
	}

}
