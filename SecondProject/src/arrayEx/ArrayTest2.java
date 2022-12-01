package arrayEx;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[] num = new int[] {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("배열 number[]의 원소 합계:" + sum);
	}
}