package Book;

import java.lang.reflect.Array;

public class book_Main {

	public static void main(String[] args) {
			book cameo1 = new book();
			book cameo2 = new book();
			
			
//			public class book_Main {
//			abstract(추상화)
//			book클래스로는 객체를 만들 수 없습니다
//			book cameo1 = new book();
//			book cameo2 = new book();
	
			
			
			cameo1.setBookInfo(1, "돈의 속성", "김승호", 17800, "스노우폭스북스", "2020년 06월 15일");
			cameo2.setBookInfo(1, "부자 아빠 가난한 아빠", "로버트 기요사키", 15800, "민음인", "2000년 02월 10일");		
//			
//			cameo1.putBookInfo();
//			cameo2.putBookInfo();
//		
//			String book_name = cameo1.getName();
//			System.out.println("반환된 책 이름은 "+ book_name);
			
//			=====================================================================================================
//			book2 cameo3 = new book2();
//			
//			cameo3.setBookInfo(104, "정의란 무엇인가", "마이클 센델", 58400, "지음사", "2015년 5월 23일", 50, 2584);
//			cameo3.putBookInfo2();	
//			=====================================================================================================
		
//		배열
//		여러 개읜 데이터를 저장하는 곳(Array)
//		정수형 숫자를저장한 후 출력해보기
//		Array arr = new Array():
//		2권의 책의 정보를 배열에 저장한다.
//		잘 저장되었는지 출력해본다.
		
//		p165. 169 참고
		
//		int[] arr = new int [3];
//		String[] arr2 = new String [3];
//		arr[0] = 100;	arr[1] = 200;	arr[2] = 300;
//		arr2[0] = "abc";	arr2[1] = "def";	arr2[2] = "ghi";
//		for(int x = 0; x <=2; x++) {
//			System.out.println("["+arr[x]+"]");
//		}
//		for(int x = 0; x <=2; x++) {
//			System.out.println("["+arr2[x]+"]");
//		}
		
		
	
		book[] arr3 = new book[2];
		arr3[0]=cameo1;
		arr3[1]=cameo2;
		
		for(int x = 0; x <= 1; x++) {
		System.out.println("["+arr3[x].b_Num+"]");
		System.out.println("["+arr3[x].b_Name+"]");
		System.out.println("["+arr3[x].b_Writer+"]");
		System.out.println("["+arr3[x].b_Price+"]");
		System.out.println("["+arr3[x].b_Company+"]");
		System.out.println("["+arr3[x].b_Date+"]");
	}
		



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

			
	}

}

