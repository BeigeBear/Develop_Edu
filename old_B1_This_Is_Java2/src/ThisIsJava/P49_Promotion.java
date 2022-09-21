package ThisIsJava;

public class P49_Promotion {

	public static void main(String[] args) {
		
		byte byteValue = 15;
		int intValu1 = byteValue; // 자동 타입 변환(Promotion)이 일어난다.
		// byte(1) 에서 int(4)로의 Promotion.
		System.out.println(intValu1);
		
		////////////////////////////////////////////////////////
		
		//int에서 double로의 변환
		int intValue2 = 200;
		double doubleValue = intValue2; // 200.0
		System.out.println(doubleValue);
		
		////////////////////////////////////////////////////////

		//chat에서 int로의 변환
		char charValue = 'A';
		int intValue3 = charValue;
		System.out.println(intValue3);
		
		////////////////////////////////////////////////////////
		
		// 예외 - byte에서 char로의 변환
		byte byteValue2 = 65;
      //char charValue = byteValue;
		char charData = (char) byteValue2;
		System.out.println(charData);
		
		////////////////////////////////////////////////////////

		
	}

}
