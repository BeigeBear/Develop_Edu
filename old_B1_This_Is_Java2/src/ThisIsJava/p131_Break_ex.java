package ThisIsJava;

public class p131_Break_ex {

//	 랜덤 주사위를 돌리고 6이 나오면 스톱.
	public static void main(String[] args) {
		while(true) { // 무한루프
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num == 6) {
				break;
			
			}
		}
		System.out.println("프로그램 종료");

	}

}
