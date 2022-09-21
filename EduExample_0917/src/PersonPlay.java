
public class PersonPlay {

	public static void main(String[] args) {
		String Name = "정보없음";
		String phoneNumber = "정보없음";
		String Major = "정보없음";
		int Grade = 0;
		String Email = "정보없음";
		String Birthday = "정보없음";
		String Address = "정보없음";
		
		
		
		Person person1 = new Person("임재영", "010-5327-2679", "광고사진영상학", 3, "cameogu@gmail.com", "1995-08-19", "서울시 강남구");
		Person person2 = new Person("임준영", "010-9507-2679", "전자공학", 1, "sck06041@naver.com");
		
		person1.printAllInfo();
		System.out.println("=====================================");
		person2.printAllInfo();

	}
}