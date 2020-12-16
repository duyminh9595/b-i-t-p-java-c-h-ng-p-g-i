package bt57;

public class Vehicle {
	private int numOfWheels;
	public Vehicle(int x)
	{
		numOfWheels=x;
	}
	public void drive() {
		System.out.println("Driving a vehicle");
	}
	public int getNumOfWheels() {
		return numOfWheels;
	}
	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}
	
}
