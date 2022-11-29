package operator;

// 필요 패키지 클래스 가져오기
import java.util.Scanner;

public class Score2Grade3_switch {
	public static void main(String[] args) {

		// 필요 변수 선언 및 초기화: 점수 - 정수, 학점 - 한 문자
		Scanner scan = new Scanner(System.in);
		int score;
		char grade;
	
		System.out.print("점수(정수로 0~100)를 입력하세요: ");
		// 입력 처리
		score = scan.nextInt();
	
		scan.close();

		// 조건에 따른 출력자료 대입 - switch / case
		switch (score/10) {		// 90이상 -> 십의자리 숫자:9, 묵시적 형변환이 일어난다. 
			case 10 : case 9 : grade = 'A'; break;
			case 8 : grade = 'B'; break;
			case 7 : grade = 'C'; break;
			case 6 : grade = 'D'; break;
			default : grade = 'F';
		}
		
		/* 이전 코드
		if (score >= 90) grade = 'A';
		else if (score >= 80) grade = 'B';
		else if (score >= 70) grade = 'C';
		else if (score >= 60) grade = 'D';
		else grade = 'F';
		*/
	
		// 출력 처리
		System.out.println(score + "점은 " + grade + "학점입니다.");		
	}
}
