public class CompanyContact extends Contact {
	// 필드 선언
	private String companyName;
	private String companyDepartment;
	private String companyLevel;
	
	// 생성자 선언
	public CompanyContact(String name, String phoneNumber, String email, String address,
			String birthday, String group, String companyname, String companydepartment, String companylevel) {
		super(name, phoneNumber, email, address, birthday, group);
		this.companyName = companyname;
		this.companyDepartment = companydepartment;
		this.companyLevel = companylevel;
	}
	
	// 출력 메소드
	@Override
	protected void printInfo() {
		super.printInfo();
		System.out.println("회사이름 : "+companyName);
		System.out.println("부서이름 : "+companyDepartment);
		System.out.println("직급 : "+companyLevel);
	}
	
	protected String getCompanyName() {
		return companyName;
	}

	protected void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	protected String getCompanyDepartment() {
		return companyDepartment;
	}

	protected void setCompanyDepartment(String companyDepartment) {
		this.companyDepartment = companyDepartment;
	}

	protected String getCompanyLevel() {
		return companyLevel;
	}

	protected void setCompanyLevel(String companyLevel) {
		this.companyLevel = companyLevel;
	}
}
