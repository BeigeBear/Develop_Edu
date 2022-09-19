package miniPro0919;

public class SupersonicAirplaneEx {

	public static void main(String[] args) {
		SupersonicAirplane airbus = new SupersonicAirplane();
		airbus.takeOff();
		airbus.fly();
		airbus.flyMode = SupersonicAirplane.SUPERSONIC;
		airbus.fly();
		airbus.flyMode = SupersonicAirplane.NORMAL;
		airbus.fly();
		airbus.land();
	}
}
