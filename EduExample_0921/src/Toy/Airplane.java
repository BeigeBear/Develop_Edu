package Toy;

public class Airplane implements Toy, Light, Misile {
	public void helloName() {
		System.out.println("비행기 입니다.");
	}
	public void misile() {
		System.out.println("미사일 발사가 가능합니다.");
	}
	public void lignt() {
		System.out.println("불빛 발사가 가능합니다.");
	}
}
