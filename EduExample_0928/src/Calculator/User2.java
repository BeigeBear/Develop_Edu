package Calculator;

public class User2 extends Thread {
	private Calculator claculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("user2");
		this.claculator = calculator;
	}
	
	public void run() {
		claculator.setMemory(100);
	}
}
