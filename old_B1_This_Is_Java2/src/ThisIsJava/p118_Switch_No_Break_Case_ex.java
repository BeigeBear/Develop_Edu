package ThisIsJava;

public class p118_Switch_No_Break_Case_ex {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4)+ 8;
		System.out.println("[����ð�: " + time + " ��]");
		
		switch(time) {
			case 8:
				System.out.println("����մϴ�.");
			case 9:
				System.out.println("ȸ�Ǹ� �սô�.");
			case 10:
				System.out.println("������ ���ϴ�.");
			default:
				System.out.println("�ܱ��� �����ϴ�.");
				
//		 Break �� ���� ������ �ش��ϴ� ���̽� �Ʒ��� ��¹��� ��� ��µȴ�.
				
		}

	}

}