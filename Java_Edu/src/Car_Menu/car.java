package Car_Menu;

public class car {
//	데이터 영역
	private int carNum = 7022;
	private String carModel = "the New Pride";
	private int carMaxSpeed = 150;
	

	
	

//	기능 영역
	// Num Getter
	protected int get_carNum() {
		return carNum;
	}
	// Model Getter
	protected String get_carModel() {
		return carModel;
	}
	// Speed Getter
	protected int get_carMaxSpeed() {
		return carMaxSpeed;
	}
	// Num Setter
	protected void set_carNum(int num) {
		this.carNum = num;
	}
	// Model Setter
	protected void set_carModel(String model) {
		this.carModel = model;
	}
	// Speed Setter
	protected void set_carMaxSpeed(int speed) {
		if(speed < 0) {
			this.carMaxSpeed = 0;
			return;
		} else {
			this.carMaxSpeed = speed;
		}
	}
	// 전체 정보 조회
	protected void carInfo() {
		System.out.println("────────────────────────────────────────────────────");
		System.out.println(" 차량번호 : " + carNum);
		System.out.println(" 모델명 : " + carModel);
		System.out.println(" 최고속도 : " + carMaxSpeed + "km/h");
		System.out.println("────────────────────────────────────────────────────");
	}
}
