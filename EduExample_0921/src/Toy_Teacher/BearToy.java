package Toy_Teacher;

public class BearToy implements MoveArmLeg {
	public BearToy() {
		System.out.println("곰돌이입니다.");
		moveArmLeg();
		System.out.println("*******************");
	}
	public void moveArmLeg() {
		System.out.println("팔 다리를 움직일 수 있습니다.");
	}
}
