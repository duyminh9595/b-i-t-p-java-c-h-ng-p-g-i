package bt60;

public class Rectangle extends Shape {
	private int dai;
	private int rong;

	public int getDai() {
		return dai;
	}
	public Rectangle(int a,int b)
	{
		dai=a;
		rong=b;
	}
	public void setDai(int dai) {
		if (dai >= 1 && dai <= 15)
			this.dai = dai;
	}

	public int getRong() {
		return rong;
	}

	public void setRong(int rong) {
		if (rong >= 1 && rong <= 15)
			this.rong = rong;
	}
	public void draw()
	{
		super.draw();
		for(int i=1;i<=dai;i++)
			System.out.print("*");
		System.out.println();
		for(int i=2;i<=rong-1;i++)
		{
			for(int j=1;j<=dai;j++)
			{
				if(j==1 || j==dai)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		if(rong!=1)
		{
			for(int i=1;i<=dai;i++)
				System.out.print("*");
		}
	}
}
