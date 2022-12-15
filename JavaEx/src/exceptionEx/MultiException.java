package exceptionEx;

public class MultiException {
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt("20A");
			System.out.println(3/0);			
		} catch(ArithmeticException a) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch(NumberFormatException n) {
			System.out.println("정수로의 형변환은 숫자만 가능합니다.");
		} finally {
			System.out.println("프로그램을 종료합니다..");
		}
		
	}
}
