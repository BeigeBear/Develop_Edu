package ThisIsJava;

import java.util.Scanner;

public class Quiz_0901_4 {

	public static void main(String[] args) {
		String sun = null;
		String[] moon = new String[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("5���� ���ø� �Է��ϼ���");
		
		for(int i=0; i<(moon.length); i++) {
			sun = sc.nextLine();
			moon[i]=sun;
		}
			
		for(int i=0; i<(moon.length); i++) {		
			System.out.println(moon[i]);
			if(moon[i].equals("seoul")) {
				break;
			}
		}
	}
}




// For�� + if���� Break�� �̿��� ���� ����
// 1���� 5������ �ݺ��� �ۼ�
// ���� 3�̸� �ݺ��� Ż��.
// �迭�� �̸� 5���� ���ڿ��� �����صд�.
// �ݺ������� �� ���� �迭�� ���ڿ����� �Ѱ��� �˻��ϴٰ� Ư�����ڿ��� ������ Ż���ϱ�