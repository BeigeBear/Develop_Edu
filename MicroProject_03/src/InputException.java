
public class InputException extends Exception {
	public InputException() {
	}
	
	public InputException(String message) {
		super(message);
	}
	
	public void method(String id) throws InputException {
		if(id.isEmpty() || id == null) {
			throw new InputException("잘못된 이름을 입력했습니다.");
		} else {
			System.out.println("입력한 아이디 : " + id);
		}
		
	}
}
