package AssociationRelationship;

public class Phone {
	private String phones;
	private String homePhones;
	private String officephones;

	protected String getPhones() {
		return phones;
	}
	protected void setPhones(String phones) {
		this.phones = phones;
	}
	protected String getHomePhones() {
		return homePhones;
	}
	protected void setHomePhones(String homePhones) {
		this.homePhones = homePhones;
	}
	protected String getOfficephones() {
		return officephones;
	}
	protected void setOfficephones(String officephones) {
		this.officephones = officephones;
	}
}