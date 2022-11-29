package operator;

import java.util.Scanner;

public class Elevator2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int floor;
		String message;
		
		System.out.print("층수를 숫자로 입력해주세요: ");
		floor = scan.nextInt();
		scan.close();
		
		switch (floor) {
			case 1: message = "약국"; 	break;
			case 2: message = "카페"; 	break;
			case 3: message = "병원"; 	break;
			case 4: message = "스터디카페"; break;
			case 5: message = "헬스클럽"; break;
			default : message = "착오 입력";
		}
		
		System.out.println(floor+"층은 " + message + "입니다.");
		
		System.out.println("*** 프로그램을 종료합니다. ***");				
	}
}
