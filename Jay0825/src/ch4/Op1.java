package ch4;

public class Op1 {

	public static void main(String[] args) {
		// 
		int a = 7, b1 = a++;
			System.out.println(a);
			System.out.println(b1);
			
		int b2 = ++a;
			System.out.println(a); //
			System.out.println(b2);

		int b3 = a--;
			System.out.println(a);
			System.out.println(b3);
			
		int b4 = --a;
			System.out.println(a);
			System.out.println(b4);
	}

}
