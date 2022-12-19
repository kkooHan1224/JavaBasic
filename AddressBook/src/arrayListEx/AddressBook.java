package arrayListEx;

import externalEx.ProgramInfo;
import java.util.Scanner;
import java.util.ArrayList;

public class AddressBook {
	public static void main(String[] args) {
		ProgramInfo.print("주소록 프로그램", "개발자: 서정한", 1.0);
		ArrayList<Address> aList1 = new ArrayList<Address>();   // Address 이런식으로 자료형을 지정할 수도 있구나.
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("1: 등록, 2: 전체조회, 3: 건별조회, 4: 삭제, x:종료 ==> ");
			String code = sc.next();
			switch(code) {
				case "1": input(); break;
				case "2": searchAll(); break;
				case "3": searchName(); break;
				case "4": delete(); break;
				case "x": break;
				default : System.out.println("입력 구분을 잘못 입력하셨습니다!!!");
			}
			
			if (code.equals("x")) {
				System.out.println("**** 프로그램을 이용해 주셔서 감사합니다. ****");
				ProgramInfo.print("\n 주소록 프로그램", "서정한", 1.0);
				break;
			}
		}
	}

	private static void input(Scanner sc, ArrayList<Address> addressBook) {
		System.out.println("+++ 주소 등록 처리 +++");
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		System.out.print("전화번호를 입력하세요: ");
		String phone = sc.next();
		addressBook.add(new Address(name,phone));
		int size = addressBook.size() -1;
		String a_name = addressBook.get(size).getName();
		String a_phone = addressBook.get(size).getPhone();
		System.out.println("등록 완료 ==> "+a_name+" "+a_phone);

		
	}
	
	private static void searchAll() {
		System.out.println("+++ 전체 주소 조회 +++");
		
	}
	
	private static void searchName() {
		System.out.println("+++ 이름으로 주소 조회 +++");
		
	}
	
	private static void delete() {
		System.out.println("+++ 주소 삭제 처리 +++");
		
	}
		
}



/* 기능 설계
 * 
 * 등록
 * 전체 조회
 * 개별 조회 (이름 입력해서)
 * 삭제 (이름 입력해서)
 * 종료
*/

/* 자료 설계
 * 
 * 이름
 * 전화번호
 */

/* 규칙
 * 
 * 무한반복 이용 => while문
 * 입력구분에 따라 등록, 조회, 삭제, 종료 처리 => 입력방식에 대한 안내
 * 자료는 참조자료형으로 처리 => 리스트도 참조 자료형이다. but 저장 공간의 크기가 동적.
 */