package ThisIsJava;

import java.util.Scanner;

public class Quiz_0901_2 {

//	(1) 아이디와 암호를 입력받는다.(각각 다른 변수에 저장해준다. 문자열로 저장)
//	(2) 아이디가 "admin"이고, 암호가 "1234"이면 로그인 되었습니다"를 출력함.
//	(3) 만약, 아이디가 암호가 틀렸으면 "다시 로그인해주십시오"를 출력함""
	
	
	public static void main(String[] args) {
		String id = null; // 유저의 아이디가 저장될 곳(null로 초기화)
		String pw = null; // 유저의 비밀번호가 저장될 곳(null로 초기화)
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("아이디를 입력해주세요");
		id = sc.next();
		
		System.out.println("비밀번호를 입력해주세요");
		pw = sc.next();
		
		
//		if((id == "admin") && (pw =="1234") ) {
//		자바는 변수(저장공간)의 위치와 데이터의 위치를 비교하게 된다(address)
//		equals (실제로 저장된 데이터들을 비교할 수 있음. 문자열만)


		if(id.equals("admin")) {
			if(pw.equals("1234")) {
				System.out.println("로그인 되었습니다.");
			} else if(!id.equals("admin")) {
				System.out.println("아이디가 틀렸습니다.");
			} else
				System.out.println("비밀번호가 틀렸습니다.");
		} else {
			System.out.println("아이디와 비밀번호가 틀렸습니다.");
		}
			
			
			
			
//		아이디나 암호가 틀렸으면 에러처리
//		위의 코드를 수정해서 아이디가 틀렸는지 비밀번호가 틀렸는지 알아내세요.
		
		
		

	}

}
