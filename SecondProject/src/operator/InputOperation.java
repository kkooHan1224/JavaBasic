package operator;

import java.util.Scanner;

public class InputOperation {
	public static void main(String[] args) {
		// 클래스 정보 출력
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("+ 점수 계산 프로그램 +");
		System.out.println("+  개발자: 서정한   +");
		System.out.println("+   버 전: 1.0    +");
		System.out.println("++++++++++++++++++++++++++");
		// Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		// 필요 변수 선언
		double korScore, engScore, mathScore, scienceScore, totalScore;
		double avgScore;
		
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
		System.out.printf("총점수는 %.2f입니다.\n", totalScore);
		System.out.printf("평균점수는 %.2f입니다.\n", avgScore);
		System.out.println("프로그램을 이용해 주셔서 감사합니다!");
	}
}
