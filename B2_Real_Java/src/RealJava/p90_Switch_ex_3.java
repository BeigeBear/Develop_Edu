package RealJava;

import java.util.Scanner;

public class p90_Switch_ex_3 {

	public static void main(String[] args) {
		int grade;
		
//		          (new=메모리 할당)
		Scanner sc=new Scanner(System.in);
//		       (sc=객체(변수))          (in=입력)
		
		System.out.println("학년을 입력하라");
//		         (. 멤버 접근 연산자, 요소 지정 연산자)
		
		grade=sc.nextInt();
//		         nextInt 정수형
//				 nextDouble 실수형
//		         next 문자
//		         nextLine 문자열(공백포함)
		
		switch(grade) {
		case 1:
			System.out.println("1학년 입니다");
			break;
		case 2:
			System.out.println("2학년 입니다");
			break;
		case 3:
			System.out.println("3학년 입니다");
			break;
		case 4:
			System.out.println("4학년 입니다");
			break;
		default:
			System.out.println("학년을 잘못 입력하셨습니다");
			break;
		}
	}
}