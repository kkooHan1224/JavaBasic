package loopEx;

public class BasicLoop2 {
	public static void main(String[] args) {
		long total = 0;
		for (int i = 1; i <= 100000; i++) { 
			total += i;
		}
		// JS 지역변수 전역변수 개념처럼, total이 for문 안에 있을 경우 for문 밖에서 출력을 못한다.
		System.out.println("1부터 100000까지의 합은 " + total + "입니다.");
	}
}
