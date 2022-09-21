package Toy;

public class BearToy implements Toy, MoveArmLeg {
	public void helloName() {
		System.out.println("곰돌이 입니다.");
	}
	public void moveArmLeg() {
		System.out.println("팔 다리를 움직일 수 있습니다.");
	}
}
