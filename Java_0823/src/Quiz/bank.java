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
		if(pm<0) {
			System.out.println("잘못 입력하셨습니다. 다시 시도해주세요.");
		} else {
			money = money+pm;
//			money+=pm
			System.out.println(pm+"원이 입금되었습니다.");
			System.out.println("현재 잔액은 "+money+"원 입니다.");
		}
	}
	
//	(3) ��� - ����� �����Ű�� ���޹��� �ݾ��� �ܾ׿��� ������Ų��.
	public void GetMoney(int gm) {
		if(gm>money) {
			System.out.println("잔액이 부족합니다.");
			
		} else {
			money = money-gm;
//			money-=gm
			System.out.println(gm+"원이 출금되었습니다.");
		}
	}
	
//	(4) �ܾ���ȸ - ����� �����ϸ� ���� �ܾ��� ȭ�鿡 ����Ѵ�.
	public void PrintBalance() {
		System.out.println("현재 잔액은 "+money+"원 입니다.");
		
	}
	
//	(5) ��ü����Ȯ�� - �����ϸ� �� �̸��� ����Ѵ�.
	public void PrintAllInfo() {
		System.out.println("고객님의 이름은 "+name+"입니다.");
		System.out.println(name+"님의 잔액은"+money+"원 입니다.");
	}
	
	
}










