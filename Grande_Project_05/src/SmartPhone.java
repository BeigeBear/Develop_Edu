import java.util.Scanner;

public class SmartPhone {
	
	Contact[] contacts;
	int countOfContact = 0;
	Scanner in;
	
	// 생성자
	public SmartPhone() {
		contacts = new Contact[10];
		in = new Scanner(System.in);
	}
	
	// 데이터 입력 확인
	public String inputDataCheck(String type) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print(type+" :");
			String data = in.nextLine();
			if(data.isEmpty()) {
				System.out.println("오류ㅣ다시 입력해주세요");
				continue;
			} else {
				System.out.println("성공ㅣ입력되었습니다.");
				return data;
				}
			}
		}
	
	public String overlapPhoneNumber(String number) {
		Scanner in = new Scanner(System.in);
		String newNumber = null;
		for(int i=0; i<countOfContact;i++) {
			Contact contact = contacts[i];
			if(contact.getPhoneNumber().equals(number)) {
				System.out.println("오류ㅣ중복 전화번호입니다. 다시 입력해주세요");
				newNumber = in.nextLine();
				return newNumber;
			}
		}
		return number;
	}
		
	// 최초 입력
	public Contact inputContactData() {
		Contact contact = null;
		
		String name = inputDataCheck("이름");
		String phoneNumber = overlapPhoneNumber(inputDataCheck("전화번호"));
		String email = inputDataCheck("이메일");
		String address = inputDataCheck("주소");
		String birthday = inputDataCheck("생일");
		String group = inputDataCheck("회사");
			
		if(group.equals("회사")) {
			String companyname = inputDataCheck("회사이름");
			String companydepartment = inputDataCheck("부서");
			String companylevel = inputDataCheck("직급");
			return new CompanyContact(name, phoneNumber, email, address, birthday, group,
					companyname, companydepartment, companylevel);
			
		} else if(group.equals("거래처")) {
			System.out.print("거래처이름 : ");
			String customername = inputDataCheck("거래처이름");
			String customeritem = inputDataCheck("거래품목");
			String customerlevel = inputDataCheck("직급");
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
				return;
			}
			System.out.println("삭제되었습니다.");
			
		}
		System.out.println("검색 결과가 없습니다.");
	}
	
	// 연락처 수정
	public void editContact(String name, Contact newContact) {
		for(int i=0; i<countOfContact; i++) {
			if(contacts[i].getName().contentEquals(name)) {
				contacts[i]=newContact;
				return;
			}
		}
		System.out.println("검색결과가 없습니다.");
	}
	
	// 공백 확인
//	public void checkDataEmpty(String text) {
//		if(text.isEmpty()) {
//			System.out.println("오류ㅣ다시 입력해주세요");
//			break;
//		}
//		
//	}
//	
//	public void checkOverlap(String text) {
//		for(int i=0; i<countOfContact;i++) {
//			Contact contact = contacts[i];
//		}
//	}
//		
//		if(contact.getPhoneNumber().contentEquals(phoneNumber)) {
//			System.out.println("오류ㅣ중복 전화번호입니다. 다시 입력해주세요");
//			break;
//		}
	
	
	
	
}
























