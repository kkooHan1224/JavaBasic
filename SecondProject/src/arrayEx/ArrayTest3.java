package arrayEx;

public class ArrayTest3 {
	public static void main(String[] args) {
		double[] data = new double[5];
		
//		System.out.println("data 배열의 길이: " + data.length);
//		for(int i = 0; i < data.length; i++) {
//			System.out.println(data[i]);
//		}
				
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		System.out.println("data 배열의 길이: " + data.length);
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
