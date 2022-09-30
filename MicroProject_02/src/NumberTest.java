import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberTest {
	
	public static void main(String[] args) {
		InputException inputexcep = new InputException();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("텍스트를 입력하세요.");
		
		try {
			inputexcep.method(sc.nextInt());
			
		} catch(InputException e) {
			e.getMessage();
			e.printStackTrace();
		}
		sc.close();
	}
	
}
