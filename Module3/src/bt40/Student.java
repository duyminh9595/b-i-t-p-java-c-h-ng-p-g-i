package bt40;

public class Student {
	private String firstName;
	private String lastName;
	private Address homeAddress;
	private Address schoolAddress;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getSchoolAddress() {
		return schoolAddress;
	}
	public void setSchoolAddress(Address schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "firstName: "+firstName+",lastName: "+lastName+"\nhomeAddress:\n"+homeAddress
				+"\nschoolAddress:\n"+schoolAddress;
	}
}
