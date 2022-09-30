
public class Contact implements ShowData {

	// 필드
	private String name;
	private String phoneNumber;
	private String email;
	private String address;
	private String birthday;
	private String group;
	
	//생성자
	protected Contact(String name, String phoneNumber, String email, String address,
			String birthday, String group) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.group = group;
	}
		
	// 출력 메소드
	protected void printInfo() {
		System.out.println("이름 : "+ name);
		System.out.println("전화번호 : "+ phoneNumber);
		System.out.println("이메일 : "+ email);
		System.out.println("주소 : "+ address);
		System.out.println("생일 : "+ birthday);
		System.out.println("그룹 : "+ group);
	}
	
	// 갯터/셋터
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
	
	// showData 메소드 구현
	@Override
	public void showData() {
		System.out.println("이름 : "+ name);
		System.out.println("전화번호 : "+ phoneNumber);
	}
}















