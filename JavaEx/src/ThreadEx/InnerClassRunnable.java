package ThreadEx;

public class InnerClassRunnable {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] kor = {"하나", "둘", "셋", "넷", "다섯"};
				try {Thread.sleep(10);} catch(InterruptedException e) {}
				for (int i = 0; i < kor.length; i++) {
					System.out.println("한글 : " + kor[i]);
					try {Thread.sleep(100);} catch(InterruptedException e) {}
				}
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] eng = {"One", "Two", "Three", "Four", "Five"};	
				for (int i = 0; i < eng.length; i++) {
					System.out.println("영어 : " + eng[i]);
					try {Thread.sleep(100);} catch(InterruptedException e) {}
				}
			}
		});

		thread1.start();
		thread2.start();
	}
}