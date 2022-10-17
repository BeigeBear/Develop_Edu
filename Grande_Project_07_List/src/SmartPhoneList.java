import java.util.ArrayList;
import java.util.Scanner;

public class SmartPhoneList {
	
	ArrayList<Contact> contacts;
	int countOfContact = 0;
	Scanner sc;
	
	// 생성자
	public SmartPhoneList() {
		contacts = new ArrayList<Contact>();
		sc = new Scanner(System.in);
	}
	
	// 메소드 - 데이터  공백 확인
	public String emptyCheckData(String dataType) {
		sc = new Scanner(System.in);
		
		while(true) {
			// 데이터 타입 입력
			System.out.print(dataType+" : ");
			String inputData = sc.nextLine();
			
			// 앞뒤공백제거 > 공백문자열 확인.
			if(inputData.trim().isEmpty()) {
				System.out.println("> 입력 오류ㅣ다시 입력해주세요");
				continue; // 계속 입력
			} else if(dataType.equals("전화번호")) {
				return inputData;
			} else {
				System.out.println("> "+dataType+"이(가) 정상 입력되었습니다.");
				return inputData;
			}
		}
	}
	
	
	// 메소드 - 데이터 중복 및 공백 확인
	public String duplicateCheckPhoneNum(String inputData) {
		sc = new Scanner(System.in);
		
		for(int i=0; i<countOfContact; i++) {
			while(contacts.get(i).getPhoneNumber().contentEquals(inputData)) {
				System.out.println("> 중복 입력 오류ㅣ 다른 전화번호를 입력해주세요");
				System.out.print("전화번호 : ");
				String newData = sc.nextLine();
				// 앞뒤공백제거, 공백문자열 확인.
				if(newData.equals(inputData)) {
					continue;
				} else {
					System.out.println("> 전화번호이(가) 정상 입력되었습니다.");
					return newData;
				}
			}
		}
		System.out.println("> 전화번호이(가) 정상 입력되었습니다.");
		return inputData;
	}

	
	// 최초 입력
	public Contact inputContactData(int type) {
		
		Contact contact = null;
		
		String name = emptyCheckData("이름");
		String phoneNumber = duplicateCheckPhoneNum(emptyCheckData("전화번호"));
		String email = emptyCheckData("이메일");
		String address = emptyCheckData("주소");
		String birthday = emptyCheckData("생일");
		String group = emptyCheckData("회사");
		if(type == 1) {
			String companyname = emptyCheckData("회사이름");
			String companydepartment = emptyCheckData("부서");
			String companylevel = emptyCheckData("직급");
			return contact = new CompanyContact(name, phoneNumber, email, address, birthday, group,
					companyname, companydepartment, companylevel);
		} else if(type == 2) {
			System.out.print("거래처이름 : ");
			String customername = emptyCheckData("거래처이름");
			String customeritem = emptyCheckData("거래품목");
			String customerlevel = emptyCheckData("직급");
			return contact = new CustomerContact(name, phoneNumber, email, address, birthday, group,
					customername, customeritem, customerlevel);
		}
		return contact;
		}
		
	
	// 배열에 연락처 객체 저장
	public void addContact(Contact contact) {
		if(contact instanceof CompanyContact) {
			contacts.add((CompanyContact)contact);
		}
		else if(contact instanceof CustomerContact) {
			contacts.add((CustomerContact)contact);
		}
		contacts.add(contact);
		countOfContact++;
		System.out.println(">>> 데이터가 저장되었습니다.("+countOfContact+")");
	}
	
	
	// 출력
	public void printContact(Contact contact) {
		System.out.println("======================================");
		contact.showData();
		System.out.println("이메일 : "+contact.getEmail());
		System.out.println("주소 : "+contact.getAddress());
		System.out.println("생일 : "+contact.getBirthday());
		System.out.println("그룹 : "+contact.getGroup());
		if(contact instanceof CompanyContact) {
			CompanyContact print = (CompanyContact)contact;
			System.out.println("회사이름 : "+ print.getCompanyName());
			System.out.println("부서이름 : "+ print.getCompanyDepartment());
			System.out.println("직급 : "+ print.getCompanyLevel());
		} 
		else if(contact instanceof CustomerContact) {
			CustomerContact print = (CustomerContact)contact;
			System.out.println("거래처이름 : "+ print.getCustomerName());
			System.out.println("거래품목 : "+ print.getCustomerItem());
			System.out.println("직급 : "+ print.getCustomerLevel());
		}
	}
	
	
	// 모든 연락처 출력
	public void printAllContact() {
		for(int i=0;i<countOfContact; i++) {
			System.out.println(i+"번 연락처");
			printContact(contacts.get(i));
		}
		System.out.println("======================================\n");
	}
	
	
	// 연락처 검색
	public void searchContact(String name) {
		for(int i=0; i<countOfContact;i++) {
			Contact contact = contacts.get(i);
			if(contact.getName().contentEquals(name)) {
				printContact(contact);
				return;
			}
		}
	}
	
	
	// 연락처 삭제
	public void deleteContact(String name) {
		for(int i=0; i<countOfContact; i++) {
			Contact contact = contacts.get(i);
			if(contact.getName().contentEquals(name)) {
				countOfContact--;
				System.out.println(">>> 삭제되었습니다.");
				return;
			}
		}
		System.out.println("검색 결과가 없습니다.");
	}
	
	
	// 연락처 수정
	public void editContact(String name, Contact newContact) {
		for(int i=0; i<countOfContact; i++) {
			Contact contact = contacts.get(i);
			if(contact.getName().contentEquals(name)) {
				System.out.println("일치하는 연락처를 찾았습니다.");
				contact = newContact;
				System.out.println(">>> 데이터가 수정되었습니다.");
				return;
			}
		}
		System.out.println("검색결과가 없습니다.");
	}
}
