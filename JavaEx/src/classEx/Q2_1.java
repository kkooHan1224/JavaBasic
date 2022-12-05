//	교재 220p 연습문제 Q2.

package classEx;

class A {
	int m;
	void method() {
		System.out.println("A의 메서드");
	}
}

public class Q2_1 {
	public static void main(String[] args) {
		A a = new A();	// 참조변수 a를 선언하고 클래스 A의 객체를 생성
		a.m = 5;	// 객체 내부의 필드 m에 값 5를 대입
		System.out.println(a.m);	// 필드 m의 값을 콘솔에 출력
		a.method();	// 메서드 method()를 호출
	}
}
