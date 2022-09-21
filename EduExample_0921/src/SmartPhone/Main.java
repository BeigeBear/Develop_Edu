package SmartPhone;

public class Main {
	public static void main(String[] args) {
		iFunction[] ifunctions = new iFunction[3];
		
		ifunctions[0] = new APhone();
		ifunctions[1] = new BPhone();
		ifunctions[2] = new CPhone();
		
		for(iFunction ifunction : ifunctions) {
			ifunction.phoneCall();
			ifunction.connectionSpeed();
			ifunction.remoteControlTv();
			System.out.println();
		}
	}

}
