package NestedClass;

public class Main {

	public static void main(String[] args) {
		// Outter클래스 객체
		Outter Out = new Outter();
		// Outter클래스의 Nested클래스 객체
		Outter.Nested nest = Out.new Nested();
		
		// 1차 클래스
		Out.method();

		
		System.out.println();
		nest.print();
	
		
	}

}
