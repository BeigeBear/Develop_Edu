package Cafeteria;

public class Student1 extends LunchMenu {
	
	public Student1(String rice, String bulgogi,
			String banana) {
		super(rice, bulgogi);
		this.banana = banana;
	}
	
	protected void printPrice() {
		int total = 0;
		if(this.rice.equalsIgnoreCase("밥")) {
			total += Price.rice;
		}
		if(this.bulgogi.equalsIgnoreCase("불고기")) {
			total += Price.bulgogi;
		}
		if(this.banana.equalsIgnoreCase("바나나")) {
			total += Price.banana;
		}
		
		System.out.println("Student1 님\n점심 식비는 "+ total +"원 입니다.\n");
	}
}
