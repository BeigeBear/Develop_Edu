public class Transcript {
	// field
	private Student student;
	private Course course;
	private Transcript transcript;
	private String grade;
	private String date;
	
	// 생성자
	public Transcript(Student student, Course course) {
		this.student = student;
		this.student.addTranscript(transcript);
		this.course = course;
		this.course.addTranscript(transcript);
	}
	// 겟터 셋터
	public Student getStudent() {
		return student;
	}
	
	public Course getCourse() {
		return course;
	}

	protected void setDate(String date) {
		this.date = date;
	}
	
	protected String getDate() {
		return date;
	}
	
	protected void setGrade(String grade) {
		this.grade = grade;
	}
	
	protected String getGrade() {
		return grade;
	}
}
