package ThisIsJava;

import java.util.Scanner;

public class p130_Do_While_ex { 
	// do-while���� �ּ��� �� ���� �����ϰ� �Ǵ��Ѵ�.
	

	public static void main(String[] args) {
		System.out.println("�޼����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���");
		
		Scanner scanner = new Scanner(System.in);
//		                 �޸��Ҵ�            �Է�
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while(!inputString.equals("q"));
		
		System.out.println();
		System.out.println("���α׷� ����");
	}

}