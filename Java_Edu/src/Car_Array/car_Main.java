package Car_Array;

import java.util.Scanner;

//	Car클래스 타입의 객체를 저장할 배열을 만든다.
//	위에서 만든 2개의 객체를 그 곳에 저장한다.
//	for을 사용해서 2대의 자동차의 모든 정보를 출력한다(단, 겟터를 사용해야함).

public class car_Main {
	public static void main(String[] args) {
		car cameo1 = new car();
		car cameo2 = new car();
		
//		배열 작성
		car[] arr1 = new car[2];
		arr1[0]=cameo1;
		arr1[1]=cameo2;
		
//		System.out.println("1번 차량의 번호를 입력하세요.");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		cameo1.setCarNum(num);
//
//		System.out.println("1번 차량의 모델명를 입력하세요.");
//		String model = sc.nextLine();
//		cameo1.setCarModel(model);
//		
//		System.out.println("1번 차량의 최고 속도를 입력하세요.");
//		int speed = sc.nextInt();
//		cameo1.setCarmaxSpeed(speed);
//		
		Scanner sc = new Scanner(System.in);
		int modelNum = 0;
		String modelName = null;
		int maxSpeed = 0;
		
		for(int i=0; i<=1; i++) {
			System.out.println();
			modelNum = sc.nextInt();
			sc.nextLine(); // 엔터 버퍼 초기화
			modelName = sc.nextLine();
			maxSpeed = sc.nextInt();
			
			arr1[i].setCar(modelNum, modelName, maxSpeed);
		}
		for(int i=0; i<=1; i++) {
			arr1[i].put_Car();
		}
		
		
		
		

//		
//		셋터
//		
//		cameo1.setCarModel("Tesla Model X");
//		cameo1.setCarmaxSpeed(230);
//		cameo2.setCarNum(595);
//		cameo2.setCarModel("Porshe Tycan");
//		cameo2.setCarmaxSpeed(228);
//		
//		출력(겟터 사용)
//		for(int i=0; i<=1; i++) // 배열 2개
//		{ 
//			System.out.println("[ "+arr1[i].getCarNum()+" ]");
//			System.out.println("[ "+arr1[i].getCarModel()+" ]");
//			System.out.println("[ "+arr1[i].getCarmaxSpeed()+" ]\n");
//		}
		
		
		
		
//		지금 배열에 저장된 객체는 정보가 없다.
//		사람이 직접 입력한 값울 받아서 2개의 객체를 채워주도록 한다.
//		for문의 사용하는 것은 같고, 출력은 for가 끝난 다음 별도로 하도록 한다.
//		출력할때는 겟터나 풋터 사용 괜찮.
		
		
		
//		while(true)
//		{
//		// 메뉴출력
//		System.out.println("1. 자동차정보입력");
//		// 메뉴번호입력
//		menu = sc.nextInt();
//		// 메뉴번호와 일치하는 특정기능 실행
//		switch(menu)
//		{
//		case 1: {
//			// 작업내역
//		} break;
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}