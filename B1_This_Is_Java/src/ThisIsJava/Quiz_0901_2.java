package ThisIsJava;

import java.util.Scanner;

public class Quiz_0901_2 {

//	(1) ���̵�� ��ȣ�� �Է¹޴´�.(���� �ٸ� ������ �������ش�. ���ڿ��� ����)
//	(2) ���̵� "admin"�̰�, ��ȣ�� "1234"�̸� �α��� �Ǿ����ϴ�"�� �����.
//	(3) ����, ���̵� ��ȣ�� Ʋ������ "�ٽ� �α������ֽʽÿ�"�� �����""
	
	
	public static void main(String[] args) {
		String id = null; // ������ ���̵� ����� ��(null�� �ʱ�ȭ)
		String pw = null; // ������ ��й�ȣ�� ����� ��(null�� �ʱ�ȭ)
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("���̵� �Է����ּ���");
		id = sc.next();
		
		System.out.println("��й�ȣ�� �Է����ּ���");
		pw = sc.next();
		
		
//		if((id == "admin") && (pw =="1234") ) {
//		�ڹٴ� ����(�������)�� ��ġ�� �������� ��ġ�� ���ϰ� �ȴ�(address)
//		equals (������ ����� �����͵��� ���� �� ����. ���ڿ���)


		if(id.equals("admin")) {
			if(pw.equals("1234")) {
				System.out.println("�α��� �Ǿ����ϴ�.");
			} else if(!id.equals("admin")) {
				System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
			} else
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		} else {
			System.out.println("���̵�� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
			
			
			
			
//		���̵� ��ȣ�� Ʋ������ ����ó��
//		���� �ڵ带 �����ؼ� ���̵� Ʋ�ȴ��� ��й�ȣ�� Ʋ�ȴ��� �˾Ƴ�����.
		
		
		

	}

}
