package ArrayList_Play;

import java.util.ArrayList;

// 728 ~ 729p
// 727 자바 버전에 다른 차이
public class ArrayList_Play {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>( );
		
		names.add("kim");
		names.add("lee");
		names.add("park");
		
		String s = names.get(0); // [0]번방의 객체를 가지고 온다.
		System.out.println(s);	 // 가지고 온것을 출력.
		
		System.out.println("현재 갯수 "+names.size() );
		
		for(int i=0; i<names.size(); i++) {
			System.out.println("현재 객체는 "+names.get(i) );
		}
		
		names.remove(1);
		
		for(int i=0; i<names.size(); i++) {
			System.out.println("현재 객체는 "+names.get(i) );
		}
	}
}