package Cafeteria;

public abstract class LunchMenu {
	
	protected String rice;
	protected String bulgogi;
	protected String banana;
	protected String milk;
	protected String almond;

	public LunchMenu(String rice, String bulgogi) {
		this.rice = rice;
		this.bulgogi = bulgogi;
	}
	
	protected abstract void printPrice();
}
