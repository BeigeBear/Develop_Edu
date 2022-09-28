import java.awt.Toolkit;

public class BeepPrintExample21 {
	public static void main(String[] args) {
		// Runnable 익명 객체 구현
		Thread thread = new Thread(new Runnable()
		{
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					System.out.println("삑");
					try {
						Thread.sleep(500);
					} catch(Exception e) {
						
					}
				}
			}
		} );

	
	}
}