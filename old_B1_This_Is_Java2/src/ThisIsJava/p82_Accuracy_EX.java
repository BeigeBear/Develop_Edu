package ThisIsJava;

public class p82_Accuracy_EX {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		
		System.out.println("��� �� ������");
		System.out.println("0.7 ������ ����,");
		System.out.println(result +"������ ���´�.");
		
		System.out.println();
		
		// �ذ� ���� - ��Ȯ�� ����� ���ؼ��� �ε��Ҽ��� Ÿ���� ������� �ʴ� ���� ����.
		// float, double�� 0.1�� ��Ȯ�ϰ� ǥ���� �� ���� �ٻ�ġ ó���Ѵ�.
		
		int apple2 = 1;
		int totalPieces = apple2 * 10;
		int number2 = 7;
		int temp = totalPieces - number2;
		
		double result2 = temp/10.0;
	
		System.out.println("��� �� ������");
		System.out.println("0.7 ������ ����,");
		System.out.println(result2 +"������ ���´�.");
		
	}
}