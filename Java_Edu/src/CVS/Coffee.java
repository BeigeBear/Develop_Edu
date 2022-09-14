package CVS;

public class Coffee extends Product {
	private int p_Caffeine;	
	
	protected int getCoffeeCaffeine() {
		return p_Caffeine;
	}
	
	protected void setCoffeeCaffeine(int caffeine) {
		this.p_Caffeine = caffeine;
	}

	protected void setCoffee(String name, int price, int num, int caffeine) {
		super.setProduct(name, price, num);
		this.p_Caffeine = caffeine;
	}
	
	protected void putCoffee() {
		super.putProduct();
		System.out.println("카페인함유량 : "+p_Caffeine+" mg");
	}

	
}
