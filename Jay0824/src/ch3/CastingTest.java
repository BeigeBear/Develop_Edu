package ch3;

public class CastingTest {

	public static void main(String[] args) {
		int a = 12, b = 13;
		float c =0;
		//�ڵ� ����ȯ
		//�º��� float, �캯�� int
		//�캯 ��� �����(int)�� float���� ��ȯ�Ǿ� �º�c�� ����
		c = (a+b)/2;
		//����/������ ����
		//����/�Ǽ��� �Ǽ�
		//�Ǽ�/�Ǽ��� �Ǽ�
		
		System.out.println("a�� b�� ����� "+c+" �̴�.");
		
		float f = 12.5f;
		a = (int)f;
		System.out.println("a= "+a);
		
	}

}


//������ expr++
//���������� %�� �������� ���Ѵ�.
// & ���ۼ�Ʈ
// ^ �ͽ�Ŭ��ú�
// |