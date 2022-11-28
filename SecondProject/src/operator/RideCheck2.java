package operator;

import java.util.Scanner;

public class RideCheck2 {
	public static void main(String[] args) {
		//190cm 초과하면 놀이기구를 탈 수 없다.
		
		// 프로그램 설명
		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println("놀이기구 탑승여부 확인 프로그램");
		System.out.println("++++++++++++++++++++++++++++++");
		
		// 스캐너 객체 생성
		Scanner scan = new Scanner(System.in);
		
		// 변수 선언
		double height, weight;
		String outputMessage;
		
		// 입력값 받기
		System.out.print("본인의 키(cm)를 입력하세요: ");
		height = scan.nextDouble();
		System.out.print("본인의 몸무게(kg)를 입력하세요: ");
		weight = scan.nextDouble();
		
		scan.close();
		
		// if문
		if (height > 190) outputMessage = "키가 190cm가 넘어 이 놀이기구를 탈 수 없습니다!";
		else {
			if (weight > 120) { 
				outputMessage = "몸무게가 120kg이 넘어 이 놀이기구를 탈 수 없습니다!";
			} else outputMessage = "어서오세요, 즐거운 시간되세요!";
		}
		
		// 결과 출력
		System.out.println(outputMessage);
		
		// 프로그램 종료 안내
		System.out.println("프로그램이 종료되었습니다.");
		
	}
}
