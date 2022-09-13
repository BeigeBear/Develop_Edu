package menuTest;

import java.util.ArrayList;
import java.util.Scanner;

public class mainPlay {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	//
//	// 자동차 등록 메뉴를 선택하면 이것이 실행됨(reg_car)
//	
//	static void regCar() {
//		System.out.println("자동차 등록 메뉴");
//		mainPlay tmp = new mainPlay();	//	자동차만들기
//		
//		System.out.println();
//	}
//	
//	static void printCar() {
//		System.out.println("자동차 정보 출력");
//	}
//	
//	
//	static void exitCar() {
//		System.out.println("프로그램이 종료되었습니다");
//	}
//
//	
	
	
	
	
	
	
	
	
	
//	
//	
//	
//	static void menuPlay() {
//		while(true) {	
//			System.out.println("[ 자동차 관리 메뉴 ]");
//			System.out.println("1.정보 입력");
//			System.out.println("2.모든자동차정보출력");
//			System.out.println("3.프로그램종료");
//			int menu;
//			Scanner se = new Scanner(System.in);
//			menu = se.nextInt( );
//			
//			switch( menu ) {
//				case 1: {
//					regCar();
//				} break;
//				
//				case 2: {
//					printCar();
//				} break;
//				
//				case 3: {
//					exitCar();
//				} break;
//				
//				default: {
//					System.out.println("다시 입력해주세요.");
//				}
//			}
//		}
//		
//	}
//	
//============================================================================================
	
	// 테스트 메뉴
	//1.자동차 등록
	//2.자동차 정보출력
	//3.프로그램 종료
	//
	//입력받는 부분은 스캐너
	//메뉴번호입력시 자동차등록, 자동차정보출력 프로그램종료
	
	
	
	
	
	
	
//	◆◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇	
//	다형성 ◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◆◇◆◇◆◇◆◇◆◇◆◇◆◇◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆
	
	public static void main(String[] args) {
		
//		menuPlay();
		
		ArrayList<Tire> tires = new ArrayList<Tire>();
		
		k5_Tire k5 = new k5_Tire();
		k7_Tire k7 = new k7_Tire();
		
		k5.setTireInfo(240, "한국타이어");
		k7.setTireInfo(255, "넥센타이어");
		
//		k5.putK5Tire();
//		k7.putK7Tire();
		
		// 컨테이너에 접근해서 2개의 타이어를 셋팅하고, 정보를 출력한다.
		// 컨테이너레 저장된 타이어를 꺼낸 다음 setTireInfo는 실행할 수 있다
		// 하지만, putTireInfo는 실행할 수 없다(Tire 클래스에 없는 메소드).
		
		tires.add(k5);		
		tires.add(k7);
		tires.get(0);
		tires.get(1);
		
		
		// tires컨테이너에 들어있는 객체를 가지고(.get) 왔을 때 그게 정확히 어떤 건지(타입)모른다.
		// 지금 접근하는 방식은 Tire클래스가 가진 메소드만 사용할 수 있다.
//		tires.get(0).putK5Tire();
		
		
		if(tires.get(0) instanceof k5_Tire) {
			System.out.println("K5 타입이다");
			// K5타이어라면 그 타입에 맞게끔 래퍼런스를 연결해주자.
			// Tires 컨테이너에서 꺼내온 것은 무조건 Tire타입니다(컨테이너를만들때 사용한 타입).
			k5_Tire k5_t = (k5_Tire)tires.get(0);
			k5_t.putK5Tire();
		}
		
		if(tires.get(1) instanceof k7_Tire) {
			System.out.println("K7 타입이다");
		}
	}
}






















