import java.awt.Toolkit;

public class BeepThread extends Thread {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			System.out.println("띵동1");
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				
			}
		}
	}
}
