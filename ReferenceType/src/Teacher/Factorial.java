package Teacher;

public class Factorial {
	public static void main(String[] args) {
		final int N = Integer.parseInt(args[0]);
		int factorial = 1;
		
		for(int i = 1; i <= N; i++) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}
}
