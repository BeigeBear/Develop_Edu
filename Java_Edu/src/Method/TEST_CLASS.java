package Method;

public class TEST_CLASS {
	
//	데이터 2개 (int, int)
	private String user_name;
	private int health;
	private int age;
	private float height;
	private float weight;
	
//	메소드 이름(Set_User_Info)
//	메소드의 기능(이름과 건강수치를 전달받아서 출력함)
//	반환 값은 없음
	
	void Set_User_Info(String n, int h) {
		System.out.println(n+" "+h);
	}
	
//	메소드 오버로딩이라는 기능을 사용해보자.
//	같은 이름의 메소드가 2개이상 존재하는 경우를 얘기한다.
//	이름은 같지만, 서로 다른 기능을 하거나 약간 추가된 기능을 가지는 경우가 대부분이다.
	
	void Set_User_Info(String n, float h) {
		System.out.println(n+" "+h);
	}
	
	
//================================================================================

	void Process_User_Info() {
		System.out.println("success!");
	}
	
//================================================================================
//	새로운 기능 추가
	
//	기존의 Set_User_Info는 단지 전달받아서 출력만 하기 때문에 어떤 처리를 한다고 볼 수는 없다.
//	별도로 어떤 처리를 해주고 그 결과를 돌려주는 메소드를 만들어보자.
//	메소드 이름 : Process_User_Info()
//	이 메소드는 이름,나이,키,몸무게를 전달받아서 건강수치를 계산 한 후 그 결과를 돌려주도록 되어있다.
//	돌려주는 결과값은 float타입이어야함
	
	float Process_User_Info(String na, int ag, float he, float we) {
		float result = ((he-100)/we)*ag;
		return result;
	}

	
//	오버로딩 (1)
//	또 하나의 Process_User_Info 메소드를 만듬.
//	정보를 모두 정수로 전달.
//	반환값도 정수

	int Process_User_Info(String na, int ag, int he, int we) {
		int result = ((he-100)/we)*ag;
		return result;
	}
	
	
	
	

	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}













