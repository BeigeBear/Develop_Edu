import java.util.Scanner;

public class SmartPhone {

	Scanner sc = new Scanner(System.in);
	
	// 객체 10개 생성
	Contact[] contact = new Contact[10];
	
	// 샘플 연락처
	void Sample() {
		Contact contact0 = new Contact("임재영", "01053257845", "cameogu@gmail.com", "경기 성남시", "08/14", "가족");
		contact[0] = contact0;
		Contact contact1 = new Contact("박서준", "01015471455", "sck06041@gmail.com", "서울 마포구", "07/01", "가족");
		contact[1] = contact1;
		Contact contact2 = new Contact("최우식", "01045741102", "woosick59@naver.com", "서울 송파구", "02/24", "친구");
		contact[2] = contact2;
		Contact contact3 = new Contact("최수빈", "01015471455", "universum@naver.com", "부산 진구", "11/21", "가족");
		contact[3] = contact3;
		Contact contact4 = new Contact("임영", "01053257845", "cameogu@gmail.com", "경기 성남시", "08/14", "가족");
		contact[4] = contact4;
		Contact contact5 = new Contact("박준", "01015471455", "sck06041@gmail.com", "서울 마포구", "07/01", "가족");
		contact[5] = contact5;
		Contact contact6 = new Contact("최식", "01045741102", "woosick59@naver.com", "서울 송파구", "02/24", "친구");
		contact[6] = contact6;
		Contact contact7 = new Contact("최빈", "01015471455", "universum@naver.com", "부산 진구", "11/21", "가족");
		contact[7] = contact7;
		Contact contact8 = new Contact("식", "01045741102", "woosick59@naver.com", "서울 송파구", "02/24", "친구");
		contact[8] = contact8;
		Contact contact9 = new Contact("빈", "01015471455", "universum@naver.com", "부산 진구", "11/21", "가족");
		contact[9] = contact9;
	}	
	
	// 빈공간 찾기
	int findNullContact() {
		int i;
		for(i=0; i<contact.length; i++) {
			if(contact[i] == null) {
				break;
			}
		} return i;
	}
	
	
	// 최초 연락처 저장
	void inputContactData() {
		System.out.println("───────────────────────────────────");
		System.out.println("최초 실행시 연락처 2개를 먼저 입력합니다");
		for(int i=0; i<2; i++) {
			Contact inputcontact = new Contact(null, null, null, null, null, null);
			addContact(inputcontact);
		}
		for(int i=0; i<10; i++) {
			if(i%2 == 0) {
				contact[i] = contact[0];
			}
			if(i%2 == 1) {
				contact[i] = contact[1];
			}
		}
	}
	
	
	// 연락처 추가
	void addContact(Contact contact) {
		int nullNum = findNullContact();
		// 값 입력
		System.out.println("───────────────────────────────────");
		System.out.print(" 이름 : ");
		contact.setName(sc.nextLine());
		System.out.print(" 전화번호 : ");
		contact.setPhoneNumber(sc.nextLine());
		System.out.print(" 이메일 : ");
		contact.setEmail(sc.nextLine());
		System.out.print(" 주소 : ");
		contact.setAddress(sc.nextLine());
		System.out.print(" 생일 : ");
		contact.setBirthday(sc.nextLine());
		System.out.print(" 그룹 : ");
		contact.setGroup(sc.nextLine());
		// 대입 저장
		this.contact[nullNum] = contact;
		System.out.println(" ▶ 연락처가 "+(nullNum+1)+"번으로 저장되었습니다.");
		System.out.println("───────────────────────────────────");
	}
	
	// 연락처 정보 출력
	void printContact(Contact contact) {
		System.out.println("이름 : "+contact.getName());
		System.out.println("전화번호 : "+contact.getPhoneNumber());
		System.out.println("이메일 : "+contact.getEmail());
		System.out.println("주소 : "+contact.getAddress());
		System.out.println("생일  : "+contact.getBirthday());
		System.out.println("그룹  : "+contact.getGroup());
	}
	
	// 모든 > 연락처 정보 출력
	void printAllContact() {
		SmartPhone smartphone = new SmartPhone();
		System.out.println("[ 모든 연락처 정보 ]");
		System.out.println("───────────────────────────────────");
		for(int i=0; i<contact.length; i++) {
			if(!(contact[i] == null)) {
			System.out.println("[ "+(i+1)+"번 연락처 정보 ]");
			smartphone.printContact(contact[i]);
			}
		}
		System.out.println("───────────────────────────────────");
	}
	
	// 연락처 검색, 이름으로
	void searchContact(String name) {
//		int nullNum = findNullContact();
		SmartPhone smartphone = new SmartPhone();
		for(int i=0; i<contact.length; i++) {
			if(contact[i].getName().equals(name)) {
				System.out.println("입력하신 이름과 일치하는 연락처 정보입니다");
				System.out.println("───────────────────────────────────");
				smartphone.printContact(contact[i]);
				System.out.println("───────────────────────────────────\n");
			}
		}
	}

	// 연락처 삭제
	void deleteContact(String name) {
		int nullNum = findNullContact();
		for(int i=0; i<nullNum; i++) {
			if(contact[i].getName().equals(name)) {
				contact[i] = null;
			}
		}
	}
	
	void editContact(String name, Contact newContact) {
		int editNum;
		for(editNum=0; editNum<contact.length; editNum++) {
			ifcontact[editNum].getName().equals(name)) {
				newContact = contact[editNum];
			}
		}
		System.out.println("───────────────────────────────────");
		System.out.println("수정할 항목의 번호를 선택하세요");
		System.out.println("───────────────────────────────────");
		System.out.println("1.이름\n2.전화번호\n3.이메일\n4.주소\n5.생일\n6.그룹");
		System.out.println("───────────────────────────────────\n 선택 : ");
		String select= sc.next();
		switch(select) {
			case "1":{
				System.out.println("수정할 이름을 입력하세요");
				newContact.setName(sc.nextLine());
				System.out.println("수정 완료하였습니다");
			} break;
			case "2":{
				System.out.println("수정할 전화번호를 입력하세요");
				newContact.setPhoneNumber(sc.nextLine());
				System.out.println("수정 완료하였습니다");
			} break;
			case "3":{
				System.out.println("수정할 이메일을 입력하세요");
				newContact.setEmail(sc.nextLine());
				System.out.println("수정 완료하였습니다");
			} break;
			case "4":{
				System.out.println("수정할 주소를 입력하세요");
				newContact.setAddress(sc.nextLine());
				System.out.println("수정 완료하였습니다");
			} break;
			case "5":{
				System.out.println("수정할 생일을 입력하세요");
				newContact.setBirthday(sc.nextLine());
				System.out.println("수정 완료하였습니다");
			} break;
			case "6":{
				System.out.println("수정할 그룹명을 입력하세요");
				newContact.setGroup(sc.nextLine());
				System.out.println("수정 완료하였습니다");
			} break;
			default: {
				System.out.println("잘못 입력했습니다, 다시 시도해주세요.");
			} break;
		}
		contact[editNum] = newContact;
	}
	
	void exitProgram() {
		System.out.println("프로그램이 종료되었습니다.");
		return;
	}

}
