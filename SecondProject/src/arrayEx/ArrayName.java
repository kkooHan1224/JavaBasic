package arrayEx;

import java.util.Scanner;

public class ArrayName {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] names = new String[5]; 
		
		for (int i=0; i<names.length; i++) {
			System.out.print((i+1) + "번째 학생의 이름을 입력하세요: ");
			names[i] = scan.nextLine();
		}
		scan.close();
		System.out.println("이름 입력이 완료 되었습니다!!");
		
		for (int i=0; i<names.length; i++) {
			System.out.println((i+1) + "번째 학생 이름: " + names[i]);
		}
		System.out.println("+++ 프로그램을 종료합니다! +++");
	}
}