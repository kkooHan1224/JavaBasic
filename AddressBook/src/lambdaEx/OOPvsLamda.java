package lambdaEx;

interface A {
	void abc();
}

class B implements A {
	@Override
	public void abc() {
		System.out.println("메서드 내용1");
	}
}

public class OOPvsLamda {
	public static void main(String[] args) {
		// 1. 일반적인 메서드 사용법
		A a1 = new B();
		a1.abc();
		// 2. 익명의 이너클래스 사용법, 클래스 B 전체를 주석 처리 후 실행
		A a2 = new A() {
			public void abc() {
				System.out.println("메서드 내용2");
			}
		};
		a2.abc();
		// 3. 람다식 사용법
		A a3 = () -> System.out.println("메서드 내용3");
		a3.abc();
	}
}
