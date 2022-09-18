import java.util.Scanner;

public class SmartPhone {

	Scanner sc = new Scanner(System.in);
	
	// 객체 10개 생성
	Contact[] contact = new Contact[10];
	
	// 최초 연락처 저장
	protected void inputContactData() {
		System.out.println("───────────────────────────────────");
		System.out.println(" 최초 실행시 연락처 2개를 먼저 입력합니다");
		for(int i=0; i<2; i++) {
			Contact input = new Contact(null, null, null, null, null, null);
			addContact(input); // 완성 후 추가
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
	protected void addContact(Contact addcontact) {
		// 빈 공간 찾기
		int nullnum = 0;
		for(int i=0; i<contact.length; i++) {
			if(contact[i] == null) {
				nullnum = i;
				break;
			}
		}
		// 값 입력
		System.out.println("───────────────────────────────────");
		System.out.print(" 이름 : ");
		addcontact.setName(sc.nextLine());
		System.out.print(" 전화번호 : ");
		addcontact.setPhoneNumber(sc.nextLine());
		System.out.print(" 이메일 : ");
		addcontact.setEmail(sc.nextLine());
		System.out.print(" 주소 : ");
		addcontact.setAddress(sc.nextLine());
		System.out.print(" 생일 : ");
		addcontact.setBirthday(sc.nextLine());
		System.out.print(" 그룹 : ");
		addcontact.setGroup(sc.nextLine());
		// 대입 저장
		contact[nullnum] = addcontact;
		System.out.println(" ▶ 연락처가 "+(nullnum+1)+"번으로 저장되었습니다.");
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
	
	void printAllContact() {
		SmartPhone smartphone = new SmartPhone();
		System.out.println("[ 모든 연락처 정보 ]");
		for(int i=0; i<contact.length; i++) {
			System.out.println("───────────────────────────────────");
			System.out.println("[ "+(i+1)+"번 연락처 정보 ]");
			smartphone.printContact(contact[i]);
		}
		System.out.println("───────────────────────────────────");
	}
	
	void searchContact(String name) {
		SmartPhone smartphone = new SmartPhone();
		for(int i=0; i<contact.length; i++) {
			if(contact[i].getName().equals(name)) {
				System.out.println("입력하신 이름과 일치하는 연락처 정보입니다");
				System.out.println("───────────────────────────────────");
				smartphone.printContact(contact[i]);
				System.out.println("───────────────────────────────────");
			}
		}
	}
	
	void deleteContact(String name) {
		for(int i=0; i<contact.length; i++) {
			if(contact[i].getName().equals(name)) {
				contact[i].setName(null);
				contact[i].setPhoneNumber(null);
				contact[i].setEmail(null);
				contact[i].setAddress(null);
				contact[i].setBirthday(null);
				contact[i].setGroup(null);
			}
		}
	}
	
	void editContact(String name, Contact newContact) {
		int editNum;
		for(editNum=0; editNum<contact.length; editNum++) {
			if(contact[editNum].getName().equals(name)) {
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
