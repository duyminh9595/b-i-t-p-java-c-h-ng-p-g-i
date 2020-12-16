package bt45;

public class Volunteer extends StaffMember {
	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return 100;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+",Pay:"+pay();
	}
}
