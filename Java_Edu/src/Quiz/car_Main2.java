package Quiz;

// 차량 선택
// 메뉴 차등

import java.util.Scanner;

import Car.car_SportsCar2;

public class car_Main2 {

	public static void main(String[] args) {
		
		// 상속 클래스 객체 선정
		car2 f1 = new car2();
		car_SportsCar2 f2 = new car_SportsCar2();
		car_Truck2 f3 = new car_Truck2();
		
		f1.getCarModel();{
			return Model;
		}
			
		
		// 입력 스캐너
		Scanner key = new Scanner(System.in);
		
		// 차량 선택 메뉴 입력.
		System.out.println("차량 선택");
		
	
		String car = key.nextLine(); // 입력
		f1.pickCar(car);


	}
}