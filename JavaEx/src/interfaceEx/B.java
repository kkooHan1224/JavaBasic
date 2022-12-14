package interfaceEx;

interface A {
	default void abc() {
		System.out.println("A 인터페이스의 abc()");
	}
}

public class B implements A {
	public void abc() {
		A.super.abc();	// 부모 클래스의 메서드를 부를 땐 'super.메서드명' 이용하면 되고, 인터페이스의 메서드를 부를 땐 '인터페이스명.super.메서드명'을 이용한다. 
		System.out.println("B 클래스의 abc()");
	}
	public static void main(String[] args) {
		B b = new B();
		b.abc();
	}
}