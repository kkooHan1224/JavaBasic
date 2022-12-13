package inheritance;

abstract class People {
	abstract void greeting();
}

class Korean extends People {
	public void greeting() {
		System.out.println("안녕하세요!");
	}
}

class American extends People {
	public void greeting() {
		System.out.println("Hello!");
	}
}

public class PeopleEx {
	public static void main(String[] args) {
		Korean k1 = new Korean();
		k1.greeting();
		American a1 = new American();
		a1.greeting();
	}
}
