package StringMethod;

import java.util.Timer;
import java.util.TimerTask;

public class TimeClass {

	public TimerEx() throws InterruptedException {
		System.out.println("^^");
		Timer timer = new Timer(True);
		TimerTask t1 = new ExTimerTask1();
		TimerTask t2 = new ExTimerTask2();
	}

}
