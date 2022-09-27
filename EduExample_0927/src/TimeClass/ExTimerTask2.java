package TimeClass;

import java.util.TimerTask;

public class ExTimerTask2 extends TimerTask {
	
	@Override
	public void run() {
		System.out.println("ExTimerTask2 : 이 곳의 작업이 실행됩니다.");
	}
}
