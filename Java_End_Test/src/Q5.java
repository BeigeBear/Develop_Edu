//	[문항5] 1 ~ 45사이의 숫자 중 6개를 추출하는 프로그램을 작성하시오.
//		(단, 중복된 숫자는 1번만 출력 되도록 한다.)
		
public class Q5 {

	public static void main(String[] args) {
		int[] choiceNum = new int[6];
	    choiceNum[0] = 0;

	    for(int i=0; i<6; i++) {
	      int num = (int)((Math.random()*45) + 1);
	      if(i>=1) {
	        while(true) {
	          if(choiceNum[i-1] == num) {
	        	  num = (int)((Math.random()*45) + 1);
	          } else {
	        	  break;
	          }
	        }
	      }
	      choiceNum[i] = num;
	      System.out.print(choiceNum[i]+" ");
	    }
	}
}

