package Toy_Teacher;

public class Airplane implements Light, Misile {
	public Airplane() {
		System.out.println("비행기입니다.");
		misile();
		lignt();
		System.out.println("*******************");
	}
	public void misile() {
		System.out.println("미사일 발사가 가능합니다.");
	}
	public void lignt() {
		System.out.println("불빛 발사가 가능합니다.");
	}
}
