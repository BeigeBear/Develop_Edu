package ThisIsJava;

import java.util.Scanner;

public class Quiz_0901 {

	public static void main(String[] args) {
		
//		(1) 성적과 평균점수, 총점을 저장할 수 있는 공간을 만들어준다.(변수선언)
//		왠만하면 변수에 대문자쓰지 말자
		int Kor, Eng, Math1, Total;
		float Avg;
		
//		(2) 국어와 영어, 수학 점수를 입력받아서 저장해준다 (Scanner)
		Scanner sc=new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요");
		Kor=sc.nextInt();

		System.out.println("영어 점수를 입력하세요");
		Eng =sc.nextInt();
		
		System.out.println("수학 점수를 입력하세요");
		Math1=sc.nextInt();
		
//		(3) 총점과 평균점수를 처리해서 저장해준다.(평균점수는 소숫점으로 저장되어야함)
		Total = Kor + Eng + Math1;
		Avg = Total/(float)3.0f; //f를 넣어준다.
		
//		(4) 평균점수가 80점이상이면, “합격”이라고 출력하고, 아니면 “불합격” 출력해준다.
//		(6) 만약, 국어, 영어, 수학 점수 중에 1개라도 50점 미만이라면 "과락"이라고 출력해준다.
//			(단점, 어떤 과목이 과락인지 알 수 없다.)
//		(7) 고난이도: if문을 여러 개 사용하지 말고, 1개만 사용해서 처리할 것.
		System.out.println("< 결과발표 >");
		if(Avg<80 || Kor<50 || Eng<50 || Math1<50) {
//		if((!(Avg<80)) && (!(Kor<50)) && (!(Eng<50)) && (!(Math<50)) {
			System.out.println("결과는 불합격 입니다.");
		} else {
			System.out.println("결과는 합격입니다");
		}
		
//		(5) 총점과 평균을 출력해준다.
		System.out.println("총점은 "+ Total + "점 입니다.");
		System.out.println("평균은 "+ Math.round(Avg)*100/100.0 + "점 입니다.");
	}
		
}
