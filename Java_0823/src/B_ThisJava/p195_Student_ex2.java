package B_ThisJava;

public class p195_Student_ex2 {

	public static void main(String[] args) {
		
//		���� ���� ���� ����
//		String str = "lim";
		String str2 = new String("lim");
		
		p195_Student stu1 = new p195_Student( ); // ��ü 1�� ���� �� ����
//		stu1.printSomeThing(); // ���
		stu1.SetSomething(1, 2, 3); // ������ ������
		stu1.printSomeThing(); // ���
		
		// ��ü�� �ΰ����� Ŭ������ ���Ƽ� �����Ͱ� ����.
		
		p195_Student stu3 = new p195_Student( ); // ��ü 1�� ���� �� ����
//		stu3.printSomeThing1(); // ���
		stu3.SetSomething1("������", "���ı�", "���ʱ�"); // ������ ������
		stu3.printSomeThing1(); // ���
		
	}
}