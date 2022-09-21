package SmartPhone;

public class APhone implements iFunction {
	public void phoneCall() {
		System.out.println("전화 가능합니다");
	}
	public void connectionSpeed() {
		System.out.println("불가능합니다. 3G입니다.");
	}
	public void remoteControlTv() {
		System.out.println("TV리모콘은 탑재되어 있지 않습니다.");
	}

}
