package miniProject_0916;

import java.util.Scanner;

public class jumsu {

	public static void main(String[] args) {
		
		Scanner score = new Scanner(System.in);
		
		System.out.print("사람 수는 몇 명? : ");
		int n = score.nextInt();
		int[] student = new int[n];
		
		System.out.println("점수를 입력하세요");
		
		int total = 0;
		int max = 0;
		int min = 0;
		for(int i=0; i<student.length; i++) {
			System.out.print((i+1)+"번의 점수 : ");
			int tmpScore = score.nextInt();
			total += tmpScore;
			student[i] = tmpScore;
			if(tmpScore<=student[i]) {
				min = tmpScore;
			}
			if(tmpScore>student[i]) {
				max = tmpScore;
			}
		}
		float arg = (float)(total/student.length);

		
		System.out.println("합계 : "+total);
		
		System.out.println("평균 : "+arg);
		
		System.out.println("최대값 : "+ max);
		System.out.println("최소값 : "+ min);
		
	}
}

	

		
		
		
		
		

		
		
		
		
