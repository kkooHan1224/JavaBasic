package loopEx;

import java.util.Scanner;

public class AddLoop_Odd {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int input;
		
		int total = 0;
		
		System.out.print("몇까지 홀수의 합을 구할 것인가요? 얼마까지 더할지 정수를 입력하세요.");
		input = scan.nextInt();
		scan.close();
		
		
		for (int i = 0; i <= input; i++) {
			if (i % 2 == 1) {
				total += i;
			}
		}
		
//		for (int i = 0; i <= input; i=i+2) { 
//			total += i;
//		}
		
		System.out.println("1부터 " + input + "까지 홀수의 합은 " + total + "입니다.");
	}
}