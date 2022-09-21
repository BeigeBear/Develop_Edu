
public class Member {

	public static void main(String[] args) {
		String name = "임재영";
		int age = 22;
		double heignt = 180.57850;
		boolean hasbook = true;
		int birthyear = 1994;
		
		System.out.println("나의 이름은 "+name+" 입니다.");
		System.out.print("나이는 "+age+"살 입니다. ");
		System.out.println("키는 "+heignt+"cm 입니다.");
		System.out.println("'이것이 자바다'책을 가지고 있습니다." + hasbook + "\n");
		
		checkVaccin(birthyear);
		healthCheck(birthyear);
	}
	
	
	
	public static void checkVaccin(int birthyear) {
		if(birthyear>=2010) {
			if(birthyear<=1963) {
				System.out.println("무료 예방접종이 가능합니다.");
				}
		} else {
			System.out.println("무료 접종 대상이 아닙니다.");
		}	
	}
	
	public static void healthCheck(int birthyear) {
		if(birthyear<=2003) {
			if(birthyear%2 == 0) {
				System.out.println("올해 건강검진 대상입니다.");
			}
			if(birthyear<1983) {
				System.out.println("40세 이상은 암 검진이 추가됩니다.");
			}
		} else {
			System.out.println("올해 건강검진 대상이 아닙니다.");
		}
	}
}
	
	
	
	
	
	
	
	
	

