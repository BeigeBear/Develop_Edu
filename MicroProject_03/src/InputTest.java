import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		InputException inputexcep = new InputException();
		
		System.out.println("아이디를 입력하세요.");
		
		try {
			// 아이디를 입력 받음
			inputexcep.method(sc.nextLine());
		} catch(InputException e) {
			e.getMessage();
			e.printStackTrace();
		}
		sc.close();
	}
}