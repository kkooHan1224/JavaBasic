package arrayListEx;

import externalEx.ProgramInfo;
import java.util.ArrayList;

public class Ex1 {
	public static void main(String[] args) {
		ProgramInfo.print("ArrayList 실습", "서정한", 1.0);
		ArrayList<String> aList1 = new ArrayList<String>();
		
		// ArrayList에 입력하기
		aList1.add("일지매");
		aList1.add("홍길동");
		aList1.add("일지매");
		
		// ArrayList 전부 출력
		System.out.println(aList1);
		// ArrayList 1번째 내용 출력
		System.out.println(aList1.get(0));
		// ArrayList에 일지매가 있는지 조회하여 출력
		int cnt = 0;
		for (int i=0; i<aList1.size(); i++) {
			if(aList1.get(i) == "서정한") {
				cnt += 1;
				System.out.println(aList1.get(i));
			}
		}
		if (cnt ==0) System.out.println("자료가 없습니다.");
		// 첫 번째 일지매를 일지순으로 바꾸기
		aList1.set(0, "일지순");   // 0번째 요소를 "일지순"으로 바꾼다.
		System.out.println(aList1);
		// 일지순을 바꾸기
		aList1.remove("일지순");   // 일지순이라는 요소를 제거한다.
		System.out.println(aList1);
		
		System.out.println();
		System.out.println();
		
		// 자신의 이름 2번 등록
		aList1.add("서정한");
		aList1.add("서정한");
		
		// 전체 출력
		System.out.println(aList1);
		
		// 자신의 이름 1개 삭제
		aList1.remove("서정한");
		
		// 자신의 이름이 등록되었는지 찾아 출력하는 문장 추가 
		cnt = 0;
		for (int i=0; i<aList1.size(); i++) {
			if(aList1.get(i) == "서정한") {
				cnt += 1;
				System.out.println(aList1.get(i) + "님은 명단에 등록되어 있습니다.");
			}
		}
		if (cnt ==0) System.out.println("님은 명단에 등록되어 있지 않습니다.");
		
		// 전체 출력
		System.out.println(aList1);
	}
}