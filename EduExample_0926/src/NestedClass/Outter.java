package NestedClass;

public class Outter {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method 출력");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
