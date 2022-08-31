
public class Op4 {

	public static void main(String[] args) {
		int a = 10, b = 20;
		
		// &&
		System.out.println(a==10 && b==20); // O O > O
		System.out.println(a>10 && b==20); // X O > X
		System.out.println(a==10 && b==10); // O X > X
		System.out.println(a<10 && b>20); // X X > X
		
		// ||
		System.out.println(a==10 || b==20); // O O(계산하지 않음) > O
		System.out.println(a>10 || b==20); // X O > O
		System.out.println(a==10 || b==10); // O X(계산하지 않음) > O
		System.out.println(a<10 || b>20); // X X < O
		
	}

}
