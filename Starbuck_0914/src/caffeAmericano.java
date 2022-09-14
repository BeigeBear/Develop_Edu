

public class caffeAmericano extends Coffee {
	boolean Takeout;
	int count;
	
	protected Boolean getCaffeAmericanoTakeout() {
		return Takeout;
	}
	
	protected int getCaffeAmericanoCount() {
		return count;
	}
	
	void setCaffeAmericano(boolean t, int c) {
		Takeout = t;
		count = c;
	}
	
	void putCaffeAmericano() {
		System.out.println("테이크아웃 ["+Takeout+"] 수량 ["+count+"]");
	}
}
