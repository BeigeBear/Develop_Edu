package Association_2;

import java.util.ArrayList;

public class Student {
	// field
	private String name;
	private ArrayList<Course> coruses;

	
	// Constructor
	public Student(String name) {
		this.name = name;
		coruses = new ArrayList<Course>();
	}
	
	
	// Course 연관 메소드
	public void registerCourse(Course course) {
		coruses.add(course);
	}
	
	public void dropCourse(Course course) {
		coruses.remove(course);
	}
	public ArrayList<Course> getCoruses() {
		return coruses;
	}
	
	
	
	
	
	
	
	// 겟터 셋터
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected void setCoruses(ArrayList<Course> coruses) {
		this.coruses = coruses;
	}
}