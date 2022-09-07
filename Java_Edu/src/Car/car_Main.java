package Car;

import Quiz.car_SportsCar;

public class car_Main {

	public static void main(String[] args) {
		car cameo1 = new car();
		car_SportsCar cameo2 = new car_SportsCar();
		car_Truck cameo3 = new car_Truck();
		
		cameo1.getCarNum();
		cameo1.getCarModel();
		cameo1.getCarmaxSpeed();

		cameo1.setCarNum(5959);
		cameo1.setCarModel("KIA EV9");
		cameo1.setCarmaxSpeed(240);

//		cameo1.put_Car();
		
//		cameo2.setExtraFuel(0);
//		cameo2.setExtraFuel(36.24f);
//		
//		cameo2.useSpeedBooster();
//		cameo2.useSpeedBooster();
//		cameo2.useSpeedBooster();
//		cameo2.useSpeedBooster();
//		
//		cameo2.setExtraFuel(50.5f);
//		
//		cameo2.useSpeedBooster();
//		cameo2.useSpeedBooster();
//		
//		cameo2.setExtraFuel(30.25f);
//		cameo2.useSpeedBooster();
//		cameo2.useSpeedBooster();
//		cameo2.useSpeedBooster();
//		cameo2.useSpeedBooster();
		
		cameo3.bucketIn(500.25f);
		cameo3.bucketIn(250.74f);
		
		cameo3.bucketOut(550f);
		cameo3.bucketOut(100f);
		
		cameo3.bucketFullOver();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}