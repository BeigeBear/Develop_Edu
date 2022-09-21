
public class caramelMacchiato extends Coffee {
	boolean Takeout;
	int count;
	
	protected Boolean getCaramelMacchiatoTakeout() {
		return Takeout;
	}
	
	protected int getCaramelMacchiatoCount() {
		return count;
	}
	
	void setCaramelMacchiato(boolean t, int c) {
		Takeout = t;
		count = c;
	}
	
	void putCaramelMacchiato() {
		System.out.println("테이크아웃 ["+Takeout+"] 수량 ["+count+"]");
	}
}
