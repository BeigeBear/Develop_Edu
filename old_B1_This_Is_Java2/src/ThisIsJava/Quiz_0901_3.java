package ThisIsJava;

import java.util.Scanner;

public class Quiz_0901_3 {
	
	public static void main(String[] args) {
		
		String tmp = null;
		String[] names = new String[3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("3���� ȸ�� �̸��� �Է��Ͻÿ�");
		
		for(int i=0; i<=2; i++) {
//		for(int i=0; i<=(names.length-1); i++) {
			tmp = sc.nextLine();
			names[i]=tmp;
		}
		for(int i=0; i<=2; i++) {
//		for(int i=0; i<=(names.length-1); i++) {
			System.out.println("�̸� "+ names[i]);
		}
	}
}
















//ȸ���� �̸��� 3���� �����غ���.
//3���� �̸��� �Է¹޾Ƽ� �迭�� �����غ���.
//3�� �ݺ�>> 1ȸ���� �̸��� �Է¹ް� �������ֱ�

		
		
		
		
		
		
		
//		
//		System.out.println("�ʱ� ���� �Է��ϼ���.");
//		suu= sc.nextInt();
//		
//		for(int i=1; i<=suu; i++) {
//			System.out.print(i+" ");
