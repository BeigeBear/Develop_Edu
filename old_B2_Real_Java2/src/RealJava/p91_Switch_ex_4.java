package RealJava;

import java.util.Scanner;

public class p91_Switch_ex_4 {

	public static void main(String[] args) {
		String grade="";
		Scanner sc=new Scanner(System.in);
		System.out.println("�г��� �Է��϶�");
		grade=sc.next();
		switch(grade) {
		case "class1":
			System.out.println("1�г� �Դϴ�");
			break;
		case "class2":
			System.out.println("2�г� �Դϴ�");
			break;
		case "class3":
			System.out.println("3�г� �Դϴ�");
			break;
		case "class4":
			System.out.println("4�г� �Դϴ�");
			break;
		default:
			System.out.println("�г��� �߸� �Է��ϼ̽��ϴ�");
			break;
		}
	}

}
