package Quiz;

public class honey {
	private String stu_name;
	private int stu_kor;
	private int stu_eng;
	private int stu_mat;
	private int stu_tot;
	private float stu_avg;
	
//	�޼ҵ�(������)=====================================================
	public honey(String n, int k, int e, int m) {
//		Ŭ������ ������ �ִ� �����͸� û�����ְų�, ����Ʈ ���� ����.
		stu_name = n; stu_kor = k; stu_eng = e; stu_mat = m;
		stu_tot = 0; stu_avg = 0;
	}
	
	void Process() {
		stu_tot = stu_kor+stu_eng+stu_mat;
		stu_avg = (float)(stu_kor+stu_eng+stu_mat)/3.0f;
	}
		
//	�޼ҵ�-����(Setter)===============================================
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
//	���===============================================

	void printSome() {
		System.out.println("�л��� �̸��� "+stu_name+" �Դϴ�.");
		System.out.println("���� ������ "+stu_kor+" �� �Դϴ�.");
		System.out.println("���� ������ "+stu_eng+" �� �Դϴ�.");
		System.out.println("���� ������ "+stu_mat+" �� �Դϴ�.");
		System.out.println("������ "+stu_tot+" �� �Դϴ�.");
		System.out.println("����� "+stu_avg+" �� �Դϴ�.");
	}
}