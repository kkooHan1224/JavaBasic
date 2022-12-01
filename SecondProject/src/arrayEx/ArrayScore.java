package arrayEx;

import java.util.Scanner;

public class ArrayScore {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] names = new String[5]; 
		int[] scores = new int[5]; 
		
		for (int i=0; i<names.length; i++) {
			System.out.print((i+1) + "번째 학생의 이름을 입력하세요: ");
			names[i] = scan.nextLine();
			System.out.print((i+1) + "번째 학생의 점수를 입력하세요: ");
			scores[i] = scan.nextInt();
			scan.nextLine();
		}
		
		scan.close();
		System.out.println("입력이 완료 되었습니다!!");
		
		System.out.println("++++ 학생 별 점수 ++++");
		
		int totalScore = 0;
		
		for (int i=0; i<scores.length; i++) {
			System.out.println(names[i] + "   : " + scores[i]);
			totalScore += scores[i];
		}
		
		System.out.println("총점: " + totalScore );
		System.out.printf("평균: %.1f\n", (double)totalScore/scores.length);
		System.out.println("+++ 프로그램을 종료합니다! +++");
	}
}