package CarArrayListMethodPolymo;

import java.util.ArrayList;

import java.util.Scanner;

public class carArrayListMethodPolymo_Play {
		
	// 스캐너 생성
	static Scanner sc = new Scanner(System.in);
	
	// 리스트 생성(자동차클래스로 만든객체들이 저장될곳)
	static ArrayList<car> cars = new ArrayList<car>();
	
	// 메인 메뉴 메소드
	static void menuPlay() {
		while(true) {	
			System.out.println("1.자동차정보 저장+입력");
			System.out.println("2.모든자동차정보출력");
			System.out.println("3.프로그램종료");
			System.out.println("4.자동차검색");
			int menu;
			menu = sc.nextInt( );	// 메뉴번호입력
		  
			switch( menu ) {	// 메뉴번호와 일치하는 특정기능실행 
				case 1: {
					regCar();
				} break;
				
				case 2:{	//자동차정보출력
					printCar();
				} break;
				
				case 3:{
					exitProgram();
					return;
				}
				
				case 4:{
					searchCar();
				} break;
				
				default: {
					System.out.println("존재하지않는 메뉴입니다");
				}
			}
		}
	}

	// 등록 메소드
	static void regCar() {
		System.out.println("자동차 등록");
		car_SportsCar tmp = new car_SportsCar();	//	자동차만들기
		//정보입력+셋터
		int tmp_carModelNo;
		String tmp_carModelName;
		int tmp_carMaxSpeed;
		
		tmp_carModelNo = sc.nextInt( );
		tmp_carModelName = sc.next( );
		tmp_carMaxSpeed = sc.nextInt( );
		
		tmp.setCar(tmp_carModelNo, tmp_carModelName, tmp_carMaxSpeed);	//셋터

		//기존의 배열을 사용하던곳에서는 방이비어있는지(null) 확인한후 그곳에 저장하는방식
		//리스트방식은 .add() 로 저장해주면됨. 
		cars.add(tmp);	//저장

		//자동차의 갯수도 .size()를 사용해서 알아내면됨
		System.out.println(cars.size()+"대의 자동차가 저장되어있음");	//저장된 자동차의갯수
	}
	
	// 출력 메소드
	static void printCar() {
		System.out.println("모든 자동차 정보");
		for(int i=0; i<cars.size(); i++) {
			if(cars.get(0) instanceof car) {
				car print = (car)cars.get(i);
				print.put_Car();
			}
		}
//		
//		
//		CAR PORSHE = NEW CAR();
//		CAR CONA = NEW CAR();
//		
//		PORSHE.SETCAR(585, "PORSHE", 320);
//		CONA.SETCAR(125, "CONA", 320);
//		
//		CARS.ADD(PORSHE); // 컨테이너에 집어넣음.
//		CARS.ADD(CONA);		
//		CARS.GET(0); // GET으로 얻었을때 어떤 타임이 들어가있는지 알 수 없다.
//		CARS.GET(1);
//		
//		
//		IF(CARS.GET(0) INSTANCEOF CAR) {
//			CAR K5 = (CAR)CARS.GET(0);
//			K5.PUT_CAR();
//		}
		
		
		
		
		
		
		
		// 컨테이너에서 스포츠카를 꺼내서 스포츠카만 가지고 이쑈는 특수기능을 사용해본다.
	}
	
	// 프로그램 종료
	static void exitProgram() {
		// 실제프로젝트에서는 이곳에서 할일이 많음.
		// 데이터베이스를  종료시킨다던가, 사용하던 메모리를 청소해줘야함.
		System.out.println("프로그램이 종료되었습니다.");
	}
	
	// 검색 메소드
	static void searchCar() {
		System.out.println("[ 자동차 정보 검색 ]");
		System.out.println("[ 1.차량 번호 ]\n [ 2.모델명 ]\n [ 3.최고 속도 ]");
		int searchCategory = sc.nextInt();

		switch(searchCategory) {
			// 차량 번호 검색
			case 1: {
				System.out.println("검색할 차량 번호를 입력하세요.");
				int tmp4_num = sc.nextInt();
	
				for(int i=0; i<=cars.size(); i++) {
					if(cars.get(i).getCarNum() == tmp4_num) {
						System.out.println( "일치하는 결과를 찾았습니다.");
						System.out.println(cars.get(i).getCarModel());
						System.out.println(cars.get(i).getCarNum());
						System.out.println(cars.get(i).getCarmaxSpeed());
						break;
					}
					if(!(cars.get(i).getCarNum() == tmp4_num)) {
						System.out.println("일치하지 않습니다.");
						break;
					}
				}
			} break;
			
			// 모델명 검색
			case 2: {
				System.out.println("검색할 모델명을 입력하세요.");
				sc.nextLine(); // 엔터 버퍼 초기화
				String tmp4_name = sc.nextLine();
				
				for(int i=0; i<=cars.size(); i++) {
					if(cars.get(i).getCarModel().equals(tmp4_name)) {
						System.out.println( "일치하는 결과를 찾았습니다.");
						System.out.println(cars.get(i).getCarModel());
						System.out.println(cars.get(i).getCarNum());
						System.out.println(cars.get(i).getCarmaxSpeed());
						break;
					}
					if(!cars.get(i).getCarModel().equals(tmp4_name)) {
						System.out.println("일치하지 않습니다.");
						break;
					}
				}
			} break;
			
			// 차량 번호 검색
			case 3: {
				System.out.println("검색할 최대 속도를 입력하세요.");
				int tmp4_speed = sc.nextInt();
				
				for(int i=0; i<=cars.size(); i++) {
					if(cars.get(i).getCarmaxSpeed() == tmp4_speed) {
						if(cars.get(i).getCarmaxSpeed() >= tmp4_speed) {
							System.out.println(cars.get(i).getCarmaxSpeed());
						}
					}
					if(!(cars.get(i).getCarmaxSpeed() == tmp4_speed)) {
						System.out.println("일치하지 않습니다.");
						break;
					}
				}
			} break;
		}
	}


	public static void main(String[] args) {
		menuPlay();
	}
}
























