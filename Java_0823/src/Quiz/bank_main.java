package Quiz;

import java.util.Scanner;

public class bank_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		bank lim = new bank();
		String job;

		System.out.println("���ϴ� ���� ��ȣ�� �Է��ϼ���.");
		System.out.println("[ 1.�Ա� ] [ 2.��� ] [ 3.�ܾ���ȸ ] [ 4.����Ȯ�� ] ");
		
		job = sc.nextLine();
		
		if(job.equals("1")) {
			System.out.println("�Ա��� �ݾ��� �Է��ϼ���.");
			int pm = sc.nextInt();
			lim.PutMoney(pm);
			
		} else if(job.equals("2")) {
			System.out.println("����� �ݾ��� �Է��ϼ���.");
			int gm = sc.nextInt();
			lim.GetMoney(gm);
			lim.PrintBalance();
			
		} else if(job.equals("3")) {
			lim.PrintBalance();
			
		} else if(job.equals("4")) {
			lim.PrintAllInfo();
		} else {
			System.out.println("��Ȯ���� �ʽ��ϴ�. �ٽ� �õ����ּ���.");
		}
	}
}
