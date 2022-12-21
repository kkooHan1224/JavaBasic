package GenericEx;

class Goods<T> {
	private T t;
	public T get() {
		System.out.println(Goods.class+" 객체 생성");
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

public class UsingGeneric {
	public static void main(String[] args) {
		Goods<Apple> goods1 = new Goods<>();
		goods1.set(new Apple());
		Apple apple = goods1.get();
		
		Goods<Pencil> goods2 = new Goods<>();
		goods2.set(new Pencil());
		Pencil pencil = goods2.get();
		
		Goods<Apple> goods3 = new Goods<>();
		goods3.set(new Apple());
		Pencil apple1 = goods3.get();   // 코딩 시 사전 에러 발생
		// 아까 오브젝트로 할 때는 컴파일 전에 오류는 없고 실행시 오류가 발생했지만
		// 제네릭을 사용하니 컴파일 전에 오류가 떴다.
	}
}