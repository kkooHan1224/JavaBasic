package dataType;

public class ExplicitConversionQ4 {
	public static void main(String[] args) {
		int num1 = 10;
		double num2 = 2.0;
		int add = (int)(num1 + num2);
		int sub = (int)(num1 - num2);
		int mul = (int)(num1 * num2);
		int div = (int)(num1 / num2);
		
		System.out.println("10 + 2.0 = " + add);
		System.out.println("10 - 2.0 = " + sub);
		System.out.println("10 * 2.0 = " + mul);
		System.out.println("10 / 2.0 = " + div);
		
//		System.out.println();
		
		
		/* �޸� ������ ���ؼ� ���� �ΰ��� ����ϱ� */
		/*
		int num1 = 10;
		double num2 = 2.0;
		
		System.out.println("10 + 2.0 = " + (int)(num1 + num2));
		System.out.println("10 - 2.0 = " + (int)(num1 - num2));
		System.out.println("10 * 2.0 = " + (int)(num1 * num2));
		System.out.println("10 / 2.0 = " + (int)(num1 / num2));
		*/	
	}
}
