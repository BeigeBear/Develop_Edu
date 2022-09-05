package Quiz;

public class animal_Mammal extends animal {
//	포유류 클래스망이 가지는 메소드를 작성
//	특정 메세지("walking")을 출력
	
	void walking() {
		System.out.println("걷는다.");
	}
	
//	오버라이딩 overRide
	void move() {
		System.out.println("걷는다.(override)");
	}
}
