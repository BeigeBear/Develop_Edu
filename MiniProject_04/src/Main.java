
public class Main {
	protected static void printTranscript(Transcript transcript) {
		System.out.println("이름 : "+transcript.getStudent().getStudent());
		System.out.println("과목 : "+transcript.getCourse().getCourse());
		System.out.println("수강연도 : "+transcript.getDate());
		System.out.println("학점 : "+transcript.getGrade()+"\n");
	}
	
	public static void main(String[] args) {
		Student student1 = new Student("홍길동");
		Student student2 = new Student("홍길서");
		Student student3 = new Student("홍길남");
		Student student4 = new Student("홍길북");
		
		Course course1 = new Course("사진영상론");
		Course course2 = new Course("미디어커뮤니케이션");
		Course course3 = new Course("동영상촬영편집실기");
		
		Transcript trans1 = new Transcript(student1, course1);
		Transcript trans2 = new Transcript(student2, course2);
		Transcript trans3 = new Transcript(student3, course1);
		Transcript trans4 = new Transcript(student3, course3);
		
		trans1.setGrade("A+");
		trans1.setDate("2022");
		trans2.setGrade("D");
		trans2.setDate("2022");
		trans3.setGrade("B");
		trans3.setDate("2022");
		trans4.setGrade("C+");
		trans4.setDate("2022");
		
		printTranscript(trans1);
		printTranscript(trans2);
		printTranscript(trans3);
		printTranscript(trans4);
		
//		Main main = new Main();
//		main.printTranscript(trans1);
//		main.printTranscript(trans2);
//		main.printTranscript(trans3);
//		main.printTranscript(trans4);
		
		
		
		
	
	}
}
