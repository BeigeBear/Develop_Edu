package B_ThisJava;

public class p195_Student_ex {

	public static void main(String[] args) {
		
//		Ŭ������ ���� ��ü ����
		p195_Student s1 = new p195_Student(); 
		System.out.println("s1 ������ p195_Student ��ü�� �����մϴ�.");
		
		p195_Student s2 = new p195_Student();
		System.out.println("s2 ������ �� �ٸ� p195_Student ��ü�� �����մϴ�.");
		
//		=====================================================
		
//		1.Student��� ���赵(Ŭ����)�� ���� ����(��ü)�� ������.
		new p195_Student();
		
//		2.������� ��ü���� ������ �̸�(���۷���)�� �ٴ´�.
//		stu1 = new p195_Student(); ����.
		
//		3.Student ���赵�� ������ ���ο� ������ �̸��� stu1 �̴�.
		p195_Student stu1 = new p195_Student();
//		stu1.data1 = 100; //��ȯ
//		stu1.data2 = 100;
//		stu1.data3 = 100;
	
//		System.out.println("stu1�� data1 "+stu1.data1);
//		System.out.println("stu1�� data2 "+stu1.data2);
//		System.out.println("stu1�� data3 "+stu1.data3);
		
		stu1.printSomeThing();

		
	}
}