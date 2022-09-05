package Method;

public class PLAY_CLASS_02 {
// TEAT_CLASS로 객체를 생성한다.
//	그 객체에는 Divide라는 기능이 있다.
//	그걸 사용해서 두개의 숫자를 나눈 결과를 전달받는다.
//	전달받은 결과를 화면에 출력한다.

	public static void main(String[] args) {
		TEST_CLASS_01 cameo = new TEST_CLASS_01();
//		객체를 생성한다.
		int a = 101;
		int b = 14;
		
		float di = cameo.Divide(a, b); // "." 메소드 호출(call)
		int pl   = cameo.Plus(a, b);
		int mu   = cameo.Multiply(a, b);
		int su   = cameo.Subtract(a, b);
		
		System.out.println("a는 " + a +", b는 "+ b +"\n");
		System.out.println("나누면 " + di);
		System.out.println("더하면 " + pl);
		System.out.println("곱하면 " + mu);
		System.out.println("빼면 " + su);
	}
}