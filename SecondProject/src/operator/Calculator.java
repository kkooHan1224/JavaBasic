package operator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		// 키보드로 두 정수와 연산자를 입력 받아 계산 결과 출력
		// 결과는 실수형 (소수점 이하 2자리) 출력
		// if ~ else if ~ else문으로 먼저 작성 후 switch문으로 수정
		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		char operator;
		double output = 0;
		
		System.out.print("첫번째 정수를 입력하세요: ");
		num1 = scan.nextInt();
		scan.nextLine();
		System.out.print("연산자(+, -, *, /)를 입력하세요: ");
		operator = scan.nextLine().charAt(0);	// String에 한 문자만 있는 경우
		System.out.print("두번째 정수를 입력하세요: ");
		num2 = scan.nextInt();
		
		scan.close();
		
		if (operator == '+') output = num1 + num2;
		else if (operator == '-') output = num1 - num2;
		else if (operator == '*') output = num1 * num2;
		else if (operator == '/') output = (double) num1 / (double)num2;	// 실수가 나올 수도 있다.
		else System.out.println("연산자 입력 오류");
		
		System.out.printf("%d %c %d = %.2f\n", num1, operator, num2, output);
		
		
	}
}
