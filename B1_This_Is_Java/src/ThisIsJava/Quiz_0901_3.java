package ThisIsJava;

import java.util.Scanner;

public class Quiz_0901_3 {
	
	public static void main(String[] args) {
		
		String tmp = null;
		String[] names = new String[3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("3명의 회원 이름을 입력하시오");
		
		for(int i=0; i<=2; i++) {
//		for(int i=0; i<=(names.length-1); i++) {
			tmp = sc.nextLine();
			names[i]=tmp;
		}
		for(int i=0; i<=2; i++) {
//		for(int i=0; i<=(names.length-1); i++) {
			System.out.println("이름 "+ names[i]);
		}
	}
}
















//회원의 이름을 3개만 저장해보자.
//3명의 이름을 입력받아서 배열에 저장해보자.
//3번 반복>> 1회마다 이름을 입력받고 저장해주기

		
		
		
		
		
		
		
//		
//		System.out.println("초기 값을 입력하세요.");
//		suu= sc.nextInt();
//		
//		for(int i=1; i<=suu; i++) {
//			System.out.print(i+" ");
