package Comoarable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("임재영", 28));
		treeSet.add(new Person("박지원", 31));

		Iterator<Person> iterator = treeSet.iterator()
		while(iterator.hasNext()) {
			
		}
	}

}
