package Quiz;

//������ : ������ ���� 2�� (int a, int b)
//������(�ΰ��� ���ڸ��ʱ�ȭ���ִ� ���Ҹ� ��. 0���� �ʱ�ȭ����)
//����(�ΰ��� ���ڸ� ���޹޾Ƽ� a.b�� ���� ��������)
//ǲ��(��Ģ������ ����� �������)

public class sasa {
	private int a;
	private int b;
	private int plus;
	private int minus;
	private int times;
	private int divide;
	
//	������(�ʱⰪ����)
	public sasa() {
		a = 0; b = 0;
		plus=0; minus=0; times=0; divide=0;
	}

//	���� �� ����
	void Set(int aa, int bb) {
		a = aa; //�ӽú���
		b = bb;
	}
	
//	����
	void Process() {
		plus = (a+b);
		minus = (a-b);
		times = (a*b);
		divide = (a/b);
	}
	
//	���
	void print() {
		System.out.println("�� ������ ���� "+plus+" �Դϴ�.");
		System.out.println("�� ������ ���� "+minus+" �Դϴ�.");
		System.out.println("�� ������ ���� "+times+" �Դϴ�.");
		System.out.println("�� ������ ������ "+divide+" �Դϴ�.");
	}
}