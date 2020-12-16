package module2;

import java.util.Random;
import java.util.Scanner;

public class test_bt24 {
	public void execute()
	{
		boolean check=true;
		Scanner sc= new Scanner(System.in);
		double a,b,c;
		bt24 bt = new bt24();
		Random rd = new Random();
		while(check)
		{
			int so=rd.nextInt(2);
			if(so==0)
			{
				System.out.println("Nhap 2 so a va b: ");
				a=sc.nextDouble();
				b=sc.nextDouble();
				System.out.println("Gia tri trung binh 2 so la: "+bt.average(a, b));
			}
			else
			{
				System.out.println("Nhap 3 so a,b va c: ");
				a=sc.nextDouble();
				b=sc.nextDouble();
				c=sc.nextDouble();
				System.out.println("Gia tri trung binh 3 so la: "+bt.average(a, b, c));
			}
		}
	}
}
