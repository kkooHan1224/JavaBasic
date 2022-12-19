//package externalEx;
//
//public class ProgramInfo {
//	String programName;
//	String developerName;
//	double programVersion;
//	
//	public ProgramInfo(String programName, String developerName, double programVersion) {
//		this.programName = programName;
//		this.developerName = developerName;
//		this.programVersion = programVersion;
//	}
//	public void print() {
//		System.out.println("+".repeat(30));
//		System.out.println("+   프로그램 명:"+programName+" ".repeat(18-programName.length())+"+");
//		System.out.println("+   개발자 이름:"+developerName+" ".repeat(18-developerName.length())+"+");
//		System.out.println("+   개발  버전:"+	programVersion+" ".repeat(18-Double.toString(programVersion).length())+"+");		
//		System.out.println("+".repeat(30));
//	}
//}


package externalEx;
public class ProgramInfo {
   // ProgramInfo 클래스의 print()메소드를 static으로 처리하기
    public static void print(String programName, String developerName, double version) {
      System.out.println("+".repeat(40));
      System.out.println("+     프로그램명:"+programName+" ".repeat(17-programName.length())+"+");
      System.out.println("+     개발자 이름:"+developerName+" ".repeat(19-developerName.length())+"+");
      System.out.println("+     개발  버전:"+version+" ".repeat(22-Double.toString(version).length())+"+");
      System.out.println("+".repeat(40));
   }
}


//String programName; //필드변수
//String developerName; // 필드변수
//String version;
//
//public ProgramInfo(String programName, String developerName, String version) { // 매개변수
// this.programName = programName;
// this.developerName = developerName;
// this.version = version;
//}