
public class Contact {

	private String name = "없음";
	private String phoneNumber = "없음";
	private String email = "없음";
	private String address = "없음";
	private String birthday = "없음";
	private String group = "없음";
	
	//생성자
	public Contact(String name, String phoneNumber, String email, String address,
			String birthday, String Group) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.group = Group;
	}
	
	// 출력 메소드
	protected void printInfo() {
		System.out.print("이름 : "+ name);
		System.out.println("  |  전화번호 : "+ phoneNumber);
		System.out.println("이메일 : "+ email);
		System.out.println("주소 : "+ address);
		System.out.println("생일 : "+ birthday);
		System.out.println("그룹 : "+ group);
	}
	
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getPhoneNumber() {
		return phoneNumber;
	}
	protected void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	protected String getEmail() {
		return email;
	}
	protected void setEmail(String email) {
		this.email = email;
	}
	protected String getAddress() {
		return address;
	}
	protected void setAddress(String address) {
		this.address = address;
	}
	protected String getBirthday() {
		return birthday;
	}
	protected void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	protected String getGroup() {
		return group;
	}
	protected void setGroup(String group) {
		this.group = group;
	}
}
