package dataType;

import java.util.Scanner;

public class ScannerTest1 {
	public static void main(String[] args) {
		
		// Ű���� �Է� ��ġ ��� ���(���� ��ü ����)
		Scanner scan = new Scanner(System.in);
		
		// ��� ���� ����
		int iNum = 0;
		double dNum = 0.0;
		String iString = "b";
		
		// �Է� �ȳ����� ���
		System.out.print("���� �Է�: ");
		// ���� �Է��Ͽ� ������ ����
		iNum = scan.nextInt();
		
		// �Է� �ȳ����� ���		
		System.out.print("�Ǽ� �Է�: ");
		// �Ǽ� �Է��Ͽ� ������ ����
		dNum = scan.nextDouble();
		
		// ?????
		scan.nextLine();
		
		// �Է� �ȳ����� ���		
		System.out.print("�ܾ�/���� �Է�: ");
		// �ܾ�/���� �Է��Ͽ� ������ ����
		iString = scan.nextLine();
		
		// �Է� ��ġ �ݱ�
		scan.close();
		
		// ����� ������ �̿��Ͽ� ���� ���
		System.out.println("----------");
		System.out.println("�Է��� ������ " + iNum + " �Դϴ�.");
		System.out.println("�Է��� �Ǽ��� " + dNum + " �Դϴ�.");
		System.out.println("�Է��� �ܾ�/����� " + iString + " �Դϴ�.");
	}
}