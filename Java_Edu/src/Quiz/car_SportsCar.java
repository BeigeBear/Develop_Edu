package Quiz;

public class car_SportsCar extends car {
	private float extraFuel = 39.4f;
	
	
	void setExtraFuel(float extraFuel) {
		if(extraFuel < 0) { // 0이하로 입력
			System.out.println("최소한 10이상의 연료가 필요합니다.");
			System.out.println("현재 남은 연료는 "+this.extraFuel+"L 입니다.");
			return;
		} else if (100-this.extraFuel < extraFuel) { // 연료탱크량 초과
			System.out.println("최대연료량을 초과했습니다");
			System.out.println("현재 남은 연료는 "+this.extraFuel+"L 입니다.");
			return;
		} else { // 그 외 적당.
			this.extraFuel = this.extraFuel + extraFuel;
			System.out.println("현재 남은 연료는 "+this.extraFuel+"L 입니다.");
		}	
	}	
		
	
	void useSpeedBooster() {
		if(this.extraFuel < 10) {
			System.out.println("연료가 부족합니다.");
			return;
		} else {
		this.extraFuel = this.extraFuel-10;
		System.out.println("부스터 사용, 현재 남은 연료는 "+this.extraFuel+"L 입니다.");
		}
	}	
}
