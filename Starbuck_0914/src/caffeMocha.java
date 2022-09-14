
public class caffeMocha extends Coffee {
	boolean Takeout;
	int count;
	
	protected Boolean getCaffeMochaTakeout() {
		return Takeout;
	}
	
	protected int getCaffeMochaCount() {
		return count;
	}
	
	void setCaffeMocha(boolean t, int c) {
		Takeout = t;
		count = c;
	}
	
	void putCaffeMocha() {
		System.out.println("테이크아웃 ["+Takeout+"] 수량 ["+count+"]");
	}
}
