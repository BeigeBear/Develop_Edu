
public class InputException extends Exception {
	public InputException() {
	}
	
	public InputException(String message) {
		super(message);
	}
	
	public void printMessage() throws InputException {
		throw new InputException("입력하신 데이터는 숫자가 아닙니다");
	}
}
