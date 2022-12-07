package classEx;

class DefaultA {
	int m;
	void work() {
		System.out.println(m);
	}
	// 기본생성자 자동 추가 A() {}
}

class DefaultB {
	int m;
	void work() {
		System.out.println(m);
	}
	DefaultB() {}
}

class DefaultC {
	int m;
	void work() {
		System.out.println(m);
	}
	DefaultC(int a){
		m=a;
	}
	DefaultC(){}
}

public class DefaultConstructor {
	public static void main(String[] args) {
		// #1. 기본생성자를 이용한 객체 생성
		DefaultA a = new DefaultA();
		DefaultB b = new DefaultB();
		DefaultC d = new DefaultC();
		DefaultC c = new DefaultC(3);
		
		// #2. 메서드 호출
		a.work();	// 0
		b.work();	// 0
		c.work();	// 3
		d.work();	// 0
	}
}
