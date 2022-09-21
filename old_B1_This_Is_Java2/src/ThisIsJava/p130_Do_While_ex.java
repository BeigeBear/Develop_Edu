package ThisIsJava;

import java.util.Scanner;

public class p130_Do_While_ex { 
	// do-while문은 최소한 한 번은 실행하고 판단한다.
	

	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
//		                 메모리할당            입력
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while(!inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
	}

}