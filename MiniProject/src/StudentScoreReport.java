
public class StudentScoreReport {

	public static void main(String[] args) {
		Student[] student = new Student[10];
		
		student[0] = new Student(99,70,80);
		student[1] = new Student(70,80,60);
		student[2] = new Student(80,70,70);
		student[3] = new Student(60,80,80);
		student[4] = new Student(50,60,70);
		student[5] = new Student(70,50,60);
		student[6] = new Student(90,90,50);
		student[7] = new Student(90,80,90);
		student[8] = new Student(80,70,90);
		student[9] = new Student(100,80,90);

		System.out.println("====Score Report===========");
		System.out.println("국어   영어   수학   합계   평균");
		System.out.println("===========================");
		for(int i=0; i<student.length; i++) {
			int kor = student[i].getKorean();
			int eng = student[i].getEnglish();
			int mat = student[i].getMath();
			int tot = student[i].total();
			float arg = student[i].average();
			System.out.print(kor+"  ");
			System.out.print(eng+"  ");
			System.out.print(mat+"  ");
			System.out.print(tot+"  ");
			System.out.println(arg+"  ");
		}
	}

}
