package RealJava;

import java.util.Scanner;

public class p91_Switch_ex_4 {

	public static void main(String[] args) {
		String grade="";
		Scanner sc=new Scanner(System.in);
		System.out.println("학년을 입력하라");
		grade=sc.next();
		switch(grade) {
		case "class1":
			System.out.println("1학년 입니다");
			break;
		case "class2":
			System.out.println("2학년 입니다");
			break;
		case "class3":
			System.out.println("3학년 입니다");
			break;
		case "class4":
			System.out.println("4학년 입니다");
			break;
		default:
			System.out.println("학년을 잘못 입력하셨습니다");
			break;
		}
	}

}
