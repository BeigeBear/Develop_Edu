import java.util.HashMap;
import java.util.Scanner;

public class SmartPhone {
	
	HashMap<String, Contact> contactmap;
	Scanner sc;
	
	// 생성자
	public SmartPhone() {
		contactmap = new HashMap<String, Contact>();
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
//	public String duplicateCheckPhoneNum(String inputData) {
//		sc = new Scanner(System.in);
//
//		for(int i=0; i<contactmap.size(); i++) {
//			while(contactmap.get(key)get(i).getPhoneNumber().equals(inputData)) {
//				System.out.println("> 중복 입력 오류ㅣ 다른 전화번호를 입력해주세요");
//				System.out.print("전화번호 : ");
//				String newData = sc.nextLine();
//				// 앞뒤공백제거, 공백문자열 확인.
//				if(newData.equals(inputData)) {
//					continue;
//				} else {
//					System.out.println("> 전화번호이(가) 정상 입력되었습니다.");
//					return newData;
//				}
//			}
//		}
//		System.out.println("> 전화번호이(가) 정상 입력되었습니다.");
//		return inputData;
//	}

	
	// 연락처 입력
	public Contact inputContactData(String choicegroup) {
		String name = emptyCheckData("이름");
//		String phoneNumber = duplicateCheckPhoneNum(emptyCheckData("전화번호"));
		String phoneNumber = emptyCheckData("전화번호");
		String email = emptyCheckData("이메일");
		String address = emptyCheckData("주소");
		String birthday = emptyCheckData("생일");
		String group = emptyCheckData("그룹");
		if(choicegroup.equals("1")) {
			String companyname = emptyCheckData("회사이름");
			String companydepartment = emptyCheckData("부서");
			String companylevel = emptyCheckData("직급");
			return new CompanyContact(name, phoneNumber, email, address, birthday, group,
					companyname, companydepartment, companylevel);
		} else if(group.equals("2")) {
			String customername = emptyCheckData("거래처이름");
			String customeritem = emptyCheckData("거래품목");
			String customerlevel = emptyCheckData("직급");
			return new CustomerContact(name, phoneNumber, email, address, birthday, group,
					customername, customeritem, customerlevel);
		}
		return new Contact(name, phoneNumber, email, address, birthday, group);
	}
		
	
	// 입력받은 연락처 리스트 추가
	public void addContact(Contact contact) {
		if(contact instanceof CompanyContact) {
			contactmap.put(
					contact.getPhoneNumber(), (CompanyContact)contact);
		}
		else if(contact instanceof CustomerContact) {
			contactmap.put(contact.getPhoneNumber(), (CustomerContact)contact);
		}
		else {
			contactmap.put(contact.getPhoneNumber(), contact);
		}
		System.out.println(">>> 연락처가 저장되었습니다.("+contactmap.size()+")\n");
	}
	
	
	// 출력
	public void printContact(Contact contact) {
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
		System.out.println("======================================");
		for(int i=0;i<contactmap.size(); i++) {
			System.out.println("< "+(i+1)+"번 연락처 >");
			printContact(contactmap.get(01i));
			System.out.println("======================================");
		}
		System.out.println();
	}
	
	
	// 연락처 검색
	public void searchContact(String name) {
		for(int i=0; i<contactlist.size();i++) {
			if(contactlist.get(i).getName().contentEquals(name)) {
				printContact(contactlist.get(i));
				return;
			}
		}
	}
	
	
	// 연락처 삭제
	public void deleteContact(String name) {
		for(int i=0; i<contactlist.size(); i++) {
			if(contactlist.get(i).getName().contentEquals(name)) {
				System.out.println(">>> 삭제되었습니다.");
				System.out.println(">>> 남은 연락처는 " + contactlist.size() + "개 입니다.");
				return;
			}
		}
		System.out.println("검색 결과가 없습니다.");
	}
	
	
	// 연락처 수정
	public void editContact(String name, Contact newContact) {
		for(int i=0; i<contactlist.size(); i++) {
			Contact contact = contactlist.get(i);
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
