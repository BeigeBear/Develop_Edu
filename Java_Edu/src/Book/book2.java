package Book;

//추가되어야할 정보들
//평점(숫자, 정수형)
//재고갯수(숫자, 정수형)

public class book {
//extends book {
	int b_Ratings; // 평점
	int b_Stock; // 재고
	
	
//	새로운 데이터에 관련된 기능들
//	셋터 겟터 풋터
	
//	조상(book)클래스가 가진 셋터가 6개의 데이터를 셋팅한다.
//	그럼, 여기있는 셋터를 이용해서 그것까지 설정해주는 방법을 생각해보자.(오버라이드)

	protected void setBookInfo(int num, String name, String writer, int price, String company,
			String date, int ratings, int stock) {
		this.b_Num = num;
		this.b_Name = name;
		this.b_Writer = writer;
		this.b_Price = price;
		this.b_Company = company;
		this.b_Date = date;
		b_Ratings = ratings;
		b_Stock = stock;
	}	
	
	protected void setBookInfo2(int num, String name, String writer, int price, String company,
			String date, int ratings, int stock) {
		super.setBookInfo(num, name, writer, price, company, date);
//		this.b_Num = num;
//		this.b_Name = name;
//		this.b_Writer = writer;
//		this.b_Price = price;
//		this.b_Company = company;
//		this.b_Date = date;	
		b_Ratings = ratings;
		b_Stock = stock;
	}
	

//	풋터
	protected void putBookInfo() {
		System.out.println("평점 : " + b_Ratings + "재고수량 : " + b_Stock);
	}
	
	protected void putBookInfo2() {
		super.putBookInfo();
		System.out.println("평점 : " + b_Ratings);
		System.out.println("재고수량 : " + b_Stock);
	}
	
	
	protected int getBookRatings() {
		return b_Ratings;
	}
	protected int getBookStock() {
		return b_Stock;
	}
	
}