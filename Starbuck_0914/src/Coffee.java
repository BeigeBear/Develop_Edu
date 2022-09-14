import java.util.ArrayList;
import java.util.Scanner;

public class Coffee {
	
	static ArrayList<Coffee> Starbuck = new ArrayList<Coffee>();
	
	static Scanner SB = new Scanner(System.in);

	
	String S_coffeeBean;
	int S_Caffeine;
	int S_Sugar;
	Boolean S_IceHot; // True가 아이스
	String S_Size;
	
	protected String getCoffeeBean() {
		return S_coffeeBean;
	}
	protected int getCaffeine() {
		return S_Caffeine;
	}
	protected int getSugar() {
		return S_Sugar;
	}
	protected Boolean getIceHot() {
		return S_IceHot;
	}
	protected String getSize() {
		return S_Size;
	}
	

	protected void setCoffeeBean(String coffeebean) {
		this.S_coffeeBean = coffeebean;
	}
	protected void setCaffeine(int caffeine) {
		this.S_Caffeine = caffeine;
	}
	protected void setSugar(int sugar) {
		this.S_Sugar = sugar;
	}
	protected void setIceHot(Boolean icehot) {
		this.S_IceHot = icehot;
	}
	protected void setSize(String size) {
		this.S_Size = size;
	}
	
	// 통합 Setter
	protected void setCoffee(String bean, int caffeine, int sugar, boolean icehot, String size) {
		this.S_coffeeBean = bean;
		this.S_Caffeine = caffeine;
		this.S_Sugar = sugar;
		this.S_IceHot = icehot;
		this.S_Size = size;
	}
	
	protected static void choiceSize() {
		System.out.println("               사이즈 선택");
		System.out.println("┌──────────┐ ┌──────────┐ ┌──────────┐");
		System.out.println("│ 1 Tall   │ │ 2 Grande │ │ 3 Venti  │");
		System.out.println("└──────────┘ └──────────┘ └──────────┘");
		int tmp_choicesize = SB.nextInt();
		if
	}
	
	
	
	
	
	
	
	
//	출력 영역
//	protected void putProduct() {
//		System.out.println("상품명 : "+p_Name);
//		System.out.println("가격 : "+p_Price+"원");
//		System.out.println("일련번호 : "+p_Num);
//	}
	
	
	
	
}