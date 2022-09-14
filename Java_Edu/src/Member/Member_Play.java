package Member;

import java.util.ArrayList;
import java.util.Scanner;

public class Member_Play {

	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Member> Tennis = new ArrayList<Member>();
	
	
	// 샘플 입력
	static void memberSample() {
		
		Member tmp1 = new Member();
		tmp1.setMemberInfo("홍길동", "road", "1234");
		Tennis.add(tmp1);
		
		Member tmp2 = new Member();
		tmp2.setMemberInfo("이정재", "choco", "1234");
		Tennis.add(tmp2);
		
		Member tmp3 = new Member();
		tmp3.setMemberInfo("정우성", "castle", "1234");
		Tennis.add(tmp3);
		
		Member tmp4 = new Member();
		tmp4.setMemberInfo("최수빈", "water", "1234");
		Tennis.add(tmp4);
		
		Member tmp5 = new Member();
		tmp5.setMemberInfo("이순재", "soon", "1234");
		Tennis.add(tmp5);
		
		Member tmp6 = new Member();
		tmp6.setMemberInfo("강호동", "river", "1234");
		Tennis.add(tmp6);
		
		Member tmp7 = new Member();
		tmp7.setMemberInfo("유재석", "stone", "1234");
		Tennis.add(tmp7);
		
		Member tmp8 = new Member();
		tmp8.setMemberInfo("이용진", "dragon", "1234");
		Tennis.add(tmp8);
	}
	
	
	// 메인 메뉴 Play
	static void MemberPlay() {
			while(true) {
				System.out.println("회원 관리");
				System.out.println(" 1 | 회원가입");
				System.out.println(" 2 | 로그인");
				System.out.println(" 3 | 회원정보 출력");
				System.out.println(" 4 | 회원탈퇴");
				System.out.println(" 5 | 종료");
				int play;
				play = sc.nextInt( );
			 
				switch(play) {
					case 1: {
						regMember();
					} break;
					
					case 2:{
						loginMember();
					} break;
					
					case 3:{
						printMembers();
					} break;
					
					case 4:{
						deleteMember();
					} break;

					case 5:{
						exitProgram();
					} break;

					default: {
						System.out.println("존재하지않는 메뉴입니다");
						break;
					}
				}
			}
		}
	
	
	// 1. 회원가입
	static void regMember() {
		String tmp_memName;
		String tmp_memId;
		String tmp_memPassword;
		Member tmp = new Member();	
		
		System.out.println("[ 회원가입 ]");
		System.out.println("▶ 이름을 입력하세요");
		tmp_memName = sc.next();
		System.out.println("▶ 아이디을 입력하세요");
		tmp_memId = sc.next();
		System.out.println("▶ 비밀번호를 입력하세요");
		tmp_memPassword = sc.next();

		tmp.setMemberInfo(tmp_memName, tmp_memId, tmp_memPassword);
		Tennis.add(tmp);
		
		System.out.println("▶ 등록 완료되었습니다");
		System.out.println("현재 가입회원 "+Tennis.size()+" 명\n");
	}
	
	// 2. 로그인 메뉴
	static void loginMember() {
		String tmp_memId;
		String tmp_memPass;
		
		System.out.println("[ 로그인 ]");
		System.out.println("▶ 아이디");
		tmp_memId = sc.next();
		System.out.println("▶ 비밀번호");
		tmp_memPass = sc.next();
		
		for(int i=0; i<Tennis.size(); i++) {
			if(Tennis.get(i).getMemberId().equals(tmp_memId)) {
				if(Tennis.get(i).getMemberId().equals(tmp_memPass)) {
				System.out.println("로그인 되었습니다");
				break;
				}
			}
			if(i == (Tennis.size()-1)) {
				System.out.println("일치하는 회원이 없습니다");
				System.out.println("다시 확인해주세요\n");
				break;
			} 
		} 
	}
	
	
	// 3. 회원정보 출력(모든 회원의 정보)
	static void printMembers() {
		System.out.println("[ 회원정보 출력 ]");
		System.out.println("▶ 현재 가입회원 " + Tennis.size() + " 명\n");

		for(int i=0; i<Tennis.size(); i++) {
			Tennis.get(i).putMemberInfo();
			System.out.println();
		}
	}
	
	
	// 4. 회원탈퇴
	static void deleteMember() {
		String tmp_memName;
		String tmp_memId;
		String tmp_memPass;
		Member tmp = new Member();
		
		System.out.println("[ 회원탈퇴 ]");
		System.out.println("정보 확인을 위해 이름과 아이디를 입력해주세요");
		System.out.println("▶ 이름");
		tmp_memName = sc.next();
		System.out.println("▶ 아이디");
		tmp_memId = sc.next();
		
		int count = 0;
		boolean result = false;

		for(int i=0; i<Tennis.size(); i++) {
			if(Tennis.get(i).getMemberName().equals(tmp_memName)) {
				if(Tennis.get(i).getMemberId().equals(tmp_memId)) {
				count = i;
				result = true;
				break;
				}
			}
			if(i == (Tennis.size()-1)) {
				System.out.println("일치하는 회원이 없습니다");
				System.out.println("다시 확인해주세요\n");
				break;
			} 
		} 
		
		if(result == true) {
			System.out.println("회원정보가 확인되었습니다");
			System.out.println("이름 : " + Tennis.get(count).getMemberName());
			System.out.println("아이디 : " + Tennis.get(count).getMemberId()+"\n");
			System.out.println("최종 확인을 위해 비밀번호를 입력해주세요");
			String tmp_yn = null;
			tmp_yn = sc.next();
			if(tmp_yn.equals(Tennis.get(count).getMemberPassword())) {
				Tennis.remove(count);
				
				System.out.println("탈퇴 완료되었습니다");
				System.out.println("그동안 이용해주셔서 감사합니다");
				System.out.println("현재 가입회원 " + Tennis.size() + " 명\n");
			} else {
				System.out.println("일치하지 않습니다");
				System.out.println("다시 확인해주세요\n");
			}
		} 
	}
	
	
	// 5.프로그램 종료
		static void exitProgram() {
			System.out.println("프로그램이 종료되었습니다.");
			return;
		}
	
		
//==========================================================================================
	// 메인	
	public static void main(String[] args) {
		// 샘플 입력
		memberSample();
		// 메인 플레이
		MemberPlay();
	}

}
