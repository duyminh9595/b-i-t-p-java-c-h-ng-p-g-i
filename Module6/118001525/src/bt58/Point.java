package bt58;

public class Point {
	private int x;
	private int y;
	public Point()
	{
		x=y=0;
	}
	public Point(int xValue,int yVlaue)
	{
		x=xValue;
		y=yVlaue;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+x+","+y+")";
	}
}
