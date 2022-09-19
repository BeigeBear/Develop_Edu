package miniPro0919;

public class StudentEx {

	public static void main(String[] args) {
		Student student = new Student("임재영", "950819", 154);
		System.out.println("name : "+ student.name);
		System.out.println("ssn : "+ student.ssn);
		System.out.println("studentNo : "+ student.studentNo);
	}
}