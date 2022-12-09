//package classEx;
//
//public class importEx {
//	public static void main(String[] args) {
//		externalEx.ProgramInfo pi = new externalEx.ProgramInfo("외부클래스 실습", "서정한", 1.0);
//		pi.print();
//	}
//}


package classEx;
import externalEx.ProgramInfo;  // import 임포트하려는 패키지명.임포트하려는클래스명
public class importEx {
   public static void main(String[] args) {      
      //externalEx.ProgramInfo pi = new
      //externalEx.ProgramInfo("외부클래스 실습", "임태이");
//      ProgramInfo pi = new 
//      ProgramInfo("외부클래스 실습", "임태이", "1.0");  
//      pi.print();
      ProgramInfo.print("외부 클래스 실습", "임태이", "1.0");
   }
}