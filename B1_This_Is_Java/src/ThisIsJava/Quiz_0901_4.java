package ThisIsJava;

import java.util.Scanner;

public class Quiz_0901_4 {

	public static void main(String[] args) {
		String sun = null;
		String[] moon = new String[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 도시를 입력하세요");
		
		for(int i=0; i<(moon.length); i++) {
			sun = sc.nextLine();
			moon[i]=sun;
		}
			
		for(int i=0; i<(moon.length); i++) {		
			System.out.println(moon[i]);
			if(moon[i].equals("seoul")) {
				break;
			}
		}
	}
}




// For문 + if문과 Break를 이용한 패턴 연습
// 1부터 5까지의 반복문 작성
// 만약 3이면 반복문 탈출.
// 배열에 미리 5개의 문자열을 저장해둔다.
// 반복문에서 할 것은 배열의 문자열들을 한개씩 검사하다가 특정문자열이 나오면 탈출하기