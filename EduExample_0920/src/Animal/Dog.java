package Animal;

public class Dog extends Animal {
	String animal = "강아지";
	
	public Dog() {
		this.kind = "강아지";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
