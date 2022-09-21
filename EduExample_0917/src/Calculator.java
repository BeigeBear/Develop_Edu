import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("정수 두 개를 입력하세요.");
		int x = in.nextInt();
		int y = in.nextInt();
		
		int tmpSum = sum(x, y);
		int tmpMinus = minus(x, y);
		int tmpMulti = multiply(x, y);
		float tmpDiv = divide(x, y);
		
		System.out.println("더하기 : "+tmpSum);
		System.out.println("빼기 : "+tmpMinus);
		System.out.println("곱하기 : "+tmpMulti);
		System.out.println("나누기 : "+tmpDiv);
		
		in.close();
	}
	
	public static int sum(int x, int y) {
		int sum = x + y;
		return sum;
	}
	
	public static int minus(int x, int y) {
		int minus = x - y;
		return minus;
	}
	
	public static int multiply(int x, int y) {
		int multiply = x * y;
		return multiply;
	}
	
	public static float divide(int x, int y) {
		float divide = (float)x / y;
		return divide;
	}
}
