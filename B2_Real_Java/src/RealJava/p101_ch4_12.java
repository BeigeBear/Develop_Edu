package RealJava;

public class p101_ch4_12 {

	public static void main(String[] args) {
		int i, j; 
		//for���� ���������� �ۿ���.
		
		for(i=0;i<4;i++) {				// 4����� �ۼ�
			for(j=1;j<=i+1;j++) {		// ���� ����鼭 * �ϳ��� ��������
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}