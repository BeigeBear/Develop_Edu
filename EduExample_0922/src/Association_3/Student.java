package Association_3;

import java.util.List;

public class Student {
	// field
	private List<Course> course;

	// Constructor
	public Student() {
	}
	
	
	// Course 연관 메소드
	public void registerCourse(Course course) {
		this.course.add(course);
	}
	
	public void dropCourse(Course course) {
		this.course.remove(course);
	}
	
	
	// getter setter
	public List<Course> getCourse() {
		return course;
	}
	
	public void setCourse(List<Course> course) {
		this.course = course;
	}
}
