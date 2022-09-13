package CarArrayList;

//	데이터 영역
public class car {
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
		System.out.println("번호 : "+Num);
		System.out.println("모델명 : "+model);
		System.out.println("최고 속력 : "+maxSpeed+"km/h\n");
	}
}