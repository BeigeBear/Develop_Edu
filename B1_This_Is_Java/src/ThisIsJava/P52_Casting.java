package ThisIsJava;

public class P52_Casting {

	public static void main(String[] args) {
		
		// Casting ���� Ÿ�� ��ȯ
		
		// int > byte
		int intValue = 103029770;
		byte byteValue = (byte) intValue; 
		System.out.println(byteValue); // 103029770 > 10
		
		
		// long > int (����)
		long longValue2 = 300;
		int intValue2 = (int) longValue2 ;
		System.out.println(intValue2);
		
		// long > int (����)
		long longValue3 = 3000000000L;
		int intValue3 = (int) longValue3 ;
		System.out.println(intValue3); // int������ ū ���.
		
		
		// int > char
		int intValue4 = 'A';
		char charValue4 = (char) intValue4;
		System.out.println(charValue4);
		
		
		// double(�Ǽ�) > int(����)
		double doubleValue5 = 3.141592;
		int intValue5 = (int) doubleValue5;
		System.out.println(intValue5); // 3.141592 > 3
		
		
		// ��ȯ �ս� �˻� (�н�)
		int i = 127;
		
		if( (i<Byte.MIN_VALUE)||(i>Byte.MAX_VALUE) ) {
			System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
			System.out.println("���� �ٽ� Ȯ���� �ּ���.");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}
		
		// ��ȯ �ս� �˻� (����)
		int i2 = 128;
		
		if( (i2<Byte.MIN_VALUE)||(i2>Byte.MAX_VALUE) ) {
			System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
			System.out.println("���� �ٽ� Ȯ���� �ּ���.");
		} else {
			byte b2 = (byte) i2;
			System.out.println(b2);
		}
		
		
		// 
		
		
				
		

	}

}
