package dataType;

// 스캐너 유틸 임포트
import java.util.Scanner;

public class Gugudan2 {
	public static void main(String[] args) {
		// 키보드 입력 장치 사용 등록(관련 객체 생성)
		Scanner scan = new Scanner(System.in);
		
		// 사용 변수 선언
		int danNum;
		
		// 입력 안내문구 출력
		System.out.print("출력할 단의 숫자: ");
		
		// 정수 입력하여 변수에 대입
		danNum = scan.nextInt();
		
		// 입력 장치 닫기
		scan.close();
		
		// 저장된 변수를 이용해서 결과 출력
		System.out.println(danNum + "단");
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
