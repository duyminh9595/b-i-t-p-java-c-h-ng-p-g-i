package bt45;

public class Employee extends StaffMember {

	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return 2000*payRate;
	}

	protected String socialSecurityNumber;
	protected double payRate;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "{SocialSecurityNumber='" + socialSecurityNumber + '\'' + ", payRate=" +payRate
				+ '}';
	}
}
