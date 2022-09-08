package Car_Array;

//Sportscar클래스로 만든 객체 2개
//ArrayList생성(SportsCar객체만 저장가능)
//객체 2개 저장
//2대의 자동차를 셋팅
//저장된 자동차들의 모든 정보를 출력

import java.util.ArrayList;
import java.util.Scanner;

public class car_Play2 {
	public static void main(String[] args) {
		Scanner mu = new Scanner(System.in);
		int menu;

		// 리스트 생성(자동차 클래스로 만든 객체들이 저장될 곳)
		ArrayList<car_SportsCar> cameo = new ArrayList<car_SportsCar>( );

		while(true) { // 메뉴출력
			System.out.println("1. 자동차 정보 입력");
			System.out.println("2. 자동차 정보 출력");
			System.out.println("3. 프로그램 종료");
			System.out.println("4. 자동차 정보 삭제");
			menu = mu.nextInt(); // 메뉴번호입력
					
		switch(menu) { // 메뉴번호와 일치하는 특정기능 실행
			case 1: {
				System.out.println("[ 자동차 정보 입력 ]");
				car_SportsCar tmp = new car_SportsCar(); // 자동차(객체) 만들기
				
				// 정보입력(셋터)
				int tmp_modelNum; String tmp_modelName; int tmp_maxSpeed;
				System.out.println("차량번호, 모델명, 최고속도를 입력하세요.");
				tmp_modelNum = mu.nextInt(); // 모델번호
				mu.nextLine(); // 엔터 버퍼 초기화
				tmp_modelName = mu.nextLine(); // 모델이름
				tmp_maxSpeed = mu.nextInt();   // 최대속도
				
				tmp.setCar(tmp_modelNum, tmp_modelName, tmp_maxSpeed); // 셋터
				
				// 기존의 배열을 사용하던 곳에서는 방이 비어있는지(null) 확인안 후 그 곳에 저장하는 방식
				// 리스트 방식은 .add() 로 저장해주면 됨.
				cameo.add(tmp); // 저장
				// 자차의 갯수도 .size()를 사용해서 알아내면 됨.
				System.out.println(cameo.size()+"대의 자동차가 저장되어있음"); // 저장된 자동차의 객수
			}
			break;
			
			case 2: { // 자동차 정보 출력
				System.out.println("[ 모든 자동차의 정보 ]\n");
				// 반복문을 사용해서 현재 저장된 자동차의 객수만큼 반복.
				// 반복할 때마다 1대의 자동차의 모든 정보를 출력(풋터).
				for(int i=0; i<cameo.size(); i++) {
					cameo.get(i).put_Car(); // 컨테이너 > 자동차(get) > 자동차정보출력(put)
				}
			}
			break;	

			default: {
				System.out.println("존재하지 않는 메뉴입니다.");
				}
			}	
		}
	}
}
		
		



		

		
		



































	
//ArrayList<car_> names = new ArrayList<car>( );
//
//// 자동차를 3대 만들어서 names에 저장해보기
//car v1 = new car();
//car v2 = new car();
//car v3 = new car();
//
//names.add(v1);
//names.add(v2);
//names.add(v3);
//
//// 컨테이너 > n번 방 > 자동차객체 > 메소드 사용(Method Chain)
//names.get(0).setCar(8456, "Tesla X", 250);
//names.get(1).setCar(7022, "Tesla Y", 230);
//names.get(2).setCar(5959, "Tesla S", 270);
//
//// 자동차 정보 확인
//names.get(0).put_Car();
//names.get(1).put_Car();
//names.get(2).put_Car();
//		
//		// 자동차를 3대 만들어서 names에 저장해보기
//		car_SportsCar v1 = new car_SportsCar();
//		car_SportsCar v2 = new car_SportsCar();
//		car_SportsCar v3 = new car_SportsCar();
//		
//		names.add(v1);
//		names.add(v2);
//		names.add(v3);
//		
//		// 컨테이너 > n번 방 > 자동차객체 > 메소드 사용(Method Chain)
//		names.get(0).setCar(8456, "Tesla X", 250);
//		names.get(1).setCar(7022, "Tesla Y", 230);
//		names.get(2).setCar(5959, "Tesla S", 270);
//		
//		// 자동차 정보 확인
//		names.get(0).put_Car();
//		names.get(1).put_Car();
//		names.get(2).put_Car();
//		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		
//		
//		
//		
//		Scanner mu = new Scanner(System.in);
//		
//		car[] cameo = new car[5]; // 배열 생성
//		int count = 0; // 현재까지 저장된 자동차의 갯수
////      배열 생성(자동차 클래스로 만든 객체들이 저장될 곳)
////	    자동차가 들어갈 수 있는 최대갯수는 5개
////		======================================================
////		for(int i=0; i<=4; i++){ // 배열 초기화
////			cameo[i]=null;
////		}
////		for(int i=0; i<=4; i++){ // 배열 값 출력
////			System.out.println(cameo[i]);
////		}
////		반복문을 돌려서 null의 방을 찾는 것.
////		======================================================
//
//	
//		while(true) {
//			System.out.println("1. 자동차 정보 입력");
//			System.out.println("2. 모든자동차정보출력");
////			System.out.println("3. 프로그램 종료");
//			System.out.println("4. 자동차 정보 삭제");
//			menu = mu.nextInt();
//			
//			switch(menu) {
//				case 1: {
//					System.out.println("1번 메뉴 선택.");
//					car tmp = new car();
//					
//					int tmp_modelNum; String tmp_modelName; int tmp_maxSpeed;
//					System.out.println("차량번호, 모델명, 최고속도를 입력하세요.");
//					tmp_modelNum = mu.nextInt();
//					mu.nextLine(); // 엔터 버퍼 초기화
//					tmp_modelName = mu.nextLine();
//					tmp_maxSpeed = mu.nextInt();
//					
//					tmp.setCar(tmp_modelNum, tmp_modelName, tmp_maxSpeed);
//					
//					// 객체 매칭
//					for(int i=0; i<=4; i++) {
//						// if를 사용해서 만약 null이 저장된 위치가 걸리면 그 곳에 객체 저장.
//						if(cameo[i] == null) {
//							System.out.println(i+" 비어있음\n");
//							cameo[i] = tmp;
//							break;
//						}
//					}
//					// 비어있는 칸 수 찾기
//					for(int i=0; i<=4; i++) {
//						if(cameo[i]!=null) { // 비어있지 않을 때
//							count+=1;
//							break;
//						}
//					}
//					System.out.println(count+"대의 자동차가 저장되어있음");
//				}
//				break;
//					
//					
////				반복문을 사용해서 현재 저장된 갯수만큼만 반복한다.
////				반복할떄 마다 1대의 자동차의 모든 정보를 출력해준다.(풋터)
//				case 2: {
//					System.out.println("[ 모든 자동차의 정보 ]\n");
//					for(int i=0; i<=4; i++) {
//						if(cameo[i]!=null) {
//							cameo[i].put_Car();
//						} 
//					else {
//							break;	}
//					}
//				}
//				break;
//				
////				case 3: {
////					System.out.println("3번 메뉴 선택.");
////					break;
////				}
//				
////				검색하기 원하는 자동차의 모델명을 입력.
////				배열의 모든 자동차들을 검사해서 해당 모델명과 일치하는 것을 찾음.
////				정확히 이야기하면, 1대의 자동차마다 갯터를 이용해서 모델명을 받아와야함.
////				받아옴 모델명과 내가 입력한 검색어가 일치하는지 확인.
////				일치하면, "찾았다"출력, 없으면 없다. 출력.
//				case 4: {
//					System.out.println("[ 자동차 정보 검색 ]");
//					
//					System.out.println("검색할 모델명을 입력하세요.");
//					mu.nextLine(); // 엔터 버퍼 초기화
//					String tmp4_name = mu.nextLine();
//
//				
//					for(int i=0; i<=count; i++) {
//						if(cameo[i].getCarModel().equals(tmp4_name)) {
//							System.out.println("일치하는 결과를 찾았습니다.\n");
//							System.out.println(cameo[i].getCarModel());
//							System.out.println(cameo[i].getCarNum());
//							System.out.println(cameo[i].getCarmaxSpeed());
//							break;
//						}
//						if(!cameo[i].getCarModel().equals(tmp4_name)) {
//							System.out.println("일치하지 않습니다.\n");
//							break;
//						}
//						
//					}
//					
//					
//					
//					
//					
//					
//					
//					
//					
//					
//					
//					
//					
//				break;
//				}
//				default: {
//					System.out.println("존재하지 않는 메뉴입니다.");
//				}
////			}
//		}
//	}
//}