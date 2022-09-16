import java.util.Scanner;

public class SmartPhone {

	Scanner sc = new Scanner(System.in);
	
	Contact[] arr = new Contact[10];
	
	// 객체 생성
	protected void inputContactData() {
		System.out.println("───────────────────────────────────");
		System.out.println(" 메뉴 접근 전 2개의 연락처를 먼저 입력합니다");
		for(int i=0; i<2; i++) {
			addContact();
		}
		for(int i=0; i<10; i++) {
			if(i%2 == 0) {
				arr[i] = arr[0];
			}
			if(i%2 == 1) {
				arr[i] = arr[1];
			}
		}
	}
	
	
	protected void addContact() {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == null) {
				count = i;
				break;
			}
		}
		System.out.println("───────────────────────────────────");
		System.out.print(" 이름 : ");
		String name = sc.next();
		System.out.print(" 전화번호 : ");
		String phoneNumber = sc.next();
		System.out.print(" 이메일 : ");
		String email = sc.next();
		System.out.print(" 주소 : ");
		String address = sc.next();
		System.out.print(" 생일 : ");
		String birthday = sc.next();
		System.out.print(" 그룹 : ");
		String group = sc.next();
		arr[count] = new Contact(name, phoneNumber, email, address, birthday, group);
		System.out.println("───────────────────────────────────");
		System.out.println(" 연락처 정보가 "+(count+1)+"번으로 저장되었습니다.");
	}
	
	
	void printContact() {
		System.out.println("출력할 연락처의 번호를 입력하세요");
		int num = sc.nextInt()-1;
		System.out.println("───────────────────────────────────");
		System.out.println("[ "+(num+1)+"번 연락처 정보 ]");
		System.out.println(" 이름 : " + arr[num].getName());
		System.out.println(" 전화번호 : " + arr[num].getPhoneNumber());
		System.out.println(" 이메일 : " + arr[num].getEmail());
		System.out.println(" 주소 : " + arr[num].getAddress());
		System.out.println(" 생일 : " + arr[num].getBirthday());
		System.out.println(" 그룹 : " + arr[num].getGroup());
		System.out.println("───────────────────────────────────");
	}
	
	
	void printAllContact() {
		System.out.println("[ 모든 연락처 정보 ]");
		for(int i=0; i<arr.length; i++) {
			System.out.println("───────────────────────────────────");
			System.out.println("[ "+(i+1)+"번 연락처 정보 ]");
			arr[i].printInfo();
		}
		System.out.println("───────────────────────────────────");
	}
	
	
	void searchContact() {
		System.out.println("검색할 연락처의 이름을 입력하세요");
		String tmpName = sc.next();
		for(int i=0; i<arr.length; i++) {
			if(arr[i].getName().equals(tmpName)) {
				System.out.println("입력하신 이름과 일치하는 연락처 정보입니다");
				System.out.println("───────────────────────────────────");
				arr[i].printInfo();
				System.out.println("───────────────────────────────────");
			}
		}
	}
	
	
	void deleteContact() {
		System.out.println("삭제할 연락처의 이름을 입력하세요");
		String tmpName = sc.next();
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].getName().equals(tmpName)) {
				count = i;
			}
		}
		arr[count].setName(null);
		arr[count].setPhoneNumber(null);
		arr[count].setEmail(null);
		arr[count].setAddress(null);
		arr[count].setBirthday(null);
		arr[count].setGroup(null);
	}
	
	
	void editContact() {
		System.out.println("수정할 연락처의 이름을 입력하세요");
		String tmpName = sc.next();
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].getName().equals(tmpName)) {
				count = i;
			}
		}
		System.out.println("수정할 항목의 번호를 선택하세요");
		System.out.println("1.이름\n2.전화번호\n3.이메일\n4.주소\n5.생일\n6.그룹");
		int tmpNum = sc.nextInt();
		switch(tmpNum) {
			case 1:{
				System.out.println("수정할 이름을 입력하세요");
				String tmpName1 = sc.next();
				arr[count].setName(tmpName1);
				System.out.println("수정 완료하였습니다");
			} break;
			case 2:{
				System.out.println("수정할 전화번호를 입력하세요");
				String tmpPhone = sc.next();
				arr[count].setPhoneNumber(tmpPhone);
				System.out.println("수정 완료하였습니다");

			} break;
			case 3:{
				System.out.println("수정할 이메일을 입력하세요");
				String tmpEmail = sc.next();
				arr[count].setEmail(tmpEmail);
				System.out.println("수정 완료하였습니다");

			} break;
			case 4:{
				System.out.println("수정할 주소를 입력하세요");
				String tmpAddress = sc.next();
				arr[count].setName(tmpAddress);
				System.out.println("수정 완료하였습니다");

			} break;
			case 5:{
				System.out.println("수정할 생일을 입력하세요");
				String tmpBirth = sc.next();
				arr[count].setName(tmpBirth);
				System.out.println("수정 완료하였습니다");

			} break;
			case 6:{
				System.out.println("수정할 그룹명을 입력하세요");
				String tmpGroup = sc.next();
				arr[count].setName(tmpGroup);
				System.out.println("수정 완료하였습니다");

			} break;
			default: {
				System.out.println("번호를 잘못 입력했습니다");
			} break;
		}
	}
	
	void exitProgram() {
		System.out.println("프로그램이 종료되었습니다.");
		return;
	}

}
