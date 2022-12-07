package classEx;

class Q7_2A {
	int inputInt;
	double inputDouble;
	String inputStr;

// 아래 같은 방식은 이 문제에선 틀렸다.
	
//	void setInt(int a) {
//		this.inputInt = a;
//	}
//	
//	int getInt() {
//		return inputInt;
//	}

//	void -> 리턴값이 없을 때, 자료형도 표시할 필요없다.
	
	
	
	void print() {
		System.out.println("입력값이 없습니다.");
	}
	
	void print(int num1) {
		System.out.println("정수 입력값 : " + num1);
	}
	
	void print(double num2) {
		System.out.println("실수 입력값 : " + num2);
	}
	
	void print(String str1) {
		System.out.println("문자열 입력값 : " + str1);
	}
}


public class Q7_2 {
	public static void main(String[] args) {
		Q7_2A a = new Q7_2A();
		a.print();
		a.print(3);
		a.print(5.8);
		a.print("안녕");
	}
}
