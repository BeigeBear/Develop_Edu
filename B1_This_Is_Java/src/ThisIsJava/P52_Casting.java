package ThisIsJava;

public class P52_Casting {

	public static void main(String[] args) {
		
		// Casting 강제 타입 변환
		
		// int > byte
		int intValue = 103029770;
		byte byteValue = (byte) intValue; 
		System.out.println(byteValue); // 103029770 > 10
		
		
		// long > int (보존)
		long longValue2 = 300;
		int intValue2 = (int) longValue2 ;
		System.out.println(intValue2);
		
		// long > int (비보존)
		long longValue3 = 3000000000L;
		int intValue3 = (int) longValue3 ;
		System.out.println(intValue3); // int값보다 큰 경우.
		
		
		// int > char
		int intValue4 = 'A';
		char charValue4 = (char) intValue4;
		System.out.println(charValue4);
		
		
		// double(실수) > int(정수)
		double doubleValue5 = 3.141592;
		int intValue5 = (int) doubleValue5;
		System.out.println(intValue5); // 3.141592 > 3
		
		
		// 변환 손실 검사 (패스)
		int i = 127;
		
		if( (i<Byte.MIN_VALUE)||(i>Byte.MAX_VALUE) ) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요.");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}
		
		// 변환 손실 검사 (에러)
		int i2 = 128;
		
		if( (i2<Byte.MIN_VALUE)||(i2>Byte.MAX_VALUE) ) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요.");
		} else {
			byte b2 = (byte) i2;
			System.out.println(b2);
		}
		
		
		// 
		
		
				
		

	}

}
