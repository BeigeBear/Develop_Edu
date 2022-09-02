package B_ThisJava;

public class p195_Student {
//	데이터나 기능을 집어넣을 수 있는 곳.(필드) (데이터 집합)(기능 집합)
//	private로 클래스 락(접근제한).
	
	private int data1;
	private int data2;
	private int data3;
	private String data4;
	private String data5;
	private String data6;
	private String data7;
//	         클래스  레퍼런스
	
	
//	메소드-셋터(Setter) =================================
//	데이터를 셋팅하여 임시변수로 대입 (a, b, c,...)
	void SetSomething(int a, int b, int c) { //정수
		data1=a; // 셋팅 값 대입, a는 임시 변수
		data2=b;
		data3=c;
	}
	void SetSomething1(String d, String e, String f) {
		data4=d; // 셋팅 값 대입, d는 임시 변수
		data5=e;
		data6=f;
	}
	
//	deep copy, shallow copy
	void SetSomething2(String h) {
		data7=h;
//		새로운 문자열 객체를 만든다.
//		그 곳에 문자열을 복사(깊은 복사, deep copy)한다.
//		그리고 그 문자열 객체를 data(레퍼런스)에 연결해준다.
		
//		.Clone( )메소드 (문자열 클래스)
	}
	
		
		
		
		
		
		
		
		
	
//	==================================================

//	==================================================
//	매소드(기능) - 풋터(putter) > 데이터 출력 전문
	void printSomeThing() {
		System.out.println(data1+" "+data2+" "+data3);
//		데이터 3개를 출력한다.
//		리턴을 쓰는데 
	}
	void printSomeThing1() {
		System.out.println(data4+" "+data5+" "+data6);	
	}
}