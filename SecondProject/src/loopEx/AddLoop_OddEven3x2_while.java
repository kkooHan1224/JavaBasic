package loopEx;

import java.util.Scanner;

public class AddLoop_OddEven3x2_while {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input;
		int totalEven = 0; int totalOdd = 0; int totalThreeX = 0;
			
		System.out.println("n까지의 짝수의 합, 홀수의 합, 3의 배수의 합 출력 프로그램입니다.(종료하려면 0을 입력하세요.)");
		System.out.print("n을 입력하세요: ");
		input = scan.nextInt();
		
		while (input != 0) {
			for (int i = 0; i <= input; i++) {
				if (i % 2 == 1) totalOdd += i;
				else totalEven += i; 
				if (i % 3 == 0) totalThreeX += i;
			}
			System.out.println(input + "까지 짝수의 합은 " + totalEven + "입니다.");
			System.out.println(input + "까지 홀수의 합은 " + totalOdd + "입니다.");
			System.out.println(input + "까지 3의 배수의 합은 " + totalThreeX + "입니다.");
			totalEven = 0; totalOdd = 0; totalThreeX = 0;
		
			System.out.println("n까지의 짝수의 합, 홀수의 합, 3의 배수의 합 출력 프로그램입니다.(종료하려면 0을 입력하세요.)");
			System.out.print("n을 입력하세요: ");
			input = scan.nextInt();
		}
		scan.close();
		System.out.println("*** 프로그램을 종료합니다. ***");
	}
}