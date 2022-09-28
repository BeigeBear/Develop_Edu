import java.util.Scanner;

public class NumberTest {
	
	public static void main(String[] args) {
		InputException inputexception = new InputException();
		Scanner sc = new Scanner(System.in);
		try {
//			System.out.println("숫자를 입력하세요.");
//			int num = sc.nextInt();
			inputexception.printMessage();
		} catch(InputException e) {
			String meassage = e.getMessage();
			System.out.println(meassage);
		}
		sc.close();
	}

	
}
