package Car_Array;

//자동차 저장기능(1번 메뉴선택시 작동)
//	(1) 자동차 클래스(car)로 객체를 1개 만든다.
//	(2) 셋터를 호출해서 자동차의 정보를 셋팅해준다.(직접 입력)
//	(3) 만들어진 객체를 배열에 저장해준다.
//	(4) 현재까지 저장된 자동차의 갯수가 몇개인지를 출력해준다.
//=====================================================================================

import java.util.Scanner;

public class car_Play {

	public static void main(String[] args) {
		int menu;

		Scanner mu = new Scanner(System.in);
		
		car[] cameo = new car[5]; // 배열 생성
		int count = 0; // 현재까지 저장된 자동차의 갯수
//      배열 생성(자동차 클래스로 만든 객체들이 저장될 곳)
//	    자동차가 들어갈 수 있는 최대갯수는 5개
//		======================================================
//		for(int i=0; i<=4; i++){ // 배열 초기화
//			cameo[i]=null;
//		}
//		for(int i=0; i<=4; i++){ // 배열 값 출력
//			System.out.println(cameo[i]);
//		}
//		반복문을 돌려서 null의 방을 찾는 것.
//		======================================================

	
		while(true) {
			System.out.println("1. 자동차 정보 입력");
			System.out.println("2. 모든자동차정보출력");
//			System.out.println("3. 프로그램 종료");
			System.out.println("4. 자동차 정보 삭제");
			menu = mu.nextInt();
			
			switch(menu) {
				case 1: {
					System.out.println("1번 메뉴 선택.");
					car tmp = new car();
					
					int tmp_modelNum; String tmp_modelName; int tmp_maxSpeed;
					System.out.println("차량번호, 모델명, 최고속도를 입력하세요.");
					tmp_modelNum = mu.nextInt();
					mu.nextLine(); // 엔터 버퍼 초기화
					tmp_modelName = mu.nextLine();
					tmp_maxSpeed = mu.nextInt();
					
					tmp.setCar(tmp_modelNum, tmp_modelName, tmp_maxSpeed);
					
					// 객체 매칭
					for(int i=0; i<=4; i++) {
						// if를 사용해서 만약 null이 저장된 위치가 걸리면 그 곳에 객체 저장.
						if(cameo[i] == null) {
							System.out.println(i+" 비어있음\n");
							cameo[i] = tmp;
							break;
						}
					}
					// 비어있는 칸 수 찾기
					for(int i=0; i<=4; i++) {
						if(cameo[i]!=null) { // 비어있지 않을 때
							count+=1;
							break;
						}
					}
					System.out.println(count+"대의 자동차가 저장되어있음");
				}
				break;
					
					
//				반복문을 사용해서 현재 저장된 갯수만큼만 반복한다.
//				반복할떄 마다 1대의 자동차의 모든 정보를 출력해준다.(풋터)
				case 2: {
					System.out.println("[ 모든 자동차의 정보 ]\n");
					for(int i=0; i<=4; i++) {
						if(cameo[i]!=null) {
							cameo[i].put_Car();
						} else {
							break;
						}
					}
				}
				break;
				
//				case 3: {
//					System.out.println("3번 메뉴 선택.");
//					break;
//				}
				
//				검색하기 원하는 자동차의 모델명을 입력.
//				배열의 모든 자동차들을 검사해서 해당 모델명과 일치하는 것을 찾음.
//				정확히 이야기하면, 1대의 자동차마다 갯터를 이용해서 모델명을 받아와야함.
//				받아옴 모델명과 내가 입력한 검색어가 일치하는지 확인.
//				일치하면, "찾았다"출력, 없으면 없다. 출력.
				case 4: {
					System.out.println("[ 자동차 정보 검색 ]");
					
					System.out.println("검색할 모델명을 입력하세요.");
					mu.nextLine(); // 엔터 버퍼 초기화
					String tmp4_name = mu.nextLine();

				
					for(int i=0; i<=count; i++) {
						if(cameo[i].getCarModel().equals(tmp4_name)) {
							System.out.println("일치하는 결과를 찾았습니다.\n");
							System.out.println(cameo[i].getCarModel());
							System.out.println(cameo[i].getCarNum());
							System.out.println(cameo[i].getCarmaxSpeed());
							break;
						}
						if(!cameo[i].getCarModel().equals(tmp4_name)) {
							System.out.println("일치하지 않습니다.\n");
							break;
						}
						
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
				break;
				}
				default: {
					System.out.println("존재하지 않는 메뉴입니다.");
				}
			}
		}
	}
}