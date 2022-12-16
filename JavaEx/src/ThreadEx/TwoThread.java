package ThreadEx;

class KorTrans extends Thread {
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

public class TwoThread {
	public static void main(String[] args) {
		
		Thread KorTrans = new KorTrans();
		KorTrans.start();
		
		String[] eng = {"One", "Two", "Three", "Four", "Five"};
		
		for (int i = 0; i < eng.length; i++) {
			System.out.println("영어 : " + eng[i]);
			try {Thread.sleep(100);} catch(InterruptedException e) {}
		}
	}
}