
public class nitroColdBrew extends Coffee {
	boolean Takeout;
	int count;
	
	protected Boolean getNitroColdBrewTakeout() {
		return Takeout;
	}
	
	protected int getNitroColdBrewCount() {
		return count;
	}
	
	void setNitroColdBrew(boolean t, int c) {
		Takeout = t;
		count = c;
	}
	
	void putNitroColdBrew() {
		System.out.println("테이크아웃 ["+Takeout+"] 수량 ["+count+"]");
	}
}
