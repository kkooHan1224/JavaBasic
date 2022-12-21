package arrayListEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;
import java.util.Scanner;

import externalEx.ProgramInfo;

public class AddressBookEx {
	public static void main(String[] args) throws Exception {
		ProgramInfo.print("주소록 프로그램", "개발자: 서정한", 1.0);
		ArrayList addressBook = new ArrayList<Address>();
		addressBook = readfile();
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("\n  1: 등록, 2: 전체조회, 3: 건별조회, 4: 삭제, x: 변경사항 저장/종료 ==> ");
			String code = sc.next();
			switch(code) {
				case "1": input(sc, addressBook); break;
				case "2": searchAll(addressBook); break;
				case "3": searchName(sc, addressBook); break;
				case "4": delete(sc, addressBook); break;
				case "x": break;
				default : System.out.println("'입력 구분을 잘못 입력하셨습니다!!!'");
			}
			
			if (code.equals("x")) {
				writefile(addressBook);
				System.out.println("**** 프로그램을 이용해 주셔서 감사합니다. ****");
				break;
			}
		}
	}

	private static ArrayList readfile() throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:/filetest/newdata1.txt"));
		ArrayList<Address> read_data = null;	// 파일에서 읽어서 저장할 변수
		read_data = (ArrayList<Address>)ois.readObject();	// 파일에서 ArrayList 읽기
		ois.close();
		return read_data;
	}

	
	private static void writefile(ArrayList<Address> addressBook) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:/filetest/newdata1.txt"));
		oos.writeObject(addressBook);	// 파일에 ArrayList 저장
		oos.close();
		
	}

	private static void input(Scanner sc, ArrayList<Address> addressBook) {
		System.out.println("\n+++ 주소 등록 처리 +++");
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		System.out.print("전화번호를 입력하세요: ");
		String phone = sc.next();
		System.out.print("이메일주소를 입력하세요: ");
		String email = sc.next();
		addressBook.add(new Address(name,phone,email));
		int size = addressBook.size() -1;
		String a_name = addressBook.get(size).getName();
		String a_phone = addressBook.get(size).getPhone();
		String a_email = addressBook.get(size).getEmail();
		System.out.println("\n'등록 완료' ==> "+a_name+" "+a_phone+" "+a_email);
	}
	
	private static void searchAll(ArrayList<Address> addressBook) {
		System.out.println("\n+++ 전체 주소 조회 +++");
		if(addressBook.size() <= 0) {
			System.out.println("\n'등록된 연락처가 없습니다.'");
		}
		for (int i = 0; i < addressBook.size(); i++) {
			String a_name = addressBook.get(i).getName();
			String a_phone = addressBook.get(i).getPhone();
			String a_email = addressBook.get(i).getEmail();
			System.out.println((i+1)+") " + a_name + " " + a_phone+ " " + a_email);
		}
	}
	
	private static void searchName(Scanner sc, ArrayList<Address> addressBook) {
		System.out.println("\n+++ 이름으로 주소 조회 +++");
		if(addressBook.size() <= 0) {
			System.out.println("\n'등록된 연락처가 없습니다.'");
		} else {
			System.out.print("이름을 입력하세요: ");
			String name = sc.next();
			System.out.println();
			int cnt = 0;
			for (int i = 0; i < addressBook.size(); i++) {
				if (name.equals(addressBook.get(i).getName())) {
					cnt++;
					System.out.println(cnt + ") " + name + " : " + addressBook.get(i).getPhone() + ", " + addressBook.get(i).getEmail());
					
				}
			}
			if (cnt == 0) System.out.println("\n'등록된 연락처가 없습니다.'");
			/* 
			 어려웠던 포인트
			 1. for 반복문 내에 if문과 else문(등록된 연락처가 없습니다)을 하려고 했는데 
			 	else문이 무조건 출력 되었다. => get(i).getName()이 name과 다를 때마다 else문이 출력.  
			 2. 그럼 어떻게 해야 되나 고민했고, cnt가 왜 있나 궁금했다. => 결국 생각해냈다.
			 	(처음에는 cnt == addressBook.size()라고 했는데
			 	 cnt는 무조건 결국에는 addressBook.size()와 같아지므로 무조건 출력이 되었었다.)
			 */
		}
	}
	
	private static void delete(Scanner sc, ArrayList<Address> addressBook) {
		System.out.println("\n+++ 주소 삭제 처리 +++");
		if(addressBook.size() <= 0) {
			System.out.println("\n'등록된 연락처가 없습니다.'");
		} else {
			System.out.print("이름을 입력하세요 : ");
			String name = sc.next();
			int cnt = 0;
			System.out.println("\n++ 등록 번호 내역 ++");
			for (int i=0; i<addressBook.size(); i++) {
				if (name.equals(addressBook.get(i).getName())) {
					cnt++;
					System.out.println(cnt + ") " + name + " : " + addressBook.get(i).getPhone() + ", " + addressBook.get(i).getEmail());
					
				}
			}
			if (cnt == 0) System.out.println("\n'등록된 연락처가 없습니다.'");
			else {
				System.out.print("\n삭제할 목록번호 #) 입력: ");
				String num = sc.next();
				System.out.println("\n'정말 삭제하시겠습니까?(y/n)'");
				String check = sc.next();
				if (check.equals("y")) {
					addressBook.remove(Integer.parseInt(num)-1);
					System.out.println("\n'삭제 되었습니다.'");
				} else System.out.println("\n'취소 되었습니다.'");
			}
		}
	}		
}