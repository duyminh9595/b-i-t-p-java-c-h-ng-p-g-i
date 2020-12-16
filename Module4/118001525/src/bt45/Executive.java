package bt45;

public class Executive extends Employee {
	private double bonus;
	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return super.pay()+bonus;
	}
	public void awardBonus(double execBonus)
	{
		bonus+=execBonus;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"Bonus"+bonus+",pay"+pay();
	}
}
