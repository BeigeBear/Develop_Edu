package Quiz;

import java.util.Scanner;

public class bank {
	Scanner sc = new Scanner(System.in);
	String name;
	int money;
	
// 	(1) 생성자에서는 고객이름과 잔액을 초기화해준다.
//	    고객이름은 null 잔액은 0
	public bank() {
		name = "정보 없음";
		money = 0;
	} 
	
//	(2) 입금 - 기능을 실행시키면 전달받은 금액을 잔액에 누적시킨다.
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
	
//	(3) 출금 - 기능을 실행시키면 전달받은 금액을 잔액에서 차감시킨다.
	public void GetMoney(int gm) {
		if(gm>money) {
			System.out.println("잔액이 부족합니다");
			
		} else {
			money = money-gm;
//			money-=gm
			System.out.println(gm+"원이 출금되었습니다.");
		}
	}
	
//	(4) 잔액조회 - 기능을 실행하면 현재 잔액을 화면에 출력한다.
	public void PrintBalance() {
		System.out.println("현재 잔액은 "+money+"원 입니다.");
		
	}
	
//	(5) 전체정보확인 - 실행하면 고객 이름을 출력한다.
	public void PrintAllInfo() {
		System.out.println("고객님의 이름은 "+name+" 입니다.");
	}
	
	
}










