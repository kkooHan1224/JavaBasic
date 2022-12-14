package interfaceEx;

interface Pet {
	public abstract void makeSound();
}

class Dog implements Pet {
	public void makeSound() {
		System.out.println("멍멍멍!");
	}
}

class Cat implements Pet {
	public void makeSound() {
		System.out.println("야옹야옹!");
	}
}


public class DogEx {
	public static void main(String[] args) {
		Pet p = new Dog();
		p.makeSound();
		Pet c = new Cat();
		c.makeSound();
	}

}