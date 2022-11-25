package dataType;

import java.util.Scanner;

public class ScannerTest1 {
	public static void main(String[] args) {
		
		// 키보드 입력 장치 사용 등록(관련 객체 생성)
		Scanner scan = new Scanner(System.in);
		
		// 사용 변수 선언
		int iNum = 0;
		double dNum = 0.0;
		String iString = "b";
		
		// 입력 안내문구 출력
		System.out.print("정수 입력: ");
		// 정수 입력하여 변수에 대입
		iNum = scan.nextInt();
		
		// 입력 안내문구 출력		
		System.out.print("실수 입력: ");
		// 실수 입력하여 변수에 대입
		dNum = scan.nextDouble();
		
		// ?????
		scan.nextLine();
		
		// 입력 안내문구 출력		
		System.out.print("단어/문장 입력: ");
		// 단어/문장 입력하여 변수에 대입
		iString = scan.nextLine();
		
		// 입력 장치 닫기
		scan.close();
		
		// 저장된 변수를 이용하여 내용 출력
		System.out.println("----------");
		System.out.println("입력한 정수는 " + iNum + " 입니다.");
		System.out.println("입력한 실수는 " + dNum + " 입니다.");
		System.out.println("입력한 단어/문장는 " + iString + " 입니다.");
	}
}