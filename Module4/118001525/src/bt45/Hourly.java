package bt45;

public class Hourly extends Employee {
	private int hoursWorked;
	public void addHours(int moreHours)
	{
		hoursWorked+=moreHours;
	}
	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return super.pay()+500*hoursWorked;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  super.toString()+"hoursWorked=" + hoursWorked+",Pay: "+pay() ;
	}
}
