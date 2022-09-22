import java.util.ArrayList;

public class Course {
	// field
	private String course;
	private ArrayList<Transcript> transcripts;
	
	// Constructor
	public Course(String course) {
		this.course = course;
		transcripts = new ArrayList<Transcript>();
	}
	
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}

	protected String getCourse() {
		return course;
	}
	
	
}
