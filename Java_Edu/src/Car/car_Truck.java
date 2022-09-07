package Car;

public class car_Truck extends car {

	private float bucket = 0;
	
	protected void bucketIn(float box) {
		if(box < 0) { // 음수일 때.
			System.out.println("상차수량을 다시 확인해주세요.\n");
			return;
		} else if(1500-bucket < box) { // 적재 초과
			System.out.println("최대 적재량을 초과했습니다");
			System.out.println("현재 적재량 : "+ bucket +"kg");
			System.out.println("남은 적재량 : "+ (1500 - bucket) +"kg\n");
			return;
		} else {
			bucket += box;
			System.out.println("트럭에 "+ box + "kg이 상차되었습니다.");
			System.out.println("현재 적재량 : "+ bucket + "kg");
			System.out.println("남은 적재량 : "+ (1500 - bucket) +"kg\n");
		}
	}
		
	protected void bucketOut(float box) {
		if(box < 0) { // 양수일 때.
			System.out.println("하차 수량을 다시 확인해주세요.\n");
			return;
		} else if(bucket < box) { // 적재 초과
			System.out.println(box + "kg이 적재되어 있지 않습니다.");
			System.out.println("현재 적재량 : "+ bucket +"kg\n");
			return;
		} else {
			bucket -= box;
			System.out.println("트럭에서 "+ box + "kg이 하차되었습니다.");
			System.out.println("현재 적재량 : "+ bucket + "kg\n");
		}
	}
	
	protected void bucketFullOver() {
		if(bucket == 0) { // 양수일 때.
			System.out.println("적재되어 있지 않습니다.\n");
			return;
		} else {
			System.out.println("모두 하차하였습니다.");
			System.out.println("하차량 : "+ bucket + "kg");
			bucket -= bucket;
			System.out.println("현재 적재량 : "+ bucket + "kg\n");
		}
	}
}