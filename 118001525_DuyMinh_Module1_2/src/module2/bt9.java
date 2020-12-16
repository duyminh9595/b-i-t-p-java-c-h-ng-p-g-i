package module2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class bt9 {
	public void execute()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ban kinh r(r>0)");
		double r=0;
		do
		{
			r=sc.nextDouble();
			if(r<=0)
				System.out.println("Nhap lai r. ");
		}
		while(r<=0);
		sc.nextLine();
		double dientich=0,thetich=0;
		dientich=4*Math.PI*Math.pow(r, 2);
		thetich=4*Math.PI*Math.pow(r, 3)/3;
		System.out.println("The tich la: "+ new DecimalFormat("0.####").format(thetich));
		System.out.println("Dien tich la: "+ new DecimalFormat("0.####").format(dientich));
		
	}
}
