package loopEx;

public class GugudanAllTable {
	public static void main(String[] args) {
		System.out.println ("\n+++++ 구구단 테이블 +++++\n");
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%dX%d=%2d   ", j, i, j * i);
			}
			System.out.println();
		}
	}
}