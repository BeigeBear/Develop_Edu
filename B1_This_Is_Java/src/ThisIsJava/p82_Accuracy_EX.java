package ThisIsJava;

public class p82_Accuracy_EX {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		
		System.out.println("사과 한 개에서");
		System.out.println("0.7 조각을 빼면,");
		System.out.println(result +"조각이 남는다.");
		
		System.out.println();
		
		// 해결 수정 - 정확한 계산을 위해서는 부동소수점 타임을 사용하지 않는 것이 좋다.
		// float, double은 0.1을 정확하게 표현할 수 없어 근사치 처리한다.
		
		int apple2 = 1;
		int totalPieces = apple2 * 10;
		int number2 = 7;
		int temp = totalPieces - number2;
		
		double result2 = temp/10.0;
	
		System.out.println("사과 한 개에서");
		System.out.println("0.7 조각을 빼면,");
		System.out.println(result2 +"조각이 남는다.");
		
	}
}