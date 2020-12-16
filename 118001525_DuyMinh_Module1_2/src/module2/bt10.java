package module2;

import java.util.Scanner;

public class bt10 {
	public void execute()
	{
		double a,b,c;
		Scanner sc =new Scanner(System.in);
		System.out.println("Nhap lan luot 3 canh cua tam giac: ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		double s=(a+b+c)/2;
		double dientich=0;
		dientich=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Dien tich : "+dientich);
	}
}
