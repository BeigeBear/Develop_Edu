package Quiz;
// 이 클래스는 별도의 메소드가 없다. 그래서 두개의 숫자를 셋팅할 수 있는 능력이 없음.
// 이를 대체할 수 있는 방법은 생성자를 이용하는 것이다. 객체를 만들때 숫자를 직접 전달해줌.

public class Calc {
	protected int n1;
	protected int n2;
	protected void setNumbers(int a, int b) {
		n1 = a; n2 = b;
	}
	
}