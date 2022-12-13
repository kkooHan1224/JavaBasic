package inheritance;
import externalEx.ProgramInfo;
//class Animal {
//	public void display() {
//		System.out.println("I am an animal");
//	}
//}

abstract class Animal {
	abstract void makeSound();
	public void display() {
		System.out.println("I am an animal");
	}
}

class Dog extends Animal {
	@Override
	public void display() {
		System.out.println("I am a dog");
	}
	public void printMessage() {
		super.display();
		display();		
	}
	public void makeSound() {
		System.out.println("멍멍멍!!");
	}
}

public class AnimalEx {
	public static void main(String[] args) {
		ProgramInfo.print("super 실습", "서정한", "2.0");
		Dog dog1 = new Dog();
		dog1.printMessage();
		dog1.makeSound();
	}
}
