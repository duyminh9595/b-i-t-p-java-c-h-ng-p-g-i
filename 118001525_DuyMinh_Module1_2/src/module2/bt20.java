package module2;

import java.util.Scanner;

public class bt20 {
	public void execute()
	{
		double a,b,c,delta;
		System.out.println("Lan luot nhap a,b,c: ");
		Scanner sc =new Scanner(System.in);
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		delta = Math.pow(b, 2)-4*a*c;
		if(delta<0)
			System.out.println("Phuong trinh vo nghiem");
		if(delta==0)
			System.out.println("Phuong trinh co nghiem kep: "+(-b/(2*a)));
		if(delta>0)
		{
			System.out.println("Nghiem 1 la: "+((-b+Math.sqrt(delta))/(2*a)));
			System.out.println("Nghiem 2 la: "+((-b-Math.sqrt(delta))/(2*a)));
		}
		
	}
}
