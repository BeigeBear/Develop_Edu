package ThisIsJava;

public class p100_AssignentOperator_EX {

	public static void main(String[] args) {
		int score = 95;
		char grade = (score>90) ? 'A' : 'B';

		System.out.println(grade);
		
//		===== ���� ���������� ���� �����ڰ� ����. ====
		
		int score2 = 95;
		char grade2;
		if(score>90) {
			grade2 = 'A';
		} else {
			grade2 = 'B';
		}
		System.out.println(grade2);
	}

}
