package CVS;

public class Product_DE extends Product {
	private int p_Weight;
	private float p_Sale;
	
	
	protected int getProductWeight() {
		return p_Weight;
	}
	
	protected void setProductWeight(int weight) {
		this.p_Weight = weight;
	}

	protected float getProductSale() {
		return p_Sale;
	}
	
	protected void setProductSale(int sale) {
		this.p_Sale = sale;
	}

	protected void setProduct(String name, int price, int num, int weight, float sale) {
		super.setProduct(name, price, num);
		this.p_Weight = weight;
		this.p_Sale = sale;
	}
	
	protected void putProduct() {
		super.putProduct();
		System.out.println("제품 무게 : "+p_Weight+" g");
		System.out.println("제품 할인율 : "+p_Sale+" %");
	}

	
}
