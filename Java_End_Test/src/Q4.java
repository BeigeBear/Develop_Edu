//	[문항4] 키보드를 통해서 주민등록번호 13자리를 입력 했을 때 유효한 주민등록번호인지 아닌지를 판별하는 프로그램을 작성하시오.
//			(단, 유효하지 않은 주민등록번호의 경우에는 메시지를 출력)
//			1. 주민등록번호 앞자리 6자리가 아니면 메시지 출력
//			2. 주민등록번호 뒷자리 7자리가 아니면 메시지 출력
//			3. 유효한 주민등록번호 아니면 메시지 출력

import java.util.Scanner;
import java.util.regex.Pattern;

public class Q4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요");
		System.out.println("> 예시 221012-3123456");
		
		String inputssn = sc.nextLine();
		String[] ssnarr = inputssn.split("-");
		
		String ssn1 = "\\d{6}";
		String ssn2 = "\\d{7}";
		
		boolean ssn1result = Pattern.matches(ssn1, ssnarr[1]);
		if(ssn1result == false) {
			System.out.println("주민번호 앞자리를 다시 입력해주세요.");
		}
		
		boolean ssn2result = Pattern.matches(ssn2, ssnarr[2]);
		if(ssn2result == false) {
		System.out.println("주민번호 뒷자리를 다시 입력해주세요.");
		}
//		if(ssn1result) {
//			System.out.println("주민번호 앞자리를 다시 입력해주세요.");
//		} else if(ssn2result) {
//			System.out.println("주민번호 뒷자리를 다시 입력해주세요.");
//		} else {
//			System.out.println("주민번호를 다시 입력해주세요.");
//		}
	}
}
