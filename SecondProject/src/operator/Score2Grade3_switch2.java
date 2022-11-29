package operator;

// 필요 패키지 클래스 가져오기
import java.util.Scanner;

public class Score2Grade3_switch2 {
	public static void main(String[] args) {

		// 필요 변수 선언 및 초기화: 점수 - 정수, 학점 - 한 문자
		Scanner scan = new Scanner(System.in);
		int score;
		String grade;
	
		System.out.print("점수(정수로 0~100)를 입력하세요: ");
		// 입력 처리
		score = scan.nextInt();
	
		scan.close();

		// 조건에 따른 출력자료 대입 - 단순 if문 5개
//		switch (String.format("%.0f", score/10)) {	// 아니구나 85점도 90이 된다...
		switch (score/5) {
			case 20 : 
			case 19 : grade = "A+"; break;
			case 18 : grade = "A"; break;
			case 17 : grade = "B+"; break;
			case 16 : grade = "B"; break;
			case 15 : grade = "C+"; break;
//			...
			default : grade = "F";
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
