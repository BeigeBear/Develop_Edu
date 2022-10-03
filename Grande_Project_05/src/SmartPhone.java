import java.util.Scanner;

public class SmartPhone {
	
	Contact[] contacts;
	int countOfContact = 0;
	Scanner sc;
	
	// 생성자
	public SmartPhone() {
		contacts = new Contact[10];
		sc = new Scanner(System.in);
	}
	
	
	
	// 메소드 - 데이터  공백 확인
	public String emptyCheckData(String dataType) {
		sc = new Scanner(System.in);
		
		while(true) {
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
	public String duplicateEmptyCheckData(String inputData) {
		sc = new Scanner(System.in);
		
		for(int i=0; i<countOfContact; i++) {
			while(contacts[i].getPhoneNumber().contentEquals(inputData)) {
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
	public Contact inputContactData() {
		String name = emptyCheckData("이름");
		String phoneNumber = duplicateEmptyCheckData(emptyCheckData("전화번호"));
		String email = emptyCheckData("이메일");
		String address = emptyCheckData("주소");
		String birthday = emptyCheckData("생일");
		String group = emptyCheckData("회사");
		if(group.equals("회사")) {
			String companyname = emptyCheckData("회사이름");
			String companydepartment = emptyCheckData("부서");
			String companylevel = emptyCheckData("직급");
			return new CompanyContact(name, phoneNumber, email, address, birthday, group,
					companyname, companydepartment, companylevel);
		} else if(group.equals("거래처")) {
			System.out.print("거래처이름 : ");
			String customername = emptyCheckData("거래처이름");
			String customeritem = emptyCheckData("거래품목");
			String customerlevel = emptyCheckData("직급");
			return new CustomerContact(name, phoneNumber, email, address, birthday, group,
					customername, customeritem, customerlevel);
		}
		return new Contact(name, phoneNumber, email, address, birthday, group);
		}
		
	
	// 배열에 연락처 객체 저장
	public void addContact(Contact contact) {
		if(contact instanceof CompanyContact) {
			contacts[countOfContact] = (CompanyContact)contact;
		}
		else if(contact instanceof CustomerContact) {
			contacts[countOfContact] = (CustomerContact)contact;
		}
		contacts[countOfContact] = contact;
		countOfContact++;
		System.out.println(">>> 데이터가 저장되었습니다.("+countOfContact+")");
	}
	
	// 출력
	public void printContact(Contact contact) {
		System.out.println("==============================================");
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
			printContact(contacts[i]);
		}
	}
	
	// 연락처 검색
	public void searchContact(String name) {
		for(int i=0; i<countOfContact;i++) {
			Contact contact = contacts[i];
			if(contact.getName().contentEquals(name)) {
				printContact(contact);
				return;
			}
		}
	}
	
	// 연락처 삭제
	public void deleteContact(String name) {
		for(int i=0; i<countOfContact; i++) {
			Contact contact = contacts[i];
			if(contact.getName().contentEquals(name)) {
				for(int j=i; j<countOfContact; j++) {
					contacts[j] = contacts[j+1];
				}
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
			if(contacts[i].getName().contentEquals(name)) {
				contacts[i]=newContact;
				System.out.println(">>> 데이터가 수정되었습니다.");
				return;
			}
		}
		System.out.println("검색결과가 없습니다.");
	}
}







	// 옛 중복 데이터 메소드
//public String overlapPhoneNumber(String number) {
//sc = new Scanner(System.in);
//String newNumber = null;
//for(int i=0; i<countOfContact;i++) {
//	Contact contact = contacts[i];
//	if(contact.getPhoneNumber().equals(number)) {
//		System.out.println("오류ㅣ중복 전화번호입니다. 다시 입력해주세요");
//		newNumber = sc.nextLine();
//		return newNumber;
//	}
//}
//return number;
//}



	// 공백 확인
//public void checkDataEmpty(String text) {
//	if(text.isEmpty()) {
//		System.out.println("오류ㅣ다시 입력해주세요");
//		break;
//	}
//	
//}
//
//public void checkOverlap(String text) {
//	for(int i=0; i<countOfContact;i++) {
//		Contact contact = contacts[i];
//	}
//}
//	
//	if(contact.getPhoneNumber().contentEquals(phoneNumber)) {
//		System.out.println("오류ㅣ중복 전화번호입니다. 다시 입력해주세요");
//		break;
//	}
















