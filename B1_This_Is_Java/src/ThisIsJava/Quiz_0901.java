package ThisIsJava;

import java.util.Scanner;

public class Quiz_0901 {

	public static void main(String[] args) {
		
//		(1) ������ �������, ������ ������ �� �ִ� ������ ������ش�.(��������)
//		�ظ��ϸ� ������ �빮�ھ��� ����
		int Kor, Eng, Math1, Total;
		float Avg;
		
//		(2) ����� ����, ���� ������ �Է¹޾Ƽ� �������ش� (Scanner)
		Scanner sc=new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���");
		Kor=sc.nextInt();

		System.out.println("���� ������ �Է��ϼ���");
		Eng =sc.nextInt();
		
		System.out.println("���� ������ �Է��ϼ���");
		Math1=sc.nextInt();
		
//		(3) ������ ��������� ó���ؼ� �������ش�.(��������� �Ҽ������� ����Ǿ����)
		Total = Kor + Eng + Math1;
		Avg = Total/(float)3.0f; //f�� �־��ش�.
		
//		(4) ��������� 80���̻��̸�, ���հݡ��̶�� ����ϰ�, �ƴϸ� �����հݡ� ������ش�.
//		(6) ����, ����, ����, ���� ���� �߿� 1���� 50�� �̸��̶�� "����"�̶�� ������ش�.
//			(����, � ������ �������� �� �� ����.)
//		(7) ���̵�: if���� ���� �� ������� ����, 1���� ����ؼ� ó���� ��.
		System.out.println("< �����ǥ >");
		if(Avg<80 || Kor<50 || Eng<50 || Math1<50) {
//		if((!(Avg<80)) && (!(Kor<50)) && (!(Eng<50)) && (!(Math<50)) {
			System.out.println("����� ���հ� �Դϴ�.");
		} else {
			System.out.println("����� �հ��Դϴ�");
		}
		
//		(5) ������ ����� ������ش�.
		System.out.println("������ "+ Total + "�� �Դϴ�.");
		System.out.println("����� "+ Math.round(Avg)*100/100.0 + "�� �Դϴ�.");
	}
		
}
