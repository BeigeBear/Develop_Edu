package Toy_Teacher;

public class MazingerToy implements Misile, MoveArmLeg {
	public MazingerToy() {
		System.out.println("마징가입니다.");
		moveArmLeg();
		misile();
		System.out.println("*******************");
	}
	public void misile() {
		System.out.println("미사일 발사가 가능합니다.");
	}
	public void moveArmLeg() {
		System.out.println("팔 다리를 움직일 수 있습니다.");
	}
}
