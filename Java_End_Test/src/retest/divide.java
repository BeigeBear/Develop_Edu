package retest;

import java.util.Scanner;

public class divide {
	Scanner sc;
	
	public float dividenum () {
		sc = new Scanner(System.in);
		System.out.println("첫 번째 정수를 입력하세요");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수를 입력하세요");
		int num2 = sc.nextInt();
		return (float)(num1/num2);
	}

	public static void main(String[] args) {
		divide di = new divide();
		System.out.println("나눈 결과 : "+di.dividenum());
	}
}
