package Quiz;

import java.util.Scanner;

public class bank {
	Scanner sc = new Scanner(System.in);
	String name;
	int money;
	
// 	(1) �����ڿ����� ���̸��� �ܾ��� �ʱ�ȭ���ش�.
//	    ���̸��� null �ܾ��� 0
	public bank() {
		name = "null";
		money = 0;
	}
	
//	(2) �Ա� - ����� �����Ű�� ���޹��� �ݾ��� �ܾ׿� ������Ų��.
	public void PutMoney(int pm) {
		money = money+pm;
		System.out.println(pm+"���� �ԱݵǾ����ϴ�.");
	}
	
//	(3) ��� - ����� �����Ű�� ���޹��� �ݾ��� �ܾ׿��� ������Ų��.
	public void GetMoney(int gm) {
		money = money-gm;
		System.out.println(gm+"���� ��ݵǾ����ϴ�.");
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







