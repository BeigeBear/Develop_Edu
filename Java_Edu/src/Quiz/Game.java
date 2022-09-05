// 퀴즈(메소드와 오버로딩을 이용한 코딩)
package Quiz;

public class Game {
	
//	(1) 게임 캐릭터의 정보를 저장할 수 있는 클래스를 작성.
//		저장한 정보는 캐릭터의 이름, 체력 무기의 종류
	private String user_Name;
	private float user_Stamina;
	private String user_Weapon;
	
//	(2) 캐릭터의 정보를 저장할 수 있는 메소드(set_Player_Info)
//		이 메소드는 이름, 체력, 무기 종류를 전달받아서 저장해준다.
	void set_Player_Info(String na, int st, String we) {
		user_Name = na;
		user_Stamina = st;
		user_Weapon = we;
	}
		
//	(3) 캐릭터의 정보를 출력할 수 있는 메소드(put_Player_Info)
//		캐릭터의 모든 정보를 출력해준다.
	void put_Player_Info() {
		System.out.println(user_Name +"\n"+ user_Stamina +"\n"+ user_Weapon);
	}

//================================================================================
//	(4) 오버로딩 될 메소드를 작성해준다.
//		메소드 이름(change_Player_Health)
//		이 메소드는 실수값을 전달받아서 그 값으로 체력을 셋팅해준다.(변경)
	void change_Player_Info(int st) {
		user_Stamina = st;
	}
	
	void change_Player_Info(float st) {
		user_Stamina = st;
	}
}






