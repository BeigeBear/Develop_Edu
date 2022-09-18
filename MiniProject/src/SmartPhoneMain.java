import java.util.Scanner;

public class SmartPhoneMain {
	
	Scanner sc = new Scanner(System.in);

	protected void printMenu() {
		
		Contact contact = new Contact(null, null, null, null, null, null);
		Contact newContact = new Contact(null, null, null, null, null, null);
		SmartPhone smartphone = new SmartPhone();
		
		smartphone.inputContactData();
		
		while(true) {
			System.out.println("Contact ===========================");
			System.out.println("1.연락처 등록");
			System.out.println("2.모든 연락처 출력");
			System.out.println("3.연락처 검색");
			System.out.println("4.연락처 삭제");
			System.out.println("5.연락처 수정");
			System.out.println("6.프로그램 종료");
			System.out.println("===================================");
			
			int tmp = sc.nextInt();
			switch (tmp) {
				case 1:{
					smartphone.addContact(contact);
				} break;
				case 2:{
					smartphone.printAllContact();
				} break;
				case 3:{
					System.out.println("검색할 연락처의 이름을 입력하세요");
					sc.next();
					smartphone.searchContact(sc.nextLine());
				} break;
				case 4:{
					System.out.println("삭제할 연락처의 이름을 입력하세요");
					String name = sc.nextLine();
					smartphone.deleteContact(name);
				} break;
				case 5:{
					System.out.println("수정할 연락처의 이름을 입력하세요");
					String name = sc.nextLine();
					smartphone.editContact(name, newContact);
				} break;
				case 6:{
					smartphone.exitProgram();
				} return;
				default:{
					System.out.println("잘못 입력되었습니다");
				} 
			}
		}
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
//		
//		SmartPhoneMain arr = new SmartPhoneMain();
//		
//		arr.printMenu();
//		

	}

}
