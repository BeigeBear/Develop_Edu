package Quiz;

public class Calc_Main {

	public static void main(String[] args) {
		
		Calc_Plus c1 = new Calc_Plus();
		Calc_Minus c2 = new Calc_Minus();
		Calc_Multi c3 = new Calc_Multi();
		Calc_Divide c4 = new Calc_Divide();
		
		c1.setNumbers(10, 7);
		c1.putResult();
		
		c2.setNumbers(50, 27);
		c2.putResult();
		
		c3.setNumbers(27, 16);
		c3.putResult();
		
		c4.setNumbers(501, 12);
		c4.putResult();

	}
}