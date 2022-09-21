package Toy;

public class MazingerToy implements Toy, Misile, MoveArmLeg {
	public void helloName() {
		System.out.println("마징가 입니다.");
	}
	public void misile() {
		System.out.println("미사일 발사가 가능합니다.");
	}
	public void moveArmLeg() {
		System.out.println("팔 다리를 움직일 수 있습니다.");
	}
}
