package classEx;

class C {
	int m;
	void work() {
		System.out.println(m);
	}
	C(int a) {
		m = a;
	}
	C() {}
}

public class constructor {
	public static void main(String[] args) {
		C d = new C();
		C c = new C(3);
		
		d.work();
		c.work();
	}
}
