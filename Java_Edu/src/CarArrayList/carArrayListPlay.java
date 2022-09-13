package CarArrayList;

import java.util.ArrayList;

import java.util.Scanner;

public class carArrayListPlay {
	public static void main(String[] args) {
		int menu;
		Scanner sc = new Scanner(System.in);
		
		// 리스트생성(자동차클래스로 만든객체들이 저장될곳)
		ArrayList<car> cars = new ArrayList<car>();
		
		// 메뉴출력
		while(true) {	
			System.out.println("1.자동차정보 저장+입력");
			System.out.println("2.모든자동차정보출력");
			System.out.println("3.프로그램종료");
			System.out.println("4.자동차검색");
			menu = sc.nextInt( );	// 메뉴번호입력
		  
			switch( menu ) {	// 메뉴번호와 일치하는 특정기능실행 
				case 1: {
					System.out.println("======자동차저장하기=====\n");
					car tmp = new car();	//자동차만들기
  
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
				} break;  
				case 2:{	//자동차정보출력
					System.out.println("===========모든자동차의 정보============");
					
					//반복문을 사용해서 현재 저장된 자동차의 갯수만큼만 반복한다.
					//반복할때마다 1대의 자동차의 모든정보를 출력해준다.(풋터)
					for(int i=0; i<cars.size(); i++) {
						cars.get(i).put_Car();	//컨테이너 -> 자동차가져옴(get) -> 자동차정보출력(put_Car_Info)
					}
				} break;
				case 3:{
					System.out.println("프로그램종료됨");
					return;
				}
				case 4:{//검색기능
					String searchByModelName;	//검색어가 모델이름일 경우 사용함
					int searchByModelNo;	//검색어가 모델번호일 경우 사용함 
					int searchByMaxSpeed;	//검색어가 최대속도일 경우 사용함 

					System.out.println("자동차검색하기\n");
					System.out.println("검색할것은? [1.자동차모델이름 2.자동차모델번호 3.최대속도] ");
					int searchCategory = sc.nextInt();//자동차모델이름

					//검색할것이 어떤것인가에 따른분류
					switch(searchCategory) {
						case 1: {
							System.out.println("검색키워드? [자동차모델이름] ");
							searchByModelName = sc.next();	//검색하고싶은 모델이름입력
							for(int i=0; i<cars.size(); i++) {
								car tmp = new car();
								int tmpNo = tmp.getCarNum();
								if(searchByModelName.equals(tmpNo)) {
									System.out.println("찾았다");
								} else {
									System.out.println("못 찾았다");
								}
							}
							//실제검색하는 부분이 여기에 온다.(구현해야할부분)
						} break;

						case 2: {
							System.out.println("검색키워드? [자동차모델번호] "); //검색하고싶은 모델번호입력
							searchByModelNo = sc.nextInt();

							//실제검색하는 부분이 여기에 온다.(구현해야할부분)	    
							
							} break;
							
						case 3:{
							System.out.println("검색키워드? [최대속도] "); //검색하고싶은 최대속도입력
							searchByMaxSpeed = sc.nextInt();
  		 
		 //실제검색하는 부분이 여기에 온다.(구현해야할부분)
						} break;
					}
				} break; //--안쪽switch
				
				default: {
					System.out.println("존재하지않는 메뉴입니다");
				}
			}//--------바깥쪽switch
		}//---while문 
	}//--main메소드
}//---클래스
























