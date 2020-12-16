package bt50;

import java.util.ArrayList;
import java.util.Random;

public class CircleCollection {
	ArrayList<Circle>arrCircle;
	public void addCircle()
	{
		Circle data = new Circle();
		data.setRadius(new Random().nextDouble());
		arrCircle.add(data);
	}
	public int getSize()
	{
		return arrCircle.size();
	}
	public Circle getCircle(int n)
	{
		if(n>=0 && n<arrCircle.size())
			return arrCircle.get(n);
		else
			return null;
	}
	public void setCircle(int n)
	{
		Circle data = new Circle();
		data.setRadius(new Random().nextDouble());
		if(n>=0 && n<arrCircle.size())
			arrCircle.set(n, data);
	}
	double dienTichLonNhat=0,dienTichBeNhat=0;
	Circle cBe,cLon;
	public double tongDienTichHinhTron()
	{
		double output=0;
		dienTichBeNhat=arrCircle.get(0).getArea();
		dienTichLonNhat=arrCircle.get(0).getArea();
		for(int i=0;i<arrCircle.size();i++)
		{
			output+=arrCircle.get(i).getArea();
			if(dienTichBeNhat>=arrCircle.get(i).getArea())
			{
				cBe=arrCircle.get(i);
				dienTichBeNhat=arrCircle.get(i).getArea();
			}
			if(dienTichLonNhat<=arrCircle.get(i).getArea())
			{
				cLon=arrCircle.get(i);
				dienTichLonNhat=arrCircle.get(i).getArea();
			}
		}
		return output;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hinh Tron Be Nhat: "+cBe+"\nHinh tron lon nhat: "+cLon;
	}
	public CircleCollection()
	{
		arrCircle=new ArrayList<>();
		cBe=new Circle();
		cLon=new Circle();
		dienTichLonNhat=0;
		dienTichBeNhat=0;
	}
}
