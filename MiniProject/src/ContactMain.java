public class ContactMain {

	public static void main(String[] args) {
		
	Contact contact = new Contact("임재영", "010-5327-2679", "cameogu@gmail.com", "서울시 송파구", "1995-08-19", "가족");
	
	System.out.println("이름 : " + contact.getName());
	System.out.println("전화번호 : " + contact.getPhoneNumber());
	System.out.println("이메일 : " + contact.getEmail());
	System.out.println("주소 : " + contact.getAddress());
	System.out.println("생일 : " + contact.getName());
	System.out.println("그룹 : " + contact.getGroup());
	
	System.out.println("======================================");
	System.out.println("그룹 정보 변경");
	
	contact.setGroup("친구");
	
	System.out.println("======================================");
	contact.printInfo();
	}
}
