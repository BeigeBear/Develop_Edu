package ex;

public class cellPhone {
	String model;
	String color;
	
	void powerIn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 종료합니다.");
	}
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	void voice(String message) {
		System.out.println("자기: " + message);
	}
	void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
