package Method;

// 메소드 작성
// 나누기
// 반환하는 값이 있음(float)
// 메소드 이름(divide)
// 매게변수(정수 2개, int x, int y)

public class TEST_CLASS_01 {
	private int data1;
	private int data2;
	// 데이터 2개 (INT, INT)

//	Divide 나누기(반환값은 정수, 매개변수는 정수2개, 하는 일은 두 숫자를 나눠서 돌려준다.)
	float Divide(int x, int y) {
	// 시그니처 & 프로토타입이라 부른
		float result = (float)x / (float)y;
		// 나누기 하는 부분
		return result;
		// 결과를 돌려준다.(반환한다.)
	}
	
//	Plus 더하기(반환값은 정수, 매개변수는 정수2개, 하는 일은 두 숫자를 더해서 돌려준다.)
	int Plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
//	Multiply 곱하기(반환값은 정수, 매개변수는 정수2개, 하는 일은 두 숫자를 곱해서 돌려준다.)
	int Multiply(int x, int y) {
		int result = x * y;
		return result;
	}
	
//	Subtract 빼기(반환값은 정수, 매개변수는 정수2개, 하는 일은 두 숫자를 빼서 돌려준다.)
	int Subtract(int x, int y) {
		int result = x - y;
		return result;
	}
	
}














