package Car;

public class car_SportsCar2 extends car {
	private int sportsNum = 5959;
	private String sportsModel = "Audi GT";
	private int sportsMaxSpeed = 300;
	private float extraFuel = 0;
	
	
	protected void setExtraFuel(float extraFuel) {
		if(extraFuel < 0) {	   // 0이하로 입력
			System.out.println("최소한 10이상의 연료가 필요합니다.");
			System.out.println("현재 남은 연료는 "+this.extraFuel+"L 입니다.\n");
			return;
		} else if (100-this.extraFuel < extraFuel) {	// 연료탱크량 초과
			System.out.println("최대연료량을 초과했습니다");
			System.out.println("현재 남은 연료는 "+this.extraFuel+"L 입니다.\n");
			return;
		} else {   // 그 외 적당.
			this.extraFuel = this.extraFuel + extraFuel;
			System.out.println("현재 남은 연료는 "+this.extraFuel+"L 입니다.\n");
		}	
	}	
		
	
	protected void useSpeedBooster() { // 부스터 사용
		if(this.extraFuel < 10) { // 연료 잔량이 10L 이하, 사용 불가.
			System.out.println("연료가 부족합니다. \n연료를 충전해주세요.\n");
			return;
		} else { // 연료 충분, 부스터 사용, 연료 10L 소모.
		this.extraFuel = this.extraFuel-10;
		System.out.println("부스터 사용, 현재 남은 연료는 "+this.extraFuel+"L 입니다.\n");
		}
	}	
}


/*	후손클래스(SportCar) - Car클래스를 물려받은 클래스. 스포츠카의 특성에 최적화되어있다.
 *  - 데이터 : 스포츠카의 특징인 부스토를 사용하기 때문에., 별도의 보조연료탱크(extra_Fuel)가 필요함, 데이터 타입은 float.
 *  - 기능 : 자신만의 보조연료탱크를 저장하기 위한 셋터가 필요함(set_Extra_Fuel).
 *  		채우고 싶은 연료량을 전달받아서, extra_Fuel에 저장해준다.
 *  		제한조건이 있는데, 보조연료탱크는 최대 100까지만 저장가능하다.
 *  		연료를 전달받아서 저장할 떄, 중요한 것은 현재 남은 연료에 누적되어야한다는 것이다.
 *  		남은 연료에 누적시켰을시 최대용량을 초과한다면  "최대연료량을 초과했습니다."라는 메세지 출력 후 메소드가 종료됨.
 *  
 *			만약, 최대용량을 넘어서는 연료를 전달받으면 "최대연료량을 초과했습니다."라는 메세지를 출력해준 후, 메소드가 종료됨.
 *			"0"이하의 연료를 전달받으면, "최소한 10이상의 연료가 필요합니다"라는 메세지를 출력해준 후, 메소드가 종료됨.
 *			 *힌트 : 메소드 안에서 "return"명령어를 사용하면 그 즉시 메소드가 종료된다.
 *			마지막으로, 어떤 경우던 현재 남은 연료량을 화면에 출력해야한다는 것이다.
 *
 *  - 기능 : 스포츠카만이 가진 특징인 부스터를 사용할 수 있다(use_Speed_Booster).
 *  		이 기능을 사용하면, extre_Fuel에 저장된 연료량이 10만큼 줄어든다.
 *  		만약, 연료가 부족한 상태(10미만)에서 이 기능을 사용하게 되면, "연료가 부족합니다"메세지를 출력한 후에 메소드가 종료됨.
 *			사용할때마다 현재 남은 연료량을 화면에 출력해줘야함.
*/
