package bt44;

public class Man extends Person {
	private Boolean WatchingFootBall;
	
	public void watchFootBall()
	{
		WatchingFootBall=true;
	}
	public boolean isWatchingFootball()
	{
		return WatchingFootBall;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ten: "+getFirstname()+", Nhom mau: "+
				blood.getBloodGroup()+", Tuoi: "+getAgeAsDays()+", dia chi: "+dcNha.getPostcode()+", co dang xem ti vi khong: "
				+isWatchingFootball();
	}
	public Man()
	{
		super();
		WatchingFootBall=false;
	}
	@Override
	public void setFirstname(String firstname) {
		// TODO Auto-generated method stub
		this.firstname=firstname;
	}
}
