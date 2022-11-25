package jspbook.ch07;

public class LoginBean {
	
	private String userid;
	private String passwd;
	
	final String _userid = "JSP";
	final String _passwd = "12345";
	
	public boolean checkUser() {
		if(userid.equals(_userid) && passwd.equals(_passwd)) {
			return true;
		} else {
			return false;
		}
	}

	public String getUserid() {
		return userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
}
