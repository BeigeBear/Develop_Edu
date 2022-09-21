package Cafeteria;

public class Main {

	public static void main(String[] args) {
		Student1 student1 = new Student1("밥", "불고기", "바나나");
		student1.printPrice();
		
		Student2 student2 = new Student2("밥", "불고기", "우유", "아몬드");
		student2.printPrice();
	}
}
