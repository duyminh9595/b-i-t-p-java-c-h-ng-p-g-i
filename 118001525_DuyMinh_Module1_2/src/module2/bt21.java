package module2;

import java.util.Scanner;

public class bt21 {
	public void alarm(int n)
	{
		if(n<1)
			System.out.println("Loi");
		else
		{
			for(int i=1;i<=n;i++)
				System.out.println("Alarm!");
		}
	}
	public void execute()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n=sc.nextInt();
		alarm(n);
	}
}
