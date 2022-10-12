package P299_Airplane;

class A {}

class B extends A {}
class C extends A {}

class D extends B {}
class E extends C {}


public class P308_PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
//		부모 타입으로 자동 타입 변환된이후에는 부모 클래스에 선언된 필드와 메소드만 접근이 가능하다.
//		비록 변수는 자식 객체를 참조하지만 변수로 접근가능한 멤보는 부모클래스 멤버로만 한정된다.
//		그러나 예외가 있는데. 메소드가 자식 클래스에서 오버라이딩 되었다면 자식 클래스의 메소드가 대신 호출된다.
		
		// 컴파일 에러(상속관계에 있지 않은, 아무런 관계성이 없다)
//		B b2 = e;
//		C c2 = d;
		
	}
}