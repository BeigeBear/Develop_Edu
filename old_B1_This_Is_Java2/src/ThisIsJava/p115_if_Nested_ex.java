package ThisIsJava;

public class p115_if_Nested_ex {

	public static void main(String[] args) {
		int score = (int)(Math.random()*20) + 81;
		System.out.println("점수: " + score);

		String grade;
	
		if(score>=90) { 				// 90이상
			if(score>=95) {				// 90이상 중 95이상
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if(score>=85) {				// 85이상
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		System.out.println("학점: "+ grade);
	}
}