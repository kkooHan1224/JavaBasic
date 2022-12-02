package arrayEx;

import java.util.Scanner;

public class ArrayMultiScore {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] names = new String [3];
		int[][] scores = new int [3][2];
		int totalEng = 0;
		int totalJava = 0;
		double avgEng = 0.0;
		double avgJava = 0.0;
		
		for(int i = 0; i < names.length; i++) {
			System.out.print((i+1) + "번째 학생의 이름을 입력하세요: ");
			names[i] = scan.nextLine();
			System.out.print("영어 점수 입력: ");
			scores[i][0] = scan.nextInt();
			System.out.print("자바 점수 입력: ");
			scores[i][1] = scan.nextInt();
			scan.nextLine();
			
			totalEng += scores[i][0];
			totalJava += scores[i][1];
		}
		
		avgEng = (double)totalEng / 3;
		avgJava = (double)totalJava / 3;
		
		scan.close();
		System.out.println("입력이 완료되었습니다!!");
		
		System.out.println("+++++ 학생 별 점수 +++++");
		System.out.println("               영어  자바");
		for(int i = 0; i < names.length; i++) {
			System.out.printf("%-3s : %8d %3d\n", names[i], scores[i][0], scores[i][1]);
		}
		System.out.printf("총 점 : %8d %5d\n", totalEng, totalJava);
		System.out.printf("평 균 : %8.1f %5.1f\n", avgEng, avgJava);
		System.out.println("+++ 프로그램을 종료합니다!! +++");
	}
}