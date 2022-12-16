package ThreadEx;

public class RockScissorsPaper {
	public static void main(String[] args) {
		Thread scissors = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("가위");
					try {Thread.sleep(1000);} catch(InterruptedException e) {}
				}
			}
		});
		
		Thread rock = new Thread(new Runnable() {
			public void run() {
				try {Thread.sleep(100);} catch(InterruptedException e) {}
				for (int i = 0; i < 5; i++) {
					System.out.println("바위");
					try {Thread.sleep(1000);} catch(InterruptedException e) {}
				}
			}
		});
		
		Thread paper = new Thread(new Runnable() {
			public void run() {
				try {Thread.sleep(200);} catch(InterruptedException e) {}
				for (int i = 0; i < 5; i++) {
					System.out.println("보");
					try {Thread.sleep(1000);} catch(InterruptedException e) {}
				}
			}
		});
		
		scissors.start();
		rock.start();
		paper.start();
	}
}
