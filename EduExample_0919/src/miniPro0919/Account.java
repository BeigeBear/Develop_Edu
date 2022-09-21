package miniPro0919;

import java.util.Scanner;

public class Account {

	Scanner sc = new Scanner(System.in);

	String name;
	String no;
	double balance;
	
	public Account(String name, String no, double balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}
	
//	protected void setName(String name) {
//		System.out.print("계좌명의 : ");
//		ㅜ
//		this.name = name;
//	}

	protected String getNo() {
		return no;
	}

	protected void setNo(String no) {
		this.no = no;
	}

	protected double getBalance() {
		return balance;
	}

	protected void setBalance(double balance) {
		this.balance = balance;
	}

	protected double withdraw(double k) {
		balance -= k;
		System.out.println("잔금은 " + balance + "입니다.");
		return k;
	}
	
	public String toString() {
		return String.format("계좌명의 : %s\n계좌번호 : %s\n계좌잔액 : %d", name, no, balance);
	}
}


















