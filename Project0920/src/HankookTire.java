
public class HankookTire extends Tire {
	// 필드
	// 생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumlatedRotation;
		if(accumlatedRotation<maxRotation) {
			System.out.println(location + " HankookTire 수명: " +(maxRotation-accumlatedRotation)+ "회");
			return true;
		} else {
			System.out.println("*** " + location + " HankoolTire 펑크 ***");
			return false;
		}
	}
}
