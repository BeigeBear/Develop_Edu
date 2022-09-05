package Quiz;

public class animal_Main {

	public static void main(String[] args) {
		
		animal_Birds b = new animal_Birds();
		animal_Fishes f = new animal_Fishes();
		animal_Mammal m = new animal_Mammal();
		
		b.move();
		f.move();
		m.move(); //override
		
//		b.flying();
//		f.swimming();
//		m.walking();
	}
}