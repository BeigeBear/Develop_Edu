package Quiz;

import java.util.Scanner;

public class bank_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		bank lim = new bank();
		String job;

		System.out.println("원하는 업무 번호를 입력하세요.");
		System.out.println("[ 1.입금 ] [ 2.출금 ] [ 3.잔액조회 ] [ 4.정보확인 ] ");
		
		job = sc.nextLine();
		
		if(job.equals("1")) {
			System.out.println("입금할 금액을 입력하세요.");
			int pm = sc.nextInt();
			lim.PutMoney(pm);
			
		} else if(job.equals("2")) {
			System.out.println("출금할 금액을 입력하세요.");
			int gm = sc.nextInt();
			lim.GetMoney(gm);
			lim.PrintBalance();
			
		} else if(job.equals("3")) {
			lim.PrintBalance();
			
		} else if(job.equals("4")) {
			lim.PrintAllInfo();
		} else {
			System.out.println("정확하지 않습니다. 다시 시도해주세요.");
		}
	}
}
