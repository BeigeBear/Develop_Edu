package Quiz;

import java.util.Scanner;

public class bank {
	Scanner sc = new Scanner(System.in);
	String name;
	int money;
	
// 	(1) �����ڿ����� ���̸��� �ܾ��� �ʱ�ȭ���ش�.
//	    ���̸��� null �ܾ��� 0
	public bank() {
		name = "���� ����";
		money = 0;
	} 
	
//	(2) �Ա� - ����� �����Ű�� ���޹��� �ݾ��� �ܾ׿� ������Ų��.
	public void PutMoney(int pm) {
		if(pm<0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �õ����ּ���.");
		} else {
			money = money+pm;
//			money+=pm
			System.out.println(pm+"���� �ԱݵǾ����ϴ�.");
			System.out.println("���� �ܾ��� "+money+"�� �Դϴ�.");
		}
	}
	
//	(3) ��� - ����� �����Ű�� ���޹��� �ݾ��� �ܾ׿��� ������Ų��.
	public void GetMoney(int gm) {
		if(gm>money) {
			System.out.println("�ܾ��� �����մϴ�");
			
		} else {
			money = money-gm;
//			money-=gm
			System.out.println(gm+"���� ��ݵǾ����ϴ�.");
		}
	}
	
//	(4) �ܾ���ȸ - ����� �����ϸ� ���� �ܾ��� ȭ�鿡 ����Ѵ�.
	public void PrintBalance() {
		System.out.println("���� �ܾ��� "+money+"�� �Դϴ�.");
		
	}
	
//	(5) ��ü����Ȯ�� - �����ϸ� �� �̸��� ����Ѵ�.
	public void PrintAllInfo() {
		System.out.println("������ �̸��� "+name+" �Դϴ�.");
	}
	
	
}










