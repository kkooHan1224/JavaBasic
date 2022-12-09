package classEx;

// 임포트 기능을 활용한 ProgramInfo 클래스 사용.
import externalEx.ProgramInfo;

public class importEx2 {
	public static void main(String[] args) {
		ProgramInfo pi = new ProgramInfo();
		pi.print("외부클래스 실습", "서정한", "1.0");
	}
}