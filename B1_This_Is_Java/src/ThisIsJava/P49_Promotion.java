package ThisIsJava;

public class P49_Promotion {

	public static void main(String[] args) {
		
		byte byteValue = 15;
		int intValu1 = byteValue; // �ڵ� Ÿ�� ��ȯ(Promotion)�� �Ͼ��.
		// byte(1) ���� int(4)���� Promotion.
		System.out.println(intValu1);
		
		////////////////////////////////////////////////////////
		
		//int���� double���� ��ȯ
		int intValue2 = 200;
		double doubleValue = intValue2; // 200.0
		System.out.println(doubleValue);
		
		////////////////////////////////////////////////////////

		//chat���� int���� ��ȯ
		char charValue = 'A';
		int intValue3 = charValue;
		System.out.println(intValue3);
		
		////////////////////////////////////////////////////////
		
		// ���� - byte���� char���� ��ȯ
		byte byteValue2 = 65;
      //char charValue = byteValue;
		char charData = (char) byteValue2;
		System.out.println(charData);
		
		////////////////////////////////////////////////////////

		
	}

}
