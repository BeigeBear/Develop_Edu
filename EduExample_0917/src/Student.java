
public class Student {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int total;
	private float average;
	
	protected Student(int kor, int eng, int mat) {
		this.korean = kor;
		this.english = eng;
		this.math = mat;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getKorean() {
		return korean;
	}
	protected void setKorean(int korean) {
		this.korean = korean;
	}
	protected int getEnglish() {
		return english;
	}
	protected void setEnglish(int english) {
		this.english = english;
	}
	protected int getMath() {
		return math;
	}
	protected void setMath(int math) {
		this.math = math;
	}
	
	protected int total() {
		total = korean+english+math;
		return total;
	}
	
	protected float average() {
		average = (float)(korean+english+math)/3;
		return average;
	}
}
