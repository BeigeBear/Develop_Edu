package Car_Menu;

import java.util.Scanner;

//	Car클래스 타입의 객체를 저장할 배열을 만든다.
//	위에서 만든 2개의 객체를 그 곳에 저장한다.
//	for을 사용해서 2대의 자동차의 모든 정보를 출력한다(단, 겟터를 사용해야함).

public class car_Main {
	public static void main(String[] args) {
		
//		메뉴 구현방법
//
//		(1) 기본적으로 무한루프(while)로 작동하도록 되어있다.
//		     반복문 안에서 처리하는 것 들은 메뉴출력, 메뉴 번호입력 등이 있다.
//
//		(2) 메뉴 출력은 반복할때마다 작동되도록 한다.(printin)
//
//		(3) 메뉴 번호를 1회 반복할떄 마다  입력받도록 한다.
//
//		(4) 메뉴 번호에 해당되는 기능을 실행하도록 되어있은.
//
//		(5) 기능은 작업종류에 따라서 객수와 메소드 이름이 달라질 수 있음.,
		
//		기능을 활성화 한 이후에 명령을 지연하는 명령어를 넣어도 좋을 듯.
//		엔터를 한 번더 쳐야 초기화 해주는 것
		
		Scanner mu1 = new Scanner(System.in);
		
		while(true) {
		// 메뉴출력
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		System.out.println(" 1.정보 입력 | 2.정보 조회 | 3. 프로그램 종료");
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		
		// 메뉴번호입력
		int start_Menu = mu1.nextInt();
		
		// 메뉴번호와 일치하는 특정기능 실행
		switch(start_Menu) {
			case 1: {
				of
				cameo
			// 엔터키를 입력하기 전까지 잠시 화면이 멈추는 역할이 필요함(명령어 검색)
		}
			// 작업내역
		} break;
		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
		

//		1. 세단 | 2. 스포츠카 | 3. SUV | 4. 트럭		

//		2. 정보 표출
//		세단 	/ 차량번호 | 모델명 | 최고속도
//		스포츠카  / + 연료탱크
//		SUV     / + 적재용량
//		트럭     / + 구동방식
//		
//		3. 수정 | 종료
//		
//		3-1. 수정 선택
//		세단 	/ 차량번호 | 모델명 | 최고속도
//		스포츠카  / + 연료탱크
//		SUV     / + 적재용량
//		트럭     / + 구동방식
		
//		4. 선택한 항목을 수정 후 확인
//		수정된 정보 출력 후
//		종료.
		
		
		
		
		
		
		
		
		
		
		
		
	}
}