package CVS;

import java.util.ArrayList;
import java.util.Scanner;

public class CVS_Play {
	
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Product> CVS = new ArrayList<Product>();
	
	// 테스트 샘플
	static void sample() {
		
		Product tmp201 = new Product();
		tmp201.setProduct("마이쮸", 200, 1001);
		CVS.add(tmp201);
		
		Product tmp202 = new Product();
		tmp202.setProduct("크런키", 150, 1002);
		CVS.add(tmp202);
		
		Product tmp203 = new Product();
		tmp203.setProduct("이것이자바다", 20000, 1003);
		CVS.add(tmp203);
		
		Product tmp204 = new Product();
		tmp204.setProduct("에어팟", 199000, 1004);
		CVS.add(tmp204);
		
		
		Coffee tmp1 = new Coffee();	
		tmp1.setCoffee("아메리카노", 2500, 11, 300);
		CVS.add(tmp1);
		
		Coffee tmp2 = new Coffee();
		tmp2.setCoffee("카페라떼", 3200, 12, 450);
		CVS.add(tmp2);
		
		Coffee tmp3 = new Coffee();
		tmp3.setCoffee("아이스티", 3000, 13, 0);
		CVS.add(tmp3);
		
		Coffee tmp4 = new Coffee();
		tmp4.setCoffee("카라멜마끼아또", 3500, 14, 420);
		CVS.add(tmp4);
		
		
		Ramen tmp11 = new Ramen();
		tmp11.setRamen("신라면", 700, 51, 50);
		CVS.add(tmp11);
		
		Ramen tmp12 = new Ramen();
		tmp12.setRamen("진라면", 700, 52, 150);
		CVS.add(tmp12);
		
		Ramen tmp13 = new Ramen();
		tmp13.setRamen("사리곰탕", 700, 53, 200);
		CVS.add(tmp13);
		
		Ramen tmp14 = new Ramen();
		tmp14.setRamen("스낵면", 700, 54, 300);
		CVS.add(tmp14);
		
		
		
		Snack tmp21 = new Snack();
		tmp21.setSnack("바나나킥", 1500, 101, 230);
		CVS.add(tmp21);
		
		Snack tmp22 = new Snack();
		tmp22.setSnack("조청유과", 1500, 102, 350);
		CVS.add(tmp22);
		
		Snack tmp23 = new Snack();
		tmp23.setSnack("양파링", 1500, 103, 200);
		CVS.add(tmp23);
		
		Snack tmp24 = new Snack();
		tmp24.setSnack("오잉", 1500, 104, 400);
		CVS.add(tmp24);
		
		Snack tmp25 = new Snack();
		tmp25.setSnack("허니버터칩", 1500, 105, 570);
		CVS.add(tmp25);
	}
	
	
	// 메인 메뉴 Play
	static void productPlay() {
		while(true) {
			System.out.println("▣▣▣ CU 상품 관리 ▣▣▣");
			System.out.println(" 1. 상품 등록");
			System.out.println(" 2. 상품 정보 조회");
			System.out.println(" 3. 상품 검색");
			System.out.println(" 4. 종료");
			int product;
			product = sc.nextInt( );
		 
			switch(product) {
				case 1: {
					regProduct();
				} break;
				
				case 2:{
					printProduct();
				} break;
				
				case 3:{
					searchProduct();
				} break;
				
				case 4:{
					exitProgram();
				}

				default: {
					System.out.println("존재하지않는 메뉴입니다");
				}
			}
		}
	}
	
	
	// 1.상품 등록
	static void regProduct() {
		System.out.println("◆◇◆ 등록할 상품의 종류를 선택해주세요 ◆◇◆");
		System.out.println(" 1 | 커피 Coffee\n 2 | 라면 Ramen\n 3 | 과자 Snack\n 4 | 그 외");
		int product = sc.nextInt();
		
		String tmp_proName;
		int tmp_proPrice;
		int tmp_proNum;
		
		System.out.print("이름 : ");
		tmp_proName = sc.next();
		System.out.print("가격 : ");
		tmp_proPrice = sc.nextInt();
		System.out.print("고유 번호 : ");
		tmp_proNum = sc.nextInt();
		
		switch (product) {
			// 커피
			case 1: { 
				Coffee tmp = new Coffee();	
				int tmp_proCaffeine;
				
				System.out.print("카페인 함유량 : ");
				tmp_proCaffeine = sc.nextInt();
				
				tmp.setCoffee(tmp_proName, tmp_proPrice, tmp_proNum, tmp_proCaffeine);
				CVS.add(tmp);
				
				System.out.println("▶ 등록 완료, 현재 상품 수 "+CVS.size()+" 개\n");
			} break;
			
			// 라면
			case 2: {
				Ramen tmp = new Ramen();	
				int tmp_proSalt;
				
				System.out.print("염분 함유량 : ");
				tmp_proSalt = sc.nextInt();
				
				tmp.setRamen(tmp_proName, tmp_proPrice, tmp_proNum, tmp_proSalt);
				CVS.add(tmp);
				
				System.out.println("▶ 등록 완료, 현재 상품 수 "+CVS.size()+" 개\n");
			} break;
			
			// 과자
			case 3: {
				Snack tmp = new Snack();
				int tmp_prokcal;
				
				System.out.print("칼로리 : ");
				tmp_prokcal = sc.nextInt();
				
				tmp.setSnack(tmp_proName, tmp_proPrice, tmp_proNum, tmp_prokcal);
				CVS.add(tmp);
				
				System.out.println("▶ 등록 완료, 현재 상품 수 "+CVS.size()+" 개\n");
			} break;
			
			// 그 외
			default: {
				Product tmp = new Product();
				
				tmp.setProduct(tmp_proName, tmp_proPrice, tmp_proNum);
				CVS.add(tmp);
				
				System.out.println("▶ 등록 완료, 현재 상품 수 "+CVS.size()+" 개\n");
			}
		break;
		} 
	}
	
	
	// 2.모든 상품 정보 출력
	static void printProduct() {
		System.out.println(">> 모든 상품 정보 <<");
		for(int i=0; i<CVS.size(); i++) {
			if(CVS.get(i) instanceof Coffee) {
				Coffee print = (Coffee)CVS.get(i);
				print.putCoffee();
				System.out.println();
			}
			if(CVS.get(i) instanceof Ramen) {
				Ramen print = (Ramen)CVS.get(i);
				print.putRamen();
				System.out.println();
			}
			if(CVS.get(i) instanceof Snack) {
				Snack print = (Snack)CVS.get(i);
				print.putSnack();
				System.out.println();
			}
			CVS.get(i).putProduct();
			System.out.println();
		}
	}
	
	
	static void searchProduct() {
		System.out.println(">>>>> 상품 정보 검색 <<<<<");
		System.out.println("  1. 상품명으로 찾기\n  2. 가격으로 찾기\n  3. 일련번호로 찾기");
		int searchCategory = sc.nextInt();

		switch(searchCategory) {
			case 1: {
				System.out.println("검색할 상품명을 입력하세요.");
				String pro_Name = sc.next();
	
				for(int i=0; i<=CVS.size(); i++) {
					if(CVS.get(i).getProductName().equals(pro_Name)) {
						System.out.println("◆ 해당 상품명과 일치하는 상품 정보 ◆");
						System.out.print("이름 : " + CVS.get(i).getProductName());
						System.out.println("\t가격 : " + CVS.get(i).getProductPrice()+" 원");
						if(CVS.get(i) instanceof Coffee) {
							Coffee print = (Coffee)CVS.get(i);
							System.out.println("카페인 함유량 : " + print.getCoffeeCaffeine() + "mg");
						} 
						if(CVS.get(i) instanceof Ramen) {
							Ramen print = (Ramen)CVS.get(i);
							System.out.println("염분 함유량 : " + print.getRamenSalt() + "mg");
						}
						if(CVS.get(i) instanceof Snack) {
							Snack print = (Snack)CVS.get(i);
							System.out.println("칼로리 : " + print.getSnackKcal() + " Kcal");
						}
						System.out.println("고유번호 : " + CVS.get(i).getProductNum()+"\n");
					}
				
//					if(!(CVS.get(i).getProductName().equals(pro_Name))) {
//						System.out.println("오류");
//					} continue;
				}
			}
		
			
			
			
		}
	}		
			
			
			
			
			
			
			
			
			
			
			
			
//	
//						
////						}
//					}
//				}
//			} break;
//			
//			case 2: {
//				System.out.println("검색할 상품의 가격을 입력하세요.");
//				int proPrice = sc.nextInt();
//				
//				for(int i=0; i<=CVS.size(); i++) {
//					if(CVS.get(i).getProductPrice() == proPrice) {
//						if(CVS.get(i) instanceof Product_DE) {
//							Product_DE print = (Product_DE)CVS.get(i);
//							
//							System.out.println("일치하는 결과를 찾았습니다.\n");
//							System.out.println("이름 : " + CVS.get(i).getProductName());
//							System.out.print("   가격 : " + CVS.get(i).getProductPrice()+" 원");
//							System.out.println("고유번호 : " + CVS.get(i).getProductNum());
//							System.out.println("무게 : "+print.getProductWeight());
//							System.out.println("할인율 : "+print.getProductSale()+ "%\n");
//							break;
//						} else {
//							System.out.println("타입 오류");
//						}
//					}
//					if(!(CVS.get(i).getProductPrice() == proPrice)) {
//						System.out.println("일치하지 않습니다.");
//						break;
//					}
//				}
//			} break;
//		}
//		
		
		
		
	
		
	
	
	// 4.프로그램 종료
	static void exitProgram() {
		System.out.println("프로그램이 종료되었습니다.");
		return;
	}


			
			
 	public static void main(String[] args) {

		sample();
		
		productPlay();
	}

}
