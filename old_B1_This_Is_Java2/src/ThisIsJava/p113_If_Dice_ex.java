package ThisIsJava;

public class p113_If_Dice_ex {

	public static void main(String[] args) {
//		0.0 <= Math random() < 1.0
//		임의의 정수를 뽑는다.
		
//		0.0*10 <= Math random()*10 < 1.0*10
//		double 타입의 난수를 리턴
		
//		(int)0.0 <= (int)Math random()*10 < (int) 10.0
//		정수 값의로 변환
		
//		int num = (int)(Math.random()*n)
//			System.out.println(int);
		
		int num = (int)(Math.random()*6)+1;
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		} else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		} else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
	}
}
