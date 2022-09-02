package B_ThisJava;

public class p195_Student_ex {

	public static void main(String[] args) {
		
//		클래스로 부터 객체 생성
		p195_Student s1 = new p195_Student(); 
		System.out.println("s1 변수가 p195_Student 객체를 참조합니다.");
		
		p195_Student s2 = new p195_Student();
		System.out.println("s2 변수가 또 다른 p195_Student 객체를 참조합니다.");
		
//		=====================================================
		
//		1.Student라는 설계도(클래스)로 실제 물건(객체)를 만들어낸다.
		new p195_Student();
		
//		2.만들어진 객체에는 무조건 이름(레퍼런스)이 붙는다.
//		stu1 = new p195_Student(); 에러.
		
//		3.Student 설계도로 생성된 새로운 물건의 이름은 stu1 이다.
		p195_Student stu1 = new p195_Student();
//		stu1.data1 = 100; //소환
//		stu1.data2 = 100;
//		stu1.data3 = 100;
	
//		System.out.println("stu1의 data1 "+stu1.data1);
//		System.out.println("stu1의 data2 "+stu1.data2);
//		System.out.println("stu1의 data3 "+stu1.data3);
		
		stu1.printSomeThing();

		
	}
}