import java.util.Scanner;

public class CalculatorMain {
	
	public static void main(String[] args) {
		Calculatorlmpl calImpl = new Calculatorlmpl();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하세요");
		long n1 = sc.nextLong();
		
		System.out.println("두 번째 숫자를 입력하세요");
		long n2 = sc.nextLong();
				
		System.out.println("더하기: "+calImpl.add(n1, n2));
		System.out.println("빼기: "+calImpl.subtract(n1, n2));
		System.out.println("곱하기: "+calImpl.multiply(n1, n2));
		System.out.println("나누기: "+calImpl.divide(n1, n2));
	}

}
