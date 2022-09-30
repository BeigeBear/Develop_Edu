package TreeSet;

import java.util.TreeSet;

public class TreeSetExample1 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(new Integer(87));
		scores.add(new Integer(90));
		scores.add(new Integer(50));
		scores.add(new Integer(30));
		scores.add(new Integer(85));
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("가장 낮은 점수 : "+score);
		
		score = scores.last();
		System.out.println("가장 높은 점수 : "+score + "\n");
		
		score = scores.lower(new Integer(95));
		System.out.println("95점 아래 점수 : "+score);
		

	}
}
