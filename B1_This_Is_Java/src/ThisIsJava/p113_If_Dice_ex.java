package ThisIsJava;

public class p113_If_Dice_ex {

	public static void main(String[] args) {
//		0.0 <= Math random() < 1.0
//		������ ������ �̴´�.
		
//		0.0*10 <= Math random()*10 < 1.0*10
//		double Ÿ���� ������ ����
		
//		(int)0.0 <= (int)Math random()*10 < (int) 10.0
//		���� ���Ƿ� ��ȯ
		
//		int num = (int)(Math.random()*n)
//			System.out.println(int);
		
		int num = (int)(Math.random()*6)+1;
		
		if(num==1) {
			System.out.println("1���� ���Խ��ϴ�.");
		} else if(num==2) {
			System.out.println("2���� ���Խ��ϴ�.");
		} else if(num==3) {
			System.out.println("3���� ���Խ��ϴ�.");
		} else if(num==4) {
			System.out.println("4���� ���Խ��ϴ�.");
		} else if(num==5) {
			System.out.println("5���� ���Խ��ϴ�.");
		} else {
			System.out.println("6���� ���Խ��ϴ�.");
		}
	}
}