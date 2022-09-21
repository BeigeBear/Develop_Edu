package ch3;

public class CastingTest {

	public static void main(String[] args) {
		int a = 12, b = 13;
		float c =0;
		//자동 형변환
		//좌변은 float, 우변은 int
		//우변 계산 결과가(int)가 float으로 변환되어 좌변c에 저장
		c = (a+b)/2;
		//정수/정수는 정수
		//정수/실수는 실수
		//실수/실수는 실수
		
		System.out.println("a와 b의 평균은 "+c+" 이다.");
		
		float f = 12.5f;
		a = (int)f;
		System.out.println("a= "+a);
		
	}

}


//연산자 expr++
//승제에서의 %는 나머지를 뜻한다.
// & 엔퍼센트
// ^ 익스클루시브
// |