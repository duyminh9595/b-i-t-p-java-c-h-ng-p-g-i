package bt44;

public class Woman extends Person {
	private boolean WearingMakeup;
	public void putMakeupOn()
	{
		WearingMakeup=true;
	}
	public boolean isWearingMakeup()
	{
		return WearingMakeup;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ten: "+getFirstname()+", Nhom mau: "+
				blood.getBloodGroup()+", Tuoi: "+getAgeAsDays()+", dia chi: "+dcNha.getPostcode()+", co dang xem ti vi khong: "
				+WearingMakeup;
	}
	public Woman()
	{
		super();
		WearingMakeup=false;
	}
	@Override
	public void setFirstname(String firstname) {
		// TODO Auto-generated method stub
		this.firstname=firstname;
	}
}
