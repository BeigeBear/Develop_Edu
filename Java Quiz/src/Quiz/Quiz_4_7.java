package Quiz;

// �Է��� ���� ������ŭ '*'�� ǥ���ϴ� ���α׷��� �ۼ�����. ���������� �ٹٲ� ���ڸ� ����� ��.
// ��, ���� ���� 1�̸��̸� �� �ٲ� ���ڸ� ǥ���ؼ��� �� �ȴ�.

import java.util.Scanner;

public class Quiz_4_7 {

	public static void main(String[] args) {
		Scanner star=new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		
		int n = star.nextInt();     		// n�� �Է�
		
		if (n>0) { 							// �Է��� n�� 0���� ũ��
			int i = 0;						// i �� 0���� ����
			while(i<n) {					// i�� n���� ���� ���
				System.out.print("*");		// * ����
				i++;						// i�� 1�� ���
			}
		}
		System.out.println();
	}
}