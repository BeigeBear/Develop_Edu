package miniPro0919;

public class Person {
	String name;
	String ssn;
	
	public Person(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	void helloPerson(String age) {
		System.out.println("안녕하세요, 저는 "+name+"입니다. "+age+"살 입니다.");
		System.out.println("저의 주민번호는 "+ ssn + "입니다.");
	}
}
