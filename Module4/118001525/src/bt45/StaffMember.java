package bt45;

public abstract class StaffMember {
	protected String name;
	protected String address;
	protected String phone;
	public abstract double pay();
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "StaffMember{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        ", phone='" + phone + '\'' +
        '}';
	}
}
