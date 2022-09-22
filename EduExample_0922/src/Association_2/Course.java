package Association_2;

import java.util.ArrayList;

public class Course {
	// field
	private String course;
	private ArrayList<Student> names;
	

	// Constructor
	public Course(String course) {
		this.course = course;
		names = new ArrayList<Student>();
	}
	
	
	// 연관 메소드
	public void addStudent(Student name) {
		names.add(name);
	}
	public void removeStudent(Student name) {
		names.remove(name);
	}
	public ArrayList<Student> getNames() {
		return names;
	}
	
	
	
	
	
	
	
	x
	// 겟터 셋터
	protected String getCourse() {
		return course; 
	}
	protected void setCourse(String course) {
		this.course = course;
	}

	protected void setNames(ArrayList<Student> names) {
		this.names = names;
	}
}
