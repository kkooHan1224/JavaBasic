package dataType;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Gugudan2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int danNum;
		
		System.out.print("출력할 구구단의 단을 입력하세요: ");
		try {
			danNum = scan.nextInt();
		}
		catch(InputMismatchException e) {
//			System.out.println(e);
			System.out.println("입력 오류,,, 정수만 입력하세요!!");
		} finally {
			scan.close();
		}
		danNum = scan.nextInt();
		
		System.out.println(danNum + "단");
		System.out.println("--------------");
		
		System.out.printf("%dX%d=%2d\n", danNum, 1, danNum*1);
		System.out.printf("%dX%d=%2d\n", danNum, 2, danNum*2);
		System.out.printf("%dX%d=%2d\n", danNum, 3, danNum*3);
		System.out.printf("%dX%d=%2d\n", danNum, 4, danNum*4);
		System.out.printf("%dX%d=%2d\n", danNum, 5, danNum*5);
		System.out.printf("%dX%d=%2d\n", danNum, 6, danNum*6);
		System.out.printf("%dX%d=%2d\n", danNum, 7, danNum*7);
		System.out.printf("%dX%d=%2d\n", danNum, 8, danNum*8);
		System.out.printf("%dX%d=%2d\n", danNum, 9, danNum*9);
		
//		System.out.println(danNum + "X1=" + danNum*1);
//		System.out.println(danNum + "X2=" + danNum*2);
//		System.out.println(danNum + "X3=" + danNum*3);
//		System.out.println(danNum + "X4=" + danNum*4);
//		System.out.println(danNum + "X5=" + danNum*5);
//		System.out.println(danNum + "X6=" + danNum*6);
//		System.out.println(danNum + "X7=" + danNum*7);
//		System.out.println(danNum + "X8=" + danNum*8);
//		System.out.println(danNum + "X9=" + danNum*9);
	}
}
