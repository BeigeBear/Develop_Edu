//	[문항6] 키보드로 년도를 입력받아 윤년인지 평년인지를 구하는 프로그램을 작성하시오.

import java.time.LocalDate;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력하세요");
		LocalDate targetDate = LocalDate.of(sc.nextInt(), 1, 1);
		if(targetDate.isLeapYear()) {
			System.out.println(">> 올해는 윤년입니다.");
		} else {
			System.out.println("올해는 평년입니다.");
		}
		sc.close();
	}
}