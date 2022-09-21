package RemoteControl;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Television();
		
		rc.setMute(true);
		rc.turnOn();
		rc.turnOff();
		
		System.out.println("=-==============");
		
		rc = new Audio();
		rc.setMute(true);
		rc.turnOn();
		rc.turnOff();

	}

}
