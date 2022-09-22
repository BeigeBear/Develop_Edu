import java.util.ArrayList;

public class Student {
	// field
	private String student;
	private ArrayList<Transcript> transcripts;

	// Constructor
	public Student(String student) {
		this.student = student;
		transcripts = new ArrayList<Transcript>();
	}

	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}
	
	/*
	public ArrayList<Course> getCoruses() {
		for()
			if()
		return courses;
	}
	*/
	
	protected String getStudent() {
		return student;
	}
}
