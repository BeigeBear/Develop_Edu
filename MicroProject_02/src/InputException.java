
public class InputException extends Exception {
	public InputException() {
	}
	
	public InputException(String message) {
		super(message);
	}
	
	public void method(int birthyear) throws InputException {
			System.out.println("태어난 연도 : " + birthyear);
			throw new InputException("입력하신 데이터는 숫자가 아닙니다");
		}
	}
