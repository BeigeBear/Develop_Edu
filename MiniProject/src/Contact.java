
public class Contact {
	private String Name;
	private String phoneNum;
	private String Email;
	private String Address;
	private String Birthday;
	private String Group;
	
	protected String getName() {
		return Name;
	}
	protected String getPhoneNum() {
		return phoneNum;
	}
	protected String getEmail() {
		return Email;
	}
	protected String getAddress() {
		return Address;
	}
	protected String getBirthday() {
		return Birthday;
	}
	protected String getGroup() {
		return Group;
	}
	
	protected void setGroup(String tmp_group) {
		Group = tmp_group;
		System.out.println("그룹 정보 변경");
	}
	protected void setContact(String tmp_name, String tmp_phone, String tmp_email, 
			 String tmp_address, String tmp_birthday, String tmp_group) {
		Name = tmp_name;
		phoneNum = tmp_phone;
		Email = tmp_email;
		Address = tmp_address;
		Birthday = tmp_birthday;
		Group = tmp_group;
	}
	
	protected void printInfo() {
		System.out.println("================================");
		System.out.println("이름 : "+Name);
		System.out.println("전화번호 : "+phoneNum);
		System.out.println("이메일 : "+Email);
		System.out.println("주소 : "+Address);
		System.out.println("생일 : "+Birthday);
		System.out.println("그룹 : "+Group);
		System.out.println("================================");

	}
}
