package bt58;

import java.text.DecimalFormat;

public class Circle extends Point {
	private double radius;
	public Circle()
	{
		super();
		radius=0;
	}
	public Circle(int xValue,int yValue,int radiusValue)
	{
		super(xValue,yValue);
		radius=radiusValue;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getDiameter()
	{
		return radius*2;
	}
	public double getCircumference()
	{
		return getDiameter()*Math.PI;
	}
	public double getArea()
	{
		return Math.pow(Math.PI, 2)*radius;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ban Kinh: "+radius+", Dien tich: "+ new DecimalFormat("0.##").format(getArea())+", Chu vi: "
				+new DecimalFormat("0.##").format(getCircumference());
	}
}
