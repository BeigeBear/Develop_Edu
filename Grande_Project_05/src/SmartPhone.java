import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SmartPhone implements Serializable {
	
	int countOfContact = 0;
	String folderLocation = "C:/Temp/Contact";
	String fileLocation = "C:/Temp/Contact/ContactInfo.txt";
	Scanner sc;
	Contact[] contacts;
	ArrayList<Contact> arrayList;
	
	// 생성자
	public SmartPhone() {
		contacts = new Contact[10];
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
		String phoneNumber = duplicateCheckPhoneNum(emptyCheckData("전화번호"));
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
			printContact(contacts[i]);
		}
		System.out.println("======================================\n");
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
			Contact contact = contacts[i];
			if(contact.getName().contentEquals(name)) {
				System.out.println("일치하는 연락처를 찾았습니다.");
				contact = newContact;
				System.out.println(">>> 데이터가 수정되었습니다.");
				return;
			}
		}
		System.out.println("검색결과가 없습니다.");
	}
	
	// 연락처 파일 입력
	@SuppressWarnings("unchecked")
	public void loadFile() throws Exception {
		FileInputStream fis = new FileInputStream(fileLocation);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		arrayList = (ArrayList<Contact>) ois.readObject();
		
		for(int i=0; i<arrayList.size(); i++) {
			Contact contact = arrayList.get(i);
			if(contact instanceof CompanyContact) {
				contacts[i] = (CompanyContact)contact;
			} else if(contact instanceof CustomerContact) {
				contacts[i] = (CustomerContact)contact;
			} else {
				contacts[i] = contact;
			}
			System.out.println(i+"번 연락처가 시스템에 입력되었습니다.");
		}
		System.out.println(">>> "+arrayList.size()+"개의 연락처가 시스템에 입력되었습니다.");
		ois.close();
		bis.close();
		fis.close();
	}
	
	// 연락처 파일 출력
	public void saveFile() throws Exception {
		// 폴더 및 파일 생성
		File contactdir = new File(folderLocation);
		File file = new File(fileLocation);
		// 생성 전 확인
		if(contactdir.exists() == false) { contactdir.mkdirs(); }
		if(file.exists() == false) { file.createNewFile(); };
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		arrayList = new ArrayList<Contact>();
		
		for(int i=0; i<countOfContact; i++) {
			Contact contact = contacts[i];
			if(contact instanceof CompanyContact) {
				arrayList.add((CompanyContact)contact);
			} else if(contact instanceof CustomerContact) {
				arrayList.add((CustomerContact)contact);
			} else 
				arrayList.add(contact);
			System.out.println(i+"번 연락처가 파일에 저장되었습니다.");
		}
		oos.writeObject(arrayList);
		System.out.println(">>> "+arrayList.size()+"개의 연락처가 파일에 저장되었습니다.");

		oos.close();
		bos.close();
		fos.close();
	}

	
	
	
	
	
	
}
	
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
//		for(int i=0; i<countOfContact; i++) {
//			Contact contact = contacts[i];
//			
//			FileWriter fw = new FileWriter(file);
			
//			fw.write(contact.getName());
//			fw.write(contact.getPhoneNumber());
//			fw.write(contact.getName());
//			fw.write(contact.getName());
			
//			Contact data = null;
//			
//			
//			for(Contact datainfo : data) {
//				System.out.println(datainfo.getName());
//			}
//		
//			
//			fw.write(contact.getName());
//		
//			fw.flush();
//			fw.close();
//		}
		
		

		
































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
