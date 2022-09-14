package CVS;

public class Ramen extends Product {
	private float p_Salt;	

	protected float getRamenSalt() {
		return p_Salt;
	}
	
	protected void setRamenSalt(float salt) {
		this.p_Salt = salt;
	}

	protected void setRamen(String name, int price, int num, float salt) {
		super.setProduct(name, price, num);
		this.p_Salt = salt;
	}
	
	protected void putRamen() {
		super.putProduct();
		System.out.println("나트륨함유량 : "+p_Salt+" mg");
	}

}
