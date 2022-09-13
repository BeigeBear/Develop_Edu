package menuTest;

//	다형성 테스트를 위함 클래스 작업 내용
//	(1) 조상클래스와 후손클래스가 필요함
//	(2) Tire(조상), k5_Tire(후손), k7_Tire(후손)
//	(3) Tire 클래스가 가진 데이터는 타이어두께, 타이어이름, 셋터를 가지고 있음
//	(4) 후손클래스ㅜ들은 풋터만 가지고 있다(자신들의 타이어 두꼐의 이름을 출력함)

public class Tire {
	
	int t_Width;
	String t_Name;
	
	void setTireInfo(int t_w, String t_n) {
		t_Width = t_w;
		t_Name = t_n;
	}
	
}
