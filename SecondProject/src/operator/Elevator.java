package operator;

import java.util.Scanner;

public class Elevator {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int floor;
		String message;
		
		System.out.print("층수를 숫자로 입력해주세요: ");
		floor = scan.nextInt();
		scan.close();
		
		if (floor == 1) message = "1층은 약국입니다.";
		else if (floor == 2) message = "2층은 카페입니다.";
		else if (floor == 3) message = "3층은 병원입니다.";
		else if (floor == 4) message = "4층은 스터디카페입니다.";
		else if (floor == 5) message = "5층은 헬스클럽입니다.";
		else message = "잘못 입력하셨습니다.";
		
		System.out.println(message);
		
		System.out.println("*** 프로그램을 종료합니다. ***");				
	}
}
