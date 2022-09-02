package B_ThisJava;

public class p195_Student_ex2 {

	public static void main(String[] args) {
		
//		얕은 복사 깊은 복사
//		String str = "lim";
		String str2 = new String("lim");
		
		p195_Student stu1 = new p195_Student( ); // 객체 1개 생성 후 연결
//		stu1.printSomeThing(); // 출력
		stu1.SetSomething(1, 2, 3); // 데이터 셋팅함
		stu1.printSomeThing(); // 출력
		
		// 객체가 두개지만 클래스가 같아서 데이터가 같다.
		
		p195_Student stu3 = new p195_Student( ); // 객체 1개 생성 후 연결
//		stu3.printSomeThing1(); // 출력
		stu3.SetSomething1("강남구", "송파구", "서초구"); // 데이터 셋팅함
		stu3.printSomeThing1(); // 출력
		
	}
}