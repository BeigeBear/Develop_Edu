
import java.util.ArrayList;
import java.util.Scanner;

public class Starbuck_Play {

	static Scanner SB = new Scanner(System.in);

	static boolean orderTakeout = true;
	
	
	static void starbuckSirenOrder() {
//		while(true) {
			System.out.println("======================================");
			System.out.println("               Starbuck               ");
			System.out.println("======================================");
			coffeeTakeout();
			System.out.println("======================================");
			choiceMenu();

			
		}
	
	
	static void coffeeTakeout() {
		System.out.println("             주문하시겠습니까?            ");
		System.out.println("  ┌─────────────┐    ┌─────────────┐  ");
		System.out.println("  │   1. 매장    │    │	 2. 포장    │  ");
		System.out.println("  └─────────────┘    └─────────────┘  ");
		
		int tmp_takeout = SB.nextInt();
		
		
		switch(tmp_takeout) {
			case 1: {
				orderTakeout = false;
				System.out.println("           매장을 선택하셨습니다           ");
			} break;
			case 2: {
				orderTakeout = true;
				System.out.println("           포장을 선택하셨습니다           ");
			} break;
		}
	}
	
	static void choiceMenu() {
		System.out.println("             메뉴를 선택하세요            ");
		System.out.println("  ┌────────────────────────────────┐  ");
		System.out.println("  │  1  카페 아메리카노   	           │  ");
		System.out.println("  ├────────────────────────────────┤  ");
		System.out.println("  │  2  카페 모카                    │  ");
		System.out.println("  ├────────────────────────────────┤  ");
		System.out.println("  │  3  카라멜 마끼아또            	   │  ");
		System.out.println("  ├────────────────────────────────┤  ");
		System.out.println("  │  4  나이트로 콜드브루              │  ");
		System.out.println("  └────────────────────────────────┘  ");
		System.out.print  ("     0  이전                입력 : ");
		int tmp_menu = SB.nextInt();

		switch (tmp_menu) {
			case 0: {
				return;
			}
		
			case 1: {
				caffeAmericano tmp = new caffeAmericano();
				
				System.out.println("      카페 아메리카노를 선택하셨습니다\n\n");
				System.out.println("        HOT(뜨겁게) / ICE(차갑게)        ");
				System.out.println("  ┌─────────────┐    ┌─────────────┐  ");
				System.out.println("  │   1. HOT    │    │	 2. ICE    │  ");
				System.out.println("  └─────────────┘    └─────────────┘  ");
				int tmp_hotice = SB.nextInt();

				if(tmp_hotice == 1) {
					tmp.setCaffeAmericano(orderTakeout, 0);
					
				
					
				}
				
				}
			}
		}
				

		static void printOrderCoffee() {
			if tmp_
			boolean takeout = orderTakeout;
			
			
			
			
			
			
			
			tm
		}


//			
//			// 라면
//			case 2: {
//				Ramen tmp = new Ramen();	
//				int tmp_proSalt;
//				
//				System.out.print("나트륨함유량 : ");
//				tmp_proSalt = sc.nextInt();
//				
//				tmp.setRamen(tmp_proName, tmp_proPrice, tmp_proNum, tmp_proSalt);
//				CVS.add(tmp);
//				
//				System.out.println("▶ 등록 완료, 현재 상품 수 "+CVS.size()+" 개\n");
//			} break;
//			
//			// 과자
//			case 3: {
//				Snack tmp = new Snack();
//				int tmp_prokcal;
//				
//				System.out.print("칼로리 : ");
//				tmp_prokcal = sc.nextInt();
//				
//				tmp.setSnack(tmp_proName, tmp_proPrice, tmp_proNum, tmp_prokcal);
//				CVS.add(tmp);
//				
//				System.out.println("▶ 등록 완료, 현재 상품 수 "+CVS.size()+" 개\n");
//			} break;
//			
//			// 그 외
//			default: {
//				Product tmp = new Product();
//				
//				tmp.setProduct(tmp_proName, tmp_proPrice, tmp_proNum);
//				CVS.add(tmp);
//				
//				System.out.println("▶ 등록 완료, 현재 상품 수 "+CVS.size()+" 개\n");
//			}
//		break;
//		} 
//	}
//		
	
	
	static void choiceIceHot(String m) {
		System.out.println("        HOT(뜨겁게) / ICE(차갑게)        ");
		System.out.println("  ┌─────────────┐    ┌─────────────┐  ");
		System.out.println("  │   1. HOT    │    │	 2. ICE    │  ");
		System.out.println("  └─────────────┘    └─────────────┘  ");
		int tmp_hotice = SB.nextInt();
		m tmp = new ca(); 
		
		switch(tmp_hotice) {
			case 1: {
			
				System.out.println("           매장을 선택하셨습니다           ");
			} break;
			case 2: {
				orderTakeout = true;
				System.out.println("           포장을 선택하셨습니다           ");
			} break;
		}
		
	}
		
		

	
	
	
	
	

	
	public static void main(String[] args) {
		starbuckSirenOrder();
		
		
		
		
		
		
		
		
	}
}


