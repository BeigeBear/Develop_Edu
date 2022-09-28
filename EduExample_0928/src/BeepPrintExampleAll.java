import java.awt.Toolkit;

public class BeepPrintExampleAll {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println("직접main");
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				
			}
		}
		
		// 직접 Thread 생성
		Runnable beeptask = new BeepThread();
		Thread thread1 = new Thread(beeptask);
		thread1.start();
		
		// Runnable 익명 객체 구현
		Thread thread2 = new Thread(new Runnable() {
		
		public void run() {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0; i<5; i++) {
				toolkit.beep();
				System.out.println("익명2");
				try {
					Thread.sleep(500);
				} catch(Exception e) {
					
				}
			}
		}
		} );
		thread2.start();
		
		// 람다식 이용
		Thread thread3 = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0; i<5; i++) {
				toolkit.beep();
				System.out.println("람다3");
				try {
					Thread.sleep(500);
				} catch(Exception e) {
					
				}
			}
		} );
		thread3.start();
	}
}
