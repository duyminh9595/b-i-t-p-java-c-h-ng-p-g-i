package module2;

import java.util.Scanner;

public class bt18 {
	public double bpCuaX(double x)
	{
		return Math.pow(x, 2);
	}
	public void execute()
	{
		boolean check=true;
		double n;
		Scanner sc= new Scanner(System.in);
		while(check)
		{
			System.out.println("Nhap x: ");
			n=sc.nextDouble();
			System.out.println("Binh phuong cua "+n+ " la: "+bpCuaX(n));
		}
	}
}
