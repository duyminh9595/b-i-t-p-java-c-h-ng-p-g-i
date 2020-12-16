package module2;

import java.util.Scanner;

public class bt22 {
	public int sumRange(int a,int b)
	{
		if(b<a)
		{
			System.out.println("Loi");
			return 0;
		}
		else
		{
			int sum=0;
			for(int i=a;i<=b;i++)
				sum+=i;
			return sum;
		}
	}
	public void execute()
	{
		int a,b;
		boolean check=true;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Nhap lan luot 2 so a va b: ");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Tong cua cac gia tri trong khoang tu "+a+" den "+b+" la "+sumRange(a, b));
		}
	}
}
