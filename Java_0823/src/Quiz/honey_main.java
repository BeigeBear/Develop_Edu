package Quiz;

public class honey_main {

	public static void main(String[] args) {
//		honey lim = new honey(); // 객체 1개 생성 후 연결
////		
//		lim.SetSome(); // 데이터 셋팅함
//		lim.printSome(); // 출력
//		System.out.println();
		
//		lim.SetSome2("임재영", 12, 55, 87); // 데이터 셋팅함
//		lim.printSome(); // 출력
//		System.out.println();


// 		기본 생성자
//		honey lim = new honey();
//		lim.printSome();

//		기본 생성자에 직접 값 입력
		honey lim = new honey("홍길남", 87, 90, 30);
		lim.Process();
		lim.printSome();

		
	}

}



// 생성자로 기본값 정하고
// 셋터 끄고 생성자에 바로 값입력