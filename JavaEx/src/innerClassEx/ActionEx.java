/* 익명이너클래스 만들기 후 */
package innerClassEx;

abstract class Action {
	public abstract void exec();
}

public class ActionEx {
	public static void main(String[] args) {
		Action action = new Action() {
			public void exec() {
				System.out.println("실행");
			}
		};
		action.exec();
	}
}


/* 익명이너클래스 만들기 전 */
//package innerClassEx;
//
//abstract class Action {
//	public abstract void exec();
//}
//
//class MyAction extends Action {
//	@Override
//	public void exec() {
//		System.out.println("실행");
//	}
//}
//
//public class ActionEx {
//	public static void main(String[] args) {
//		Action action = new MyAction();   // 익명 이너클래스를 만드려면 생성자의 위치에 만들어야 한다. 
//		action.exec();
//	}
//}