package Quiz;

public class honey {
	private String stu_name;
	private int stu_kor;
	private int stu_eng;
	private int stu_mat;
	private int stu_tot;
	private float stu_avg;
	
//	메소드(생성자)=====================================================
	public honey(String n, int k, int e, int m) {
//		클래스가 가지고 있는 데이터를 청소해주거나, 디폴트 값을 셋팅.
		stu_name = n; stu_kor = k; stu_eng = e; stu_mat = m;
		stu_tot = 0; stu_avg = 0;
	}
	
	void Process() {
		stu_tot = stu_kor+stu_eng+stu_mat;
		stu_avg = (float)(stu_kor+stu_eng+stu_mat)/3.0f;
	}
		
//	메소드-셋터(Setter)===============================================
//	void SetSome(String a, int b, int c, int d) {
//		stu_name = a;
//		stu_kor = b;
//		stu_eng = c;
//		stu_mat = d;

//
//	void SetSome2(String h, int i, int j, int k) {
//		stu_name = h;
//		stu_kor = i;
//		stu_eng = j;
//		stu_mat = k;
//		stu_tot = i+j+k;
//		stu_avg = (float)(i+j+k)/3.0f;
//	}
//	
//	
//	출력===============================================

	void printSome() {
		System.out.println("학생의 이름은 "+stu_name+" 입니다.");
		System.out.println("국어 점수는 "+stu_kor+" 점 입니다.");
		System.out.println("영어 점수는 "+stu_eng+" 점 입니다.");
		System.out.println("수학 점수는 "+stu_mat+" 점 입니다.");
		System.out.println("총점은 "+stu_tot+" 점 입니다.");
		System.out.println("평균은 "+stu_avg+" 점 입니다.");
	}
}