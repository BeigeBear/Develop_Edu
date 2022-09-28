import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		// 직접 Thread 생성
		Runnable beeptask = new BeepThread();
		Thread thread1 = new Thread(beeptask);
		thread1.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				
			}
		}
		

		

	}

}
