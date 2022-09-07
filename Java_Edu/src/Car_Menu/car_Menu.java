package Car_Menu;

import java.util.Scanner;

public class car_Menu {
	
	private boolean run = true;
	

	
	
	
	car cameo1 = new car();
	car_Sports cameo2 = new car_Sports();
	car_SUV cameo3 = new car_SUV();
	car_Truck cameo4 = new car_Truck();
	
	car[] cameo = new car[3];
	cameo[0] = cameo1;
	cameo[1] = cameo2;
	cameo[2] = cameo3;
	cameo[3] = cameo4;
	

	protected void carProcess() {
		while(run) {
			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
			System.out.println("                 당신의 차량을 선택하세요                 ");
			System.out.println("      1.세단 | 2.스포츠카 | 3.SUV | 4.트럭 | 0.종료      "); 
			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
			System.out.print(" 입력 : ");
			Scanner menu = new Scanner(System.in);
			int num = menu.nextInt();
			if(num == 1) {
				cameo1.carInfo();
				return;
			} else {
				cameo2.carInfo();
				
			}
		}
	}
}
