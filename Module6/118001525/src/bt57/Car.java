package bt57;

public class Car extends Vehicle {
	private int numOfDoors;
	public Car(int d,int w)
	{
		super(w);
		numOfDoors=d;
	}
	public void drive()
	{
		System.out.println("Driving a car");
	}
	public int getNumOfDoors() {
		return numOfDoors;
	}
	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}
	
}
