package operator;

// 필요 패키지 클래스 가져오기
import java.util.Scanner;

public class Score2Grade {
	public static void main(String[] args) {

		// 필요 변수 선언 및 초기화: 점수 - 정수, 학점 - 한 문자
		Scanner scan = new Scanner(System.in);
		int score;
		char grade = ' ';
	
		System.out.print("점수(정수로 0~100)를 입력하세요: ");
		// 입력 처리
		score = scan.nextInt();
	
		scan.close();

		// 조건에 따른 출력자료 대입 - 단순 if문 5개
		if (score >= 90) grade = 'A';
		if (score >= 80 && score < 90) grade = 'B';
		if (score >= 70 && score < 80) grade = 'C';
		if (score >= 60 && score < 70) grade = 'D';
		if (score < 60) grade = 'F';
	
		// 출력 처리
		System.out.println(score + "점은 " + grade + "학점입니다.");		
	}
}
