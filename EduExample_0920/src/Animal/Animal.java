package Animal;

public abstract class Animal {
	String animal = "동물";
	
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다..");
	}
	
	public abstract void sound();
}
