//	PLAY클래스에서 할일은 1명의 캐릭터를 생성한 후 정보셋팅, 출력을 해준다.
package Quiz;

public class Game_Main {

	public static void main(String[] args) {
		Game cameo1 = new Game();
		Game cameo2 = new Game();
		
		cameo1.set_Player_Info("BURGER", 77, "KIMCHI");
		cameo2.set_Player_Info("BURGER", 77, "KIMCHI");

		cameo1.change_Player_Info(77.77f);
		cameo2.change_Player_Info(70);
		
		cameo1.put_Player_Info();
		cameo2.put_Player_Info();
		
		
//		상속 테스트
		Game2 cameo3 = new Game2();
		cameo3.set_Player_Info("GU", 300, "GUN");
		cameo3.change_Player_Info(500.25f);
		cameo3.put_Player_Info();
	}

}
