package B_ThisJava;

public class p195_Student {
//	�����ͳ� ����� ������� �� �ִ� ��.(�ʵ�) (������ ����)(��� ����)
//	private�� Ŭ���� ��(��������).
	
	private int data1;
	private int data2;
	private int data3;
	private String data4;
	private String data5;
	private String data6;
	private String data7;
//	         Ŭ����  ���۷���
	
	
//	�޼ҵ�-����(Setter) =================================
//	�����͸� �����Ͽ� �ӽú����� ���� (a, b, c,...)
	void SetSomething(int a, int b, int c) { //����
		data1=a; // ���� �� ����, a�� �ӽ� ����
		data2=b;
		data3=c;
	}
	void SetSomething1(String d, String e, String f) {
		data4=d; // ���� �� ����, d�� �ӽ� ����
		data5=e;
		data6=f;
	}
	
//	deep copy, shallow copy
	void SetSomething2(String h) {
		data7=h;
//		���ο� ���ڿ� ��ü�� �����.
//		�� ���� ���ڿ��� ����(���� ����, deep copy)�Ѵ�.
//		�׸��� �� ���ڿ� ��ü�� data(���۷���)�� �������ش�.
		
//		.Clone( )�޼ҵ� (���ڿ� Ŭ����)
	}
	
		
		
		
		
		
		
		
		
	
//	==================================================

//	==================================================
//	�żҵ�(���) - ǲ��(putter) > ������ ��� ����
	void printSomeThing() {
		System.out.println(data1+" "+data2+" "+data3);
//		������ 3���� ����Ѵ�.
//		������ ���µ� 
	}
	void printSomeThing1() {
		System.out.println(data4+" "+data5+" "+data6);	
	}
}