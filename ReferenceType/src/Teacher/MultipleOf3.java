package Teacher;

public class MultipleOf3 {
	public static void main(String[] args) {
		final int N = Integer.parseInt(args[0]);
				
		for(int i = 1; i <= N; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
}
