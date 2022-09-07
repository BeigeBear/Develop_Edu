package Car_Menu;

import java.util.Scanner;

//	데이터 영역
public class car2 {
	
	private boolean run = true;
	private boolean run2 = true;



	protected void chooseCar() {
		while(run) {
			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
			System.out.println("                 당신의 차량을 선택하세요                 ");
			System.out.println("      1.세단 | 2.스포츠카 | 3.SUV | 4.트럭 | 0.종료      "); 
			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
			System.out.print(" 입력 : ");
			Scanner menu = new Scanner(System.in);
			int num = menu.nextInt();
			if(num == 0) {
				System.exit(0);
			} else {
				run  = false;
			}
		}
	}

	protected void chooseCar2() {
		while(run2) {
			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
			System.out.println("                당신의 드림카를 선택하세요                ");
			System.out.println("      1.세단 | 2.스포츠카 | 3.SUV | 4.트럭 | 0.종료      "); 
			System.out.print(" 입력 : ");
			Scanner menu = new Scanner(System.in);
			int num = menu.nextInt();
			if(num == 0) {
				System.exit(0);
			} else {
				run2  = false;
			}
		}
	}	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	private int Num; // 필드값은 접근 제한.
	private String model;
	private int maxSpeed;

	
	
//	기능 영역
	// Num Getter
	protected int getCarNum() {
		return Num;
	}
	// Num Setter
	protected void setCarNum(int Num) {
		this.Num = Num;
	}
	
	
	// Model Getter
	protected String getCarModel() {
		return model;
	}
	// Model Setter
	protected void setCarModel(String model) {
		this.model = model;
	}
	
	
	// Speed Getter
	protected int getCarmaxSpeed() {
		return maxSpeed;
	}
	// Speed Setter
	protected void setCarmaxSpeed(int speed) {
		if(speed < 0) {
			this.maxSpeed = 0;
			return;
		} else {
			this.maxSpeed = speed;
		}
	}
	
	protected void setCar(int Num, String Model, int Speed) {
		this.Num = Num;
		this.model = Model;
		if(Speed < 0) {
			this.maxSpeed = 0;
			return;
		} else {
			this.maxSpeed = Speed;
		}
	}
	
	
	
//	출력 영역
	protected void put_Car() {
		System.out.println("이 차의 번호는 "+Num);
		System.out.println("이 차의 모델명은 "+model);
		System.out.println("이 차의 최고 속력은 "+maxSpeed+"km/h");
	}
}









