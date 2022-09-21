package Cafeteria;

public class Student2 extends LunchMenu {
	
	public Student2(String rice, String bulgogi,
			String milk, String almond) {
		super(rice, bulgogi);
		this.milk = milk;
		this.almond = almond;
	}
		
	protected void printPrice() {
		int total = 0;
		if(this.rice.equals("밥")) {
			total += Price.rice;
		}
		if(this.bulgogi.equals("불고기")) {
			total += Price.bulgogi;
		}
		if(this.milk.equals("우유")) {
			total += Price.banana;
		}
		if(this.almond.equals("아몬드")) {
			total += Price.almond;
		}
		System.out.println("Student2 님\n점심 식비는 "+ total +"원 입니다.\n");
	}
}