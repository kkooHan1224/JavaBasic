package ThreadEx;

class KorThread2 implements Runnable {
	@Override
	public void run() {
		String[] kor = {"하나", "둘", "셋", "넷", "다섯"};
		try {Thread.sleep(10);} catch(InterruptedException e) {}
		for (int i = 0; i < kor.length; i++) {
			System.out.println("한글 : " + kor[i]);
			try {Thread.sleep(100);} catch(InterruptedException e) {}
		}
	}
}

class EngThread2 implements Runnable {
	@Override
	public void run() {
		String[] eng = {"One", "Two", "Three", "Four", "Five"};
		
		for (int i = 0; i < eng.length; i++) {
			System.out.println("영어 : " + eng[i]);
			try {Thread.sleep(100);} catch(InterruptedException e) {}
		}
	}
}

public class ThreeRunnable {
	public static void main(String[] args) {
		Runnable KorThread2 = new KorThread2();
		Thread thread1 = new Thread(KorThread2);
		thread1.start();
		
		Runnable EngThread2 = new EngThread2();
		Thread thread2 = new Thread(EngThread2);
		thread2.start();
	}
}
