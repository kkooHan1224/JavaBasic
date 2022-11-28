package operator;

import java.util.Scanner;

public class InputOperation2 {
	public static void main(String[] args) {
		// 클래스 정보 출력
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("+ 우등생 판별 프로그램  +");
		System.out.println("+  개발자: 서정한     +");
		System.out.println("+   버 전: 1.0      +");
		System.out.println("++++++++++++++++++++++++++");
		// Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		// 필요 변수 선언
		double korScore, engScore, mathScore, scienceScore, totalScore;
		double avgScore;
		String outputMessage;
		
		System.out.print("국어 점수를 입력하세요: ");
		korScore = scan.nextDouble();
		System.out.print("영어 점수를 입력하세요: ");
		engScore = scan.nextDouble();
		System.out.print("수학 점수를 입력하세요: ");
		mathScore = scan.nextDouble();
		System.out.print("과학 점수를 입력하세요: ");
		scienceScore = scan.nextDouble();
		scan.close();
		totalScore = korScore + engScore + mathScore + scienceScore;
		avgScore = totalScore / 4.0;
		
		outputMessage = avgScore >= 90 ? "우등생 입니다!" : "수고했어요!";
		
		System.out.println(outputMessage);
		
		System.out.println("프로그램을 이용해 주셔서 감사합니다!");
	}
}
