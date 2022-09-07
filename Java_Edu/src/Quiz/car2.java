package Quiz;

import java.util.Scanner;

//	데이터 영역
public class car2 {
	private int Num; // 필드값은 접근 제한.
	private String model;
	private int maxSpeed;

//	차량 선택
	protected void pickCar(String car) {
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		System.out.println(" 차량정보조회");
		if(car.equals("세단")) {	
			System.out.print(" 번호 변경 | 모델 변경");
			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
			
		}
	}
	
	
	
	
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
	
	
	
//	출력 영역
	protected void put_Car() {
		System.out.println("이 차의 번호는 "+Num);
		System.out.println("이 차의 모델명은 "+model);
		System.out.println("이 차의 최고 속력은 "+maxSpeed+"km/h");
	}
}