package RealJava;

import java.util.Scanner;

public class p90_Switch_ex_3 {

	public static void main(String[] args) {
		int grade;
		
//		          (new=�޸� �Ҵ�)
		Scanner sc=new Scanner(System.in);
//		       (sc=��ü(����))          (in=�Է�)
		
		System.out.println("�г��� �Է��϶�");
//		         (. ��� ���� ������, ��� ���� ������)
		
		grade=sc.nextInt();
//		         nextInt ������
//				 nextDouble �Ǽ���
//		         next ����
//		         nextLine ���ڿ�(��������)
		
		switch(grade) {
		case 1:
			System.out.println("1�г� �Դϴ�");
			break;
		case 2:
			System.out.println("2�г� �Դϴ�");
			break;
		case 3:
			System.out.println("3�г� �Դϴ�");
			break;
		case 4:
			System.out.println("4�г� �Դϴ�");
			break;
		default:
			System.out.println("�г��� �߸� �Է��ϼ̽��ϴ�");
			break;
		}
	}
}