package sec01_finalmodifier.EX02_FinalModifier_2;

class A {
	void abc() {}
	final void bcd() {}
}
class B extends A {
	void abc() {}
	// void bcd() {}
}
final class C {}
// class D extends C {}

public class FinalModifier_2 {
	public static void main(String[] args) {
		
	}

}
