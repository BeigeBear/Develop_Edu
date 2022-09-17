public class Person {
	
	String Name = "정보없음";
	String phoneNumber = "정보없음";
	String Major = "정보없음";
	int Grade = 0;
	String Email = "정보없음";
	String Birthday = "정보없음";
	String Address = "정보없음";
	
//	public static void main(String[] args) {
//		Person person1 = new Person("임재영", "010-5327-2679", "광고사진영상학", 3, "cameogu@gmail.com", "1995-08-19", "서울시 강남구");
//		Person person2 = new Person("임준영", "010-9507-2679", "전자공학", 1, "sck06041@naver.com");
//		
//		person1.printAllInfo();
//		System.out.println("=====================================");
//		person2.printAllInfo();
//	}

	public Person(String name, String phonenum, String major, int grade, 
			String eamil, String birthday, String address) {
		this.Name = name;
		this.phoneNumber = phonenum;
		this.Major = major;
		this.Grade = grade;
		this.Email = eamil;
		this.Birthday = birthday;
		this.Address = address;
	}
	
	public Person(String name, String phonenum, String major, int grade, 
			String eamil) {
		this.Name = name;
		this.phoneNumber = phonenum;
		this.Major = major;
		this.Grade = grade;
		this.Email = eamil;
	}
	
	public void printAllInfo() {
		System.out.println("생일 : "+ Name);
		System.out.println("전화번호 : "+ phoneNumber);
		System.out.println("전공 : "+ Major);
		System.out.println("학년 : "+ Grade);
		System.out.println("이메일 : "+ Email);
		System.out.println("생일 : " + Birthday);
		System.out.println("주소 : " + Address);
	}
	
}