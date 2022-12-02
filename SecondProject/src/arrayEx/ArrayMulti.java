package arrayEx;

import java.util.Scanner;

public class ArrayMulti {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[][] db = new String [5][2];
		
		for(int i = 0; i < db.length; i++) {
			System.out.print((i+1) + "번째 학생의 이름을 입력하세요: ");
			db[i][0] = scan.nextLine();
			System.out.print("ID를 입력하세요");
			db[i][1] = scan.nextLine();
//			for (int j = 0; j < db[i].length; j++) {
//				if (j % 2 == 0) {
//					System.out.print(i + "번째 학생의 이름을 입력하세요");
//					db[i][j] = scan.nextLine();
//				} else {
//					System.out.print("ID를 입력하세요");
//					db[i][j] = scan.nextLine();
//				}
		// 나는 이중반복문을 통해 입력을 받았는데 안그래도 됐었다.
		// 이대로도 해보고싶긴하다.
			
		}
		scan.close();
		System.out.println("입력이 완료되었습니다!!");
		
		for(int i = 0; i < db.length; i++) {
			System.out.printf(i + "번째 학생: %-10s %-10s \n", db[i][0], db[i][1]);
			// -10s를 통해서 뒤에 띄어쓰기를 하신거구나~
		}
		System.out.println("+++ 프로그램을 종료합니다!! +++");
	}
}

