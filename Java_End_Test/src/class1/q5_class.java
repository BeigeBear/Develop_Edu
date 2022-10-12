package class1;

public class q5_class {
	public static void main(String[] args) {
		q5_Super sup = new q5_Sub();
		System.out.print(sup.index+" ");
		sup.printValue();
	}
}
