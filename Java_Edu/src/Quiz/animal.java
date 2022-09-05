//동물의 계보를 클래스의 상속구조로 구현해보기
//
//- 조상 클래스 / 동물이라는 개념
//    - animal
//- 후손 클래스 / 동물에서 좀 더 구체적으로 표현된 카데고리들
//    - 어류(fish), 조류(bird), 포유류(mammal)
//- 조상 클래스의 중요한 포인트는 모든 카데고리들이 가질만한 특징을 갖고 있다는 점.
//    - 동작(move), 상태(alive/dead)
//- 후손 클래스의 특징은 구체적인 특정 물체 같은 것을 모델링했다는 점.

package Quiz;

public class animal {
	protected String model;
	protected int age;
	protected String sex;
	
	void wakeUp() {
		System.out.println("일어난다.");
	}
	void sleep() {
		System.out.println("잠을 잔다.");
	}
	void move() {
		System.out.println("움직인다.");
	}
	void dead() {
		System.out.println("죽었다.");
	}
}

//	후손들이 공통적으로 가지는 기능.
//	단점은 모든 후손들이 같은 기능을 하게 된다는 것.
//	그래서 후손들마다 이것을 자기한테 맞도록
//	재정의(re-defind)시킨다.


