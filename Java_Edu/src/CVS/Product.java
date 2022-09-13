package CVS;

public class Product {
//	데이터 영역
	private String p_Name;
	private int p_Price;
	private int p_Num;
	
//	기능 영역
	// p_Name Getter
	protected String getProductName() {
		return p_Name;
	}
	// p_Name Setter
	protected void setProductName(String Name) {
		this.p_Name = Name;
	}
	
	
	// Price Getter
	protected int getProductPrice() {
		return p_Price;
	}
	// Price Setter
	protected void setProductPrice(int price) {
		this.p_Price = price;
	}
	
	
	// Num Getter
	protected int getProductNum() {
		return p_Num;
	}
	// Num 
	protected void setProductNum(int num) {
		this.p_Num = num;
	}
	
	// 통합 Setter
	protected void setProduct(String name, int price, int num) {
		this.p_Name = name;
		this.p_Price = price;
		this.p_Num = num;
	}

//	출력 영역
	protected void putProduct() {
		System.out.println("제품 명 : "+p_Name);
		System.out.println("제품 가격 : "+p_Price+"원");
		System.out.println("제품 일련번호 : "+p_Num);
	}


}
