package bt60;

public class RightTriangle extends Shape {
	private int canhVuong;

	public int getCanhVuong() {
		return canhVuong;
	}

	public void setCanhVuong(int canhVuong) {
		if (canhVuong >= 1 && canhVuong <= 20)
			this.canhVuong = canhVuong;
	}
	public void draw()
	{
		super.draw();
		for(int i=1;i<=canhVuong;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
	}
	public RightTriangle(int n)
	{
		canhVuong=n;
	}
}
