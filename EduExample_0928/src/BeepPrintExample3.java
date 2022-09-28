import java.awt.Toolkit;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		//상속
		Thread thread = new BeepThread();
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				
			}
		}
		
		
		// Runnable 익명 객체 이용
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					System.out.println("1번 띵");
					try {
						Thread.sleep(500);
					} catch(Exception e) {
						
					}
				}
			}
		}

	}

}
