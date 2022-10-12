package P310_Parent;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		
		parent.method1(); // 부모 메소드 호출
		parent.method2(); // 부모 메소드가 오버라이드 된 자식 메소드 호출
//		parent.method3(); // 자식 메소드 호출 불가
	}

}
