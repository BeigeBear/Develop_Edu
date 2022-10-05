package Serialization;

import java.io.Serializable;

public class ClassA implements Serializable {
	int field1;
	ClassB field2 = new ClassB();
	static int field3;
	transient int field4; // 패스워드이면 출력되면 안되니까 선언한다.
}
