package dataType;

// ��ĳ�� ��ƿ ����Ʈ
import java.util.Scanner;

public class Gugudan2 {
	public static void main(String[] args) {
		// Ű���� �Է� ��ġ ��� ���(���� ��ü ����)
		Scanner scan = new Scanner(System.in);
		
		// ��� ���� ����
		int danNum;
		
		// �Է� �ȳ����� ���
		System.out.print("����� ���� ����: ");
		
		// ���� �Է��Ͽ� ������ ����
		danNum = scan.nextInt();
		
		// �Է� ��ġ �ݱ�
		scan.close();
		
		// ����� ������ �̿��ؼ� ��� ���
		System.out.println(danNum + "��");
		System.out.println("--------------");
		
		System.out.printf("%dX%d=%2d\n", danNum, 1, danNum*1);
		System.out.printf("%dX%d=%2d\n", danNum, 2, danNum*2);
		System.out.printf("%dX%d=%2d\n", danNum, 3, danNum*3);
		System.out.printf("%dX%d=%2d\n", danNum, 4, danNum*4);
		System.out.printf("%dX%d=%2d\n", danNum, 5, danNum*5);
		System.out.printf("%dX%d=%2d\n", danNum, 6, danNum*6);
		System.out.printf("%dX%d=%2d\n", danNum, 7, danNum*7);
		System.out.printf("%dX%d=%2d\n", danNum, 8, danNum*8);
		System.out.printf("%dX%d=%2d\n", danNum, 9, danNum*9);
		
//		System.out.println(danNum + "X1=" + danNum*1);
//		System.out.println(danNum + "X2=" + danNum*2);
//		System.out.println(danNum + "X3=" + danNum*3);
//		System.out.println(danNum + "X4=" + danNum*4);
//		System.out.println(danNum + "X5=" + danNum*5);
//		System.out.println(danNum + "X6=" + danNum*6);
//		System.out.println(danNum + "X7=" + danNum*7);
//		System.out.println(danNum + "X8=" + danNum*8);
//		System.out.println(danNum + "X9=" + danNum*9);
	}
}
