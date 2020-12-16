package module2;

import java.util.Scanner;

public class bt11 {
	public void execute()
	{
		double x1,y1,x2,y2;
		Scanner sc=  new Scanner(System.in);
		System.out.println("Nhap toa diem x1 va y1");
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		System.out.println("Nhap toa do diem x2 va y2");
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		double distance=0;
		distance=Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
		System.out.println("Khoang cach giua 2 diem la: "+distance);
	}
}
