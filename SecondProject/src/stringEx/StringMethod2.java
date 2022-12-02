package stringEx;

import java.util.Scanner;

public class StringMethod2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String indata;
		int month=0, gender=0;
		while(true) {
			System.out.print("주민등록번호(13자리) 입력(종료 시 x): ");
			indata = sc.next();
			if (indata.equals("x")) break;
			if (indata.length() != 13)
				System.out.println("입력착오: 주민등록번호는 13자리입니다!!");
			else {
				month = Integer.parseInt(indata.substring(2,4));
				if (month < 1 || month > 12)
					System.out.println("월 입력착오: 생년월은 1~12월 사이입니다!!");
				else {
					System.out.println("입력한 주민등록번호 : "
							+indata.substring(0,6) + "-" + indata.substring(6,13));
					gender = Integer.parseInt(indata.substring(6,7));
					if (gender % 2 == 0) System.out.println("여성입니다!");
					else System.out.println("남성입니다!!");
				}
			}
//			sc.nextLine();
		}
		sc.close();
		System.out.println("프로그램을 종료합니다!!");
	}
}
