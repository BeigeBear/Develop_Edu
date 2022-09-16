import java.util.Scanner;

public class SmartPhoneMain {
	
	Scanner sc = new Scanner(System.in);
	
	SmartPhone arr = new SmartPhone();
	
	protected void printMenu() {
		arr.inputContactData();
		
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
					arr.addContact();
				} break;
				case 2:{
					arr.printAllContact();
				} break;
				case 3:{
					arr.searchContact();
				} break;
				case 4:{
					arr.deleteContact();
				} break;
				case 5:{
					arr.editContact();
				} break;
				case 6:{
					arr.exitProgram();
				} return;
				default:{
					System.out.println("잘못 입력되었습니다");
				} 
			}
		}
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		SmartPhoneMain arr = new SmartPhoneMain();
		
		arr.printMenu();
		

	}

}
