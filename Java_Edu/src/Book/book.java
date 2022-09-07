package Book;

public class book { // book클래스 추상화
	protected int b_Num;
	protected String b_Name;
	protected String b_Writer;
	protected int b_Price;
	protected String b_Company;
	protected String b_Date;
	
	
	protected int getNum() {
		return b_Num;
	}
	protected String getName() {
		return b_Name;
	}
	protected String getWriter() {
		return b_Writer;
	}
	protected int getPrice() {
		return b_Price;
	}
	protected String getCompany() {
		return b_Company;
	}
	protected String getDate() {
		return b_Date;
	}
	
	protected void setBookInfo(int num, String name, String writer, int price, String company, String date) {
		this.b_Num = num;
		this.b_Name = name;
		this.b_Writer = writer;
		this.b_Price = price;
		this.b_Company = company;
		this.b_Date = date;	
	}
	
	protected void putBookInfo() {
		System.out.println("이름 : " + b_Name);
		System.out.println("저자 : " + b_Writer);
		System.out.println("가격 : " + b_Price + "원");
		System.out.println("출판사 : " + b_Company);
		System.out.println("출판일 : " + b_Date);
	}
	
	protected void putBookName() {
		System.out.println("이름 : " + b_Name);
	}
	protected void putBookWriter() {
		System.out.println("저자 : " + b_Writer);
	}
	protected void putBookPrice() {
		System.out.println("가격 : " + b_Price + "원");
	}
	protected void putBookCompany() {
		System.out.println("출판사 : " + b_Company);
	}
	protected void putBookDate() {
		System.out.println("출판일 : " + b_Date);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
