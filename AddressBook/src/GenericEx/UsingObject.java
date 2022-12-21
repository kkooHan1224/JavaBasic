package GenericEx;

class Apple {}
class Pencil {}

class Goods3 {
	private Object object = new Object();
	public Object getObject() {
		System.out.println(Object.class+" 객체 생성");
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
}

public class UsingObject {
	public static void main(String[] args) {
		Goods3 goods1 = new Goods3();
		goods1.setObject(new Apple());
		Apple apple = (Apple)goods1.getObject();
		
		Goods3 goods2 = new Goods3();
		goods2.setObject(new Pencil());
		Pencil pencil = (Pencil)goods2.getObject();
		
		Goods3 goods3 = new Goods3();
		goods3.setObject(new Apple());
		Pencil pencil2 = (Pencil)goods3.getObject();
		// Object를 사용하면 실행 후에야 ClassCastException을 확인할 수 있다.
	}
}