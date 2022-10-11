//	[문항3] 반지름 r=10일 때 원의 넓이를 구하여 출력하는 프로그램을 함수로 정의하고 호출하여 출력하도록 작성하시오.

public class Q3 {
	public void circle(int r) {
		System.out.println(Math.PI*(r*r));
	}

	public static void main(String[] args) {		
		Q3 q3 = new Q3();
		q3.circle(10);

	}

}
