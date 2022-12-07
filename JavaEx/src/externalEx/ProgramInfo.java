package externalEx;

public class ProgramInfo {
	String programName;
	String developerName;
	double programVersion;
	
	public ProgramInfo(String programName, String developerName, double programVersion) {
		this.programName = programName;
		this.developerName = developerName;
		this.programVersion = programVersion;
	}
	public void print() {
		System.out.println("+".repeat(30));
		System.out.println("+   프로그램 명:"+programName+" ".repeat(18-programName.length())+"+");
		System.out.println("+   개발자 이름:"+developerName+" ".repeat(18-developerName.length())+"+");
		System.out.println("+   개발  버전:"+	programVersion+" ".repeat(18-Double.toString(programVersion).length())+"+");		
		System.out.println("+".repeat(30));
	}
}
