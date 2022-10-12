package Animal;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		dog.breathe();
		cat.breathe();
		System.out.println("=====\n");
		
		Animal animal1 = new Dog();
		Dog dog1 = (Dog) new Animal();
		
		
		//변수의 자동 타입 변환
		Animal animal = null;
		
		System.out.println("\n====강아지=====");
		animal = new Dog();
		// 힙메모리의 주소를 리턴해준다.
		animal.sound();
		animal.breathe();
		System.out.println(animal.animal);

		System.out.println("\n====고양이=====");
		animal = new Cat();
		animal.sound();
		animal.breathe();
		System.out.println(animal.animal); // 부모타입의 필드 사용
		Cat cat2 = new Cat();
		System.out.println(cat2.animal);
		Cat dog2 = Animal();
		
		System.out.println("\n=============");
		
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
