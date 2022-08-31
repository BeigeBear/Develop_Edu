package ThisIsJava;
public class p100_For6 {
	public static void main(String[] args) {
		int i, j;
		for(i=0;i<10;i++) {				// 행
			for(j=2;j<10;j++) {
				if(i==0) { 					//i가 0일때
					System.out.print(j+"단\t");
				} else {
					System.out.print(j+"*"+i+"="+(j*i+"\t"));
				}
			}
			System.out.println();
		}
	}
}