package classEx;

public class ClassEx02 {
	public static void main(String[] args) {
		Name n = new Name();
		ClassInfo ci = new ClassInfo();
		
		n.namePrint();
		ci.namePrint();
		
		n.name = "서정한";
		ci.ver = 2.0;
		
		n.namePrint();
		ci.namePrint();
	}
}