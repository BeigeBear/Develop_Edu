package Animal;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		dog.breathe();
		cat.breathe();
		System.out.println("=====");
		
		//변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();
		// 힙메모리의 주소를 리턴해준다.
		animal.sound();
		animal.breathe();
		
		animal = new Cat();
		animal.sound();
		animal.breathe();
		System.out.println("=====");
		
		//메소드의 다형성
		animalSound(new Dog());
		// 아래 코드와 같은 것
		// animal = new Dog();
		// animal.sound();
		animalSound(new Cat());
		
		System.out.println("=====");
		System.out.println(dog.kind);
		System.out.println(cat.kind);

		

	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
