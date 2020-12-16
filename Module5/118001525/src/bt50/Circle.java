package bt50;

public class Circle {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea()
	{
		return Math.pow(Math.PI, 2)*radius;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ban kinh ht la: "+radius+", dien tich hinh tron la:"+getArea();
	}
}
