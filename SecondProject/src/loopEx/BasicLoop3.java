package loopEx;

public class BasicLoop3 {
	public static void main(String[] args) {
		long total = 0;
		for (int i = 10; i >= 1; i--) { 
			total += i;
		}
		System.out.println("10부터 1까지의 합은 " + total + "입니다.");
	}
}
