package stringEx;

import java.util.Scanner;

public class StringMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String indata;
		while(true) {
			System.out.print("주민등록번호(13자리) 입력(종료 시 x): ");
			indata = sc.next();
			if (indata.equals("x")) break;
			// equals를 쓰면 힙메모리에 있는 값을 가지고 와서 비교한다.
			// 그냥 indata를 쓰면 힙메모리 번지수만 나온다.
			// indata -> string으로 결과값이 출력됨.
			if (indata.length() != 13)
				System.out.println("입력착오: 주민등록번호는 13자리입니다!!");
			else System.out.println("입력한 주민등록번호 : "
					+indata.substring(0,6) + "-" + indata.substring(6,13));
			// substring(0,6) -> 0부터 6전까지 출력한다.
			sc.nextLine();
		}
		sc.close();
		System.out.println("프로그램을 종료합니다!!");
	}
}
