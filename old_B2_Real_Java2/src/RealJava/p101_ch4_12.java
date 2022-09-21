package RealJava;

public class p101_ch4_12 {

	public static void main(String[] args) {
		int i, j; 
		//for문의 변수설정은 밖에서.
		
		for(i=0;i<4;i++) {				// 4행까지 작성
			for(j=1;j<=i+1;j++) {		// 행을 만들면서 * 하나씩 증가삽입
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}