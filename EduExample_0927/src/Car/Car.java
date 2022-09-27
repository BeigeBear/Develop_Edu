package Car;

public class Car {
	private String model;
	public String owner;
	
	public Car() {
	}
	
	public Car(String model) {
		this.model = model;
	}
	
	
	protected String getModel() {
		return model;
	}

	protected void setModel(String model) {
		this.model = model;
	}

	protected String getOwner() {
		return owner;
	}

	protected void setOwner(String owner) {
		this.owner = owner;
	}

}
