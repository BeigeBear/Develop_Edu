public class CustomerContact extends Contact {
	// 필드 선언
	private String CustomerName;
	private String CustomerItem;
	private String CustomerLevel;
	
	// 생성자 선언
	public CustomerContact(String name, String phoneNumber, String email, String address, String birthday, 
			String group, String customername, String customeritem, String customerlevel) {
		super(name, phoneNumber, email, address, birthday, group);
		this.CustomerName = customername;
		this.CustomerItem = customeritem;
		this.CustomerLevel = customerlevel;
	}
	
	// 출력 메소드
	@Override
	protected void printInfo() {
		super.printInfo();
		System.out.println("거래처이름 : "+ CustomerName);
		System.out.println("거래품목 : "+ CustomerItem);
		System.out.println("직급 : "+ CustomerLevel);
	}
	
	// 겟터 셋터
	protected String getCustomerName() {
		return CustomerName;
	}
	protected void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	protected String getCustomerItem() {
		return CustomerItem;
	}
	protected void setCustomerItem(String customerItem) {
		CustomerItem = customerItem;
	}
	protected String getCustomerLevel() {
		return CustomerLevel;
	}
	protected void setCustomerLevel(String customerLevel) {
		CustomerLevel = customerLevel;
	}
}
