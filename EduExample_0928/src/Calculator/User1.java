package Calculator;

public class User1 extends Thread {
	private Calculator claculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("user1");
		this.claculator = calculator;
	}
	
	public void run() {
		claculator.setMemory(50);
	}
}
