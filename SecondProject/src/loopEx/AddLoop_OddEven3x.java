package loopEx;

import java.util.Scanner;

public class AddLoop_OddEven3x {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int input;
		
		int totalEven = 0;
		int totalOdd = 0;
		int totalThreeX = 0;
		
		
		System.out.println("n까지의 짝수의 합, 홀수의 합, 3의 배수의 합 출력 프로그램입니다.");
		System.out.print("n을 입력하세요: ");
		
		input = scan.nextInt();
		scan.close();
		
		
		for (int i = 0; i <= input; i++) {
			if (i % 2 == 1) totalOdd += i;
			else totalEven += i; 
			if (i % 3 == 0) totalThreeX += i;
		}
		
//		// Try 1. 3의 배수는 2와 3의 공배수, 홀수와 겹치므로 따로 반복문을 만들어줬다.
//		for (int i = 0; i <= input; i++) {
//			if (i % 3 == 0) {
//				totalThreeX += i;
//			}
//		}
		
		// Try 2. 공통인 부분에 대해서 3의 배수의 합으로 넣으려는 시도 하다가 멈춤.
//		for (int i = 0; i <= input; i++) {
//			if (i % 2 == 0) {
//				totalEven += i;
//				if (i % 3 == 0) {
//					
//				}
//			} else if (i % 2) {
//				totalOdd += i;
//			}
//		}
		
		
//		for (int i = 0; i <= input; i=i+2) { 
//			total += i;
//		}
		
		System.out.println(input + "까지 짝수의 합은 " + totalEven + "입니다.");
		System.out.println(input + "까지 홀수의 합은 " + totalOdd + "입니다.");
		System.out.println(input + "까지 3의 배수의 합은 " + totalThreeX + "입니다.");
	}
}