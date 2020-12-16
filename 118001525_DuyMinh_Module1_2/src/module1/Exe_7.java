package module1;

import java.util.Scanner;

public class Exe_7 {
	public void execute()
	{
		double a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap lan luot so a va b: ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		System.out.println("Ket qua phuong trinh: "+a+"x+"+b+"=0 l a"+(-b/a));
	}
}
