package miniPro0919;

public class PersonEx {

	public static void main(String[] args) {
		Male male = new Male("임재영", "950819-1000000", "28", "남자");
		Female female = new Female("최수빈", "950922-2000000", "28", "여자");
		
		male.helloPerson();
		System.out.println();
		female.helloPerson();
	}

}
