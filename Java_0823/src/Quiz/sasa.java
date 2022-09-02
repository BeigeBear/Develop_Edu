package Quiz;

//데이터 : 정수형 숫자 2개 (int a, int b)
//생성자(두개의 숫자를초기화해주는 역할만 함. 0으로 초기화해줌)
//셋터(두개의 숫자를 전달받아서 a.b에 각각 저장해줌)
//풋터(사칙연산의 결과를 출력해줌)

public class sasa {
	private int a;
	private int b;
	private int plus;
	private int minus;
	private int times;
	private int divide;
	
//	생성자(초기값설정)
	public sasa() {
		a = 0; b = 0;
		plus=0; minus=0; times=0; divide=0;
	}

//	셋팅 및 저장
	void Set(int aa, int bb) {
		a = aa; //임시변수
		b = bb;
	}
	
//	연산
	void Process() {
		plus = (a+b);
		minus = (a-b);
		times = (a*b);
		divide = (a/b);
	}
	
//	출력
	void print() {
		System.out.println("두 정수의 합은 "+plus+" 입니다.");
		System.out.println("두 정수의 차은 "+minus+" 입니다.");
		System.out.println("두 정수의 곱은 "+times+" 입니다.");
		System.out.println("두 정수를 나누면 "+divide+" 입니다.");
	}
}