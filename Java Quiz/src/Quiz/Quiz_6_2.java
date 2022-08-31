package Quiz;

public class Quiz_6_2 {

//	public static void main(String[] args) {
//		int[] arr = {5, 4, 3, 2, 1 };
//		int i;
//		for(i = 0; i <5; i++) {
//			System.out.print(arr[i] + "\t");
//		}
//
//	}
//	
	public static void main(String[] args) {
		int[] a = new int[5];
		
		for (int i=0; i< a.length; i++) {
			a[i] = 5-i;
		}
		for (int i=0; i< a.length; i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
			
	}

}

