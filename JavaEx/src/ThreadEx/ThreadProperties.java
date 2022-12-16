package ThreadEx;

public class ThreadProperties {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("동작 중 쓰레드 갯수: " + Thread.activeCount());
		Thread curThread = Thread.currentThread();
		System.out.println("현재 쓰레드 이름: " + curThread.getName());
			// .activeCount()는 객체를 만들지 않아도 사용할 수 있는 static 메서드이고
			// . getName()은 객체를 만들어야 사용할 수 있는 메서드이다.

		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			thread.setName(i+"번째 쓰레드");   // setName() 메서드도 객체를 만들어야 사용 가능하다.
			System.out.println("쓰레드 이름: " + thread.getName());
			thread.start();
		}

		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.println("쓰레드 이름: " + thread.getName());
			thread.start();
		}

		System.out.println("동작 중 쓰레드 갯수: " + Thread.activeCount());
	}

}