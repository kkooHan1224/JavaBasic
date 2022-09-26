package Teacher;

public class PrimeNumber {
	public static void main(String[] args) {
		final int N = Integer.parseInt(args[0]);
			
		for(int i = 2; i <= N; i++) {
			if(i % 2 != 0 & i % 3 != 0 && i % 5 != 0 && i % 7 != 0 ) {
			System.out.println(i);
			}
		}
	}
}