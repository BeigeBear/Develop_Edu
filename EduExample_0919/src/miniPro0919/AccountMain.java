package miniPro0919;

import java.util.Scanner;

public class AccountMain {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Account account = new Account(null, null, 0);
		System.out.println("계좌 정보를 입력하세요");
		System.out.print("계좌명의 : ");
		account.setName(sc.nextLine());
		
		System.out.print("계좌번호 : ");
		account.setNo(sc.nextLine());
		
		System.out.print("잔고 : ");
		account.setBalance(sc.nextDouble());
		
		System.out.println("계좌 기본정보 : {"+account.getName()+","+account.getNo()
							+","+account.getBalance()+"}");

		System.out.print("출금액 : ");
		account.withdraw(sc.nextDouble());
		
	}
}
