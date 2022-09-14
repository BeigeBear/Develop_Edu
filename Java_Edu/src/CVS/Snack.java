package CVS;

public class Snack extends Product {
	private int p_Kcal;
	
	protected int getSnackKcal() {
		return p_Kcal;
	}
	
	protected void setSnackKcal(int kcal) {
		this.p_Kcal = kcal;
	}
	
	protected void setSnack(String name, int price, int num, int kcal) {
		super.setProduct(name, price, num);
		this.p_Kcal = kcal;
	}
	
	protected void putSnack() {
		super.putProduct();
		System.out.println("칼로리 : "+p_Kcal+" kcal");
	}	
	
}