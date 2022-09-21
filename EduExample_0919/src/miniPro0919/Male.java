package miniPro0919;

public class Male extends Person {
	String age;
	String gender = "남자"; 
	
	public Male(String name, String ssn, String age, String gender) {
		super(name, ssn);
		this.age = age;
		this.gender = gender;
	}
	
	void helloPerson() {
		System.out.println("안녕하세요, 저는 "+name+"입니다. "+age+"살 "+gender+"입니다.");
		System.out.println("저의 주민번호는 "+ ssn + "입니다.");
	}
}
