package override;
class Human {
	//Overridden method
	public void eat() {
		System.out.println("사람이 밥을 먹고 있다.");
	}
}
class Boy extends Human {
	// Overridding method
//	public void eat() {
//		System.out.println("소년이 밥을 먹고 있다.");
//	public void eat1() {
//		System.out.println("소년이 밥을 먹고 있다.");		
//	}
//	protected void eat1() {
//		System.out.println("소년이 밥을 먹고 있다."); -> 접근지정자가 좁아졌기 때문에 에러가 난다.		
//	}
	public void eat() {
		super.eat();
		System.out.println("소년이 밥을 먹고 있다.");
	}
}

public class OverrideEx {
	public static void main(String[] args) {
		Human h = new Human();
		h.eat();
		Boy b = new Boy();
		b.eat();
		Human hb = new Boy();
		hb.eat();
	}

}
