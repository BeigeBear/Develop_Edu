package ThisIsJava;

public class p118_Switch_No_Break_Case_ex {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4)+ 8;
		System.out.println("[현재시간: " + time + " 시]");
		
		switch(time) {
			case 8:
				System.out.println("출근합니다.");
			case 9:
				System.out.println("회의를 합시다.");
			case 10:
				System.out.println("업무를 봅니다.");
			default:
				System.out.println("외근을 나갑니다.");
				
//		 Break 가 없기 때문에 해당하는 케이스 아래의 출력문이 모두 출력된다.
				
		}

	}

}