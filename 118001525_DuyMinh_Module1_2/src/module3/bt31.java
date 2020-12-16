package module3;

public class bt31 {
	private double feet;
	private double inches;
	public bt31()
	{
		feet=inches=0.0;
	}
	public void calculte(int noofinches)
	{
		feet=noofinches/12;
		inches=noofinches%12;
		System.out.println("\n"+feet+" Feet and "+inches+" inches");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bt31 objdistance = new bt31();
		objdistance.calculte(150);
	}
}
