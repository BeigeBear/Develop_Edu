package TimeClass;

import java.util.TimerTask;

public class ExTimerTask1 extends TimerTask {
	
	@Override
	public void run() {
		System.out.println("ExTimerTask1 : 이 곳의 작업이 실행됩니다.");
	}
}
