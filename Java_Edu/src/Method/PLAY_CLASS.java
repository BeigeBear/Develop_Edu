package Method;

public class PLAY_CLASS {
	public static void main(String[] args) {
		
		TEST_CLASS cameo1 = new TEST_CLASS();
		TEST_CLASS cameo2 = new TEST_CLASS();
		
//		실수형 버전의 메소드 실행
//		cameo1.Set_User_Info("lim", 123.45f);
//		정수형 버전의 메소드
//		cameo2.Set_User_Info("kim", 123);
			
		
		float result_cameo1 = cameo1.Process_User_Info("lim", 10, 120.15f, 20.5f);
		int result_cameo2 = cameo2.Process_User_Info("lim", 10, 120, 20);
		
		System.out.println("result_cameo1 : " + result_cameo1);
		System.out.println("result_cameo2 : " + result_cameo2);
		cameo1.Process_User_Info();
	}
}