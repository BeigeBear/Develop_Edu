package Member;

public class Member {
	String m_name;
	String m_id;
	String m_password;
	
//	기능 영역
	// p_Name Getter
	protected String getMemberName() {
		return m_name;
	}
	// p_Name Setter
	protected void setMemberName(String Name) {
		this.m_name = Name;
	}
	
	
	// Price Getter
	protected String getMemberId() {
		return m_id;
	}
	// Price Setter
	protected void setMemberId(String id) {
		this.m_id = id;
	}
	
	
	// Num Getter
	protected String getMemberPassword() {
		return m_password;
	}
	// Num 
	protected void setMemberPassword(String pass) {
		this.m_password = pass;
	}
	
	// 통합 Setter
	protected void setMemberInfo(String name, String id, String pass) {
		this.m_name = name;
		this.m_id = id;
		this.m_password = pass;
	}

//	출력 영역
	protected void putMemberInfo() {
		System.out.println("회원 이름 : " + m_name);
		System.out.println("아이디 : " + m_id);
		System.out.println("비밀번호 : " + m_password);
	}
	
	
	
}
