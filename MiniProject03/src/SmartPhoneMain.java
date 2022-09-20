import java.util.Scanner;

public class SmartPhoneMain {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SmartPhone smartphone = new SmartPhone();
		
		System.out.println("데이터 2개를 입력합니다.");
		for(int i=0; i<2; i++) {
			smartphone.addContact(smartphone.inputContactData());
		}
		
		while(true) {
			printMenu();
			String choiceMenu = scanner.nextLine();
			
			if(choiceMenu.equals("1")) {
				smartphone.addContact(smartphone.inputContactData());
			
			} else if(choiceMenu.equals("2")) {
				// 메소드 구현				
				
			} else if(choiceMenu.equals("3")) {
				smartphone.printAllContact();
				
			} else if(choiceMenu.equals("4")) {
				System.out.println("검색하고자 하는 이름을 입력하세요");
				smartphone.searchContact(scanner.nextLine());
				
			} else if(choiceMenu.equals("5")) {
				System.out.println("삭제하고자 하는 이름을 입력하세요");
				smartphone.deleteContact(scanner.nextLine());
				
			} else if(choiceMenu.equals("6")) {
				System.out.println("수정하고자 하는 이름을 입력하세요");
				String name = scanner.nextLine();
				System.out.println("데이터를 새로 입력해주세요");
				smartphone.editContact(name, smartphone.inputContactData());
				
			} else if(choiceMenu.equals("7")) {
				System.out.println("프로그램을 종료합니다.");
				return;
				
			} else {
				System.out.println("잘못된 메뉴입니다. 다시 선택해주세요.");
			}
		}
	}

	public static void printMenu() {
		System.out.println("Contact ==============================");
		System.out.println(">> 1.연락처 등록(회사)");
		System.out.println(">> 2.연락처 등록(거래처)");
		System.out.println(">> 3.모든 연락처 출력");
		System.out.println(">> 4.연락처 검색");
		System.out.println(">> 5.연락처 삭제");
		System.out.println(">> 6.연락처 수정");
		System.out.println(">> 7.프로그램 종료");
		System.out.println("======================================");
	}
}
