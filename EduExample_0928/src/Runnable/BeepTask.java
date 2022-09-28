package Runnable;

import java.awt.Toolkit;

public class BeepTask {
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
}
