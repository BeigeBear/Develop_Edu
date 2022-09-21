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
	
	// 최초 입력
	public Contact inputContactData() {
		System.out.print("이름 : ");
		String name = in.nextLine();
		System.out.print("전화번호 : ");
		String phoneNumber = in.nextLine();
		System.out.print("이메일 : ");
		String email = in.nextLine();
		System.out.print("주소 : ");
		String address = in.nextLine();
		System.out.print("생일 : ");
		String birthday = in.nextLine();
		System.out.print("그룹 : ");
		String group = in.nextLine();
		if(group.equals("회사")) {
			System.out.print("회사이름 : ");
			String companyname = in.nextLine();
			System.out.print("부서 : ");
			String companydepartment = in.nextLine();
			System.out.print("직급 : ");
			String companylevel = in.nextLine();
			return new CompanyContact(name, phoneNumber, email, address, birthday, group,
					companyname, companydepartment, companylevel);
		} else if(group.equals("거래처")) {
			System.out.print("거래처이름 : ");
			String customername = in.nextLine();
			System.out.print("거래품목 : ");
			String customeritem = in.nextLine();
			System.out.print("직급 : ");
			String customerlevel = in.nextLine();
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
		System.out.println("이름 : "+contact.getName());
		System.out.println("전화번호 : "+contact.getPhoneNumber());
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
}
























