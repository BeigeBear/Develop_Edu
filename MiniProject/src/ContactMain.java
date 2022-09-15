public class ContactMain {
	String name;
	String phone;
	String email;
	String address;
	String birthday;
	String group;

	public ContactMain(String tmp_name, String tmp_phone, String tmp_email, 
			 String tmp_address, String tmp_birthday, String tmp_group) {
		this.name = tmp_name;
		this.phone = tmp_phone;
		this.email = tmp_email;
		this.address = tmp_address;
		this.birthday = tmp_birthday;
		this.group = tmp_group;
	}

	public static void main(String[] args) {
		
		Contact friend = new Contact();

//		tmp_name = "임재영";
//		tmp_phone = "010-5327-2679";
//		tmp_email = "cameogu@gmail.com";
//		tmp_address = "강남구";
//		tmp_birthday = "1995/08/19";
//		tmp_group = "가족";

//		friend.setContact(tmp_name, tmp_phone, tmp_email, tmp_address,
//				tmp_birthday, tmp_group);
		
		// 최초
		friend.printInfo();
		
		friend.setGroup("친구");
		
		// 최종
		friend.printInfo();
	}

}
