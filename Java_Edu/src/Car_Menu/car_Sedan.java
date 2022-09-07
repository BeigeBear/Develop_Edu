package Car_Menu;

public class car_Sedan extends car {
//	데이터 영역
	private int carSedanNum = 7022;
	private String carSedanModel = "the New Pride";
	private int carSedanMaxSpeed = 150;
	
//	기능 영역
	// Num Getter
	protected int get_carSedanNum() {
		return carSedanNum;
	}
	// Model Getter
	protected String get_carSedanModel() {
		return carSedanModel;
	}
	// Speed Getter
	protected int get_carSedanMaxSpeed() {
		return carSedanMaxSpeed;
	}
	// Num Setter
	protected void set_carSedanNum(int num) {
		this.carSedanNum = num;
	}
	// Model Setter
	protected void set_carSedanModel(String model) {
		this.carSedanModel = model;
	}
	// Speed Setter
	protected void set_carSedanMaxSpeed(int speed) {
		if(speed < 0) {
			this.carSedanMaxSpeed = 0;
			return;
		} else {
			this.carSedanMaxSpeed = speed;
		}
	}
	// 전체 정보 조회
	protected void carSedanInfo() {
		System.out.println("────────────────────────────────────────────────────");
		System.out.println(" 차량번호 : " + carSedanNum);
		System.out.println(" 모델명 : " + carSedanModel);
		System.out.println(" 최고속도 : " + carSedanMaxSpeed + "km/h");
		System.out.println("────────────────────────────────────────────────────");
	}
}
