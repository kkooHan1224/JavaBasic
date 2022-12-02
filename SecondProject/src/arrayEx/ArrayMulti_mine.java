package arrayEx;

import java.util.Scanner;

public class ArrayMulti_mine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[][] db = new String [5][2];
		
		for(int i = 0; i < db.length; i++) {
			for (int j = 0; j < db[i].length; j++) {
				if (j % 2 == 0) {
					System.out.print(i + "번째 학생의 이름을 입력하세요");
					db[i][j] = scan.nextLine();
				} else {
					System.out.print("ID를 입력하세요");
					db[i][j] = scan.nextLine();
				}
			}
		}
		scan.close();
		System.out.println("입력이 완료되었습니다!!");
		
		for(int i = 0; i < db.length; i++) {
			for (int j = 0; j < db[i].length; j++) {
			System.out.println(db[i][j]);
			}
		}
		System.out.println("+++ 프로그램을 종료합니다!! +++");
	}
}