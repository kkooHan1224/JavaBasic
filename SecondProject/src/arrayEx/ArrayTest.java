package arrayEx;

public class ArrayTest {
	public static void main(String[] args) {
		int[] num = new int[] {1,2,3,4,5,6,7,8,9,10};
						
//		for(int i=0; i<num.length; i++) {
//			System.out.println(num[i]);
		
		// num[] 배열 3부터 7까지 일렬로 출력하도록 수정해보기
		for(int i=2; i<7; i++) {
			System.out.print(num[i]);
		}
	}
}